interface IRegister {

    void register ();
}

interface IVehicle extends IRegister{

    void start();
    void stop();
}

class Car implements IVehicle {

    public void start() {

        System.out.println("\nStart Car");
    }
    public void stop() {

        System.out.println("\nStop Car");
    }
    public void register() {

        System.out.println("\nRegister Car");
    }
}

class Bike implements IVehicle {

    public void start() {

        System.out.println("\nStart Bus");
    }
    public void stop() {

        System.out.println("\nStop Bus");
    }
    public void register() {

        System.out.println("\nRegister Bus");
    }
}

class RegVehicle {
    
    public static void main(String[] args) {
        
        IVehicle c = new Car();
        IVehicle b = new Bike();

        c.start();
        c.stop();
        c.register();

        b.start();
        b.stop();
        b.register();
    }
    
}