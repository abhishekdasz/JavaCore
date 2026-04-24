class Vehicle
{
    private String brand;
    private String model;
    private int speed;

    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brandName)
    {
        this.brand = brandName;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String modelName)
    {
        this.model = modelName;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int topSpeed)
    {
        this.speed = topSpeed;
    }
    public static void dispalyInfo()
    {
        System.out.println();
    }
}

class Car extends Vehicle
{
    String fuelType; 
}
class Bike extends Vehicle
{
    boolean hasGear;
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.setBrand(("Tata"));
        c.setModel( " Punch");
        c.setSpeed(180);
        System.out.println(c.getBrand()+c.getModel()+" has top speed of "+c.getSpeed());
        

        Bike b =new Bike();
        b.setBrand("Honda");
        b.setModel(" Activa");
        b.setSpeed(100);
        System.out.println(b.getBrand()+b.getModel()+" has top speed of "+b.getSpeed());
    }
}
