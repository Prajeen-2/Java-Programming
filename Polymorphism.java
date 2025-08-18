class Vehicle {
    public void drive() {
        System.out.println("Driving vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Bike");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();   
        v.drive();                

        Vehicle a = new Car();
        a.drive();                

        Vehicle b = new Vehicle();
        b.drive();                
    }
}
