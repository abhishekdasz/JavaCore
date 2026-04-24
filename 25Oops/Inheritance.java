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
    public void dispalyInfo()
    {
        System.out.println(brand+" "+model+" has top speed of "+speed);
    }
}

class Car extends Vehicle
{
    private String fuelType; 
    public String getFuelType()
    {
        return fuelType;
    }
    public void setFuelType(String car_fuelType)
    {
        fuelType = car_fuelType;
    }
    public void dispalyInfo()
    {
        super.dispalyInfo();
        System.out.println("Fuel type: "+getFuelType());
    }
}
class Bike extends Vehicle
{
    private boolean hasGear;
    public boolean getHasGear()
    {
        return hasGear;
    }
    public void setHasGear(boolean bike_hasGear)
    {
        hasGear = bike_hasGear;
    }
    public void dispalyInfo()
    {
        super.dispalyInfo();
        System.out.println("Has gear: "+hasGear);
    }
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.setBrand(("Tata"));
        c.setModel( " Punch");
        c.setSpeed(180);
        c.setFuelType(" Petrol variant");
        c.dispalyInfo();
        

        Bike b =new Bike();
        b.setBrand("Honda");
        b.setModel(" Activa");
        b.setSpeed(100);
        b.setHasGear(false);
        b.dispalyInfo();
    }
}
