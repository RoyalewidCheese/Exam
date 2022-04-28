import java.util.Random;

class NumberStore{
    private int number;
    int getNumber(){
        return number;
    }
    void setNumber(int n){
        number = n;
    }
}
class NumberGenerator extends Thread{
    NumberStore nStore;
    NumberGenerator(NumberStore ns){
         nStore = ns;
    }
    public void run(){
        Random vand = new Random();
        while(true){
            try{    
                int number = vand.nextInt(100);
                nStore.setNumber(number);
                System.out.println("[GEN]: "+number);
                synchronized(nStore){
                    nStore.notifyAll();
                    Thread.sleep(1000);
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}

class NumberSquare extends Thread{
    NumberStore nstore;
    NumberSquare(NumberStore num){
        nstore = num;
    }
    public void run(){
        int n = 0;
        while(true){
            synchronized(nstore){
                try{
                    nstore.wait();
                }catch(Exception e){
                    System.out.println("[SQR]: "+e);
                }
                n = nstore.getNumber();
                System.out.println("[SQR]: "+ n*n);
            }
        }
    }
}

class NumberCube extends Thread{
    NumberStore nstore;
    NumberCube(NumberStore n){
        nstore  = n;
    }
    public void run(){
        while(true){
            synchronized(nstore){
                try{
                    nstore.wait();
                }catch(Exception exp){
                    System.out.println("[CUBE]: "+exp);
                }
                int n = nstore.getNumber();
                System.out.println("[CUBE]: "+n*n*n);
            }
        }
    }
}


public class threadSync {
    public static void main(String[] args) {
        NumberStore ns = new NumberStore();
        NumberGenerator t1 = new NumberGenerator(ns);
        t1.start();

        NumberSquare t2 = new NumberSquare(ns);
        t2.start();

        NumberCube t3 = new NumberCube(ns);
        t3.start();
    }
}
