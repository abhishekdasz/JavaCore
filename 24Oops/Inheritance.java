class Vehicle
{
    public String brand;
    public String model;

    public void startEngine()
    {
        System.out.println(brand+":"+model+ " engine starts");
    }
    public void stopEngine()
    {
        System.out.println(brand+":"+model+ " engine stops");
    }        
}
class Car extends Vehicle
{
    int mileage;
}
class Bike extends Vehicle
{
    int mileage;
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.brand = "Tata";
        c.model = "Punch";
        c.startEngine();
        c.stopEngine();

        Bike b = new Bike();
        b.brand = "Honda";
        b.model = "Activa";
        b.startEngine();
        b.stopEngine();
        b.mileage = 50;

        System.out.println("The average of "+b.brand+b.model +" is:"+ b.mileage);
    }
}
