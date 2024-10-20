abstract class Vehicle{
    abstract void engineType();
}

class Car extends Vehicle{
    void engineType()
    {
        System.out.println("Car has 3000 cc Engine");
    }
}

class Bike extends Vehicle{
    void engineType()
    {
       System.out.println("Bike has 1000 cc Engine");
    }
}

public class VehicleAbstractApp
{
    public static void main(String[] args)
    {
        Car c=new Car();
        c.engineType();
        Bike b=new Bike();
        b.engineType();
    }
}