//Rathul krishnan R
//46

class Exception {
    public static void main(String args[]) {

        int val1, val2;
        try {

            System.out.print("Enter two numbers : ");
            val1 = 0;
            val2 = 25 / val1;
            System.out.println("Two numbers divided : " + val2);
        }
        catch (ArithmeticException e) { 

            System.out.println("ArithmeticException - Divide by Zero!!");
        }
        System.out.println("Outside try-catch");
    }
 }