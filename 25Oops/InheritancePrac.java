class CabBooking
{
    private String brand;
    private String model;

    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }

    public CabBooking(String cab_brand, String cab_model)
    {
        this.brand = cab_brand;
        this.model = cab_model;
    }

    protected void displayInfo()
    {
        System.out.println("Your cab booked successfully "+brand + " " + model);
    }
}
class CarBook extends CabBooking
{
    private int noOfSeats;

    public CarBook(String car_brand, String car_model, int car_noOfSeats)
    {
        super(car_brand, car_model);
        this.noOfSeats = car_noOfSeats;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Seats: "+noOfSeats);
    }
}
class BikeBook extends CabBooking
{
    private boolean ishelmetIncluded;

    BikeBook(String bike_brand, String bike_model, boolean bike_isHelmetIncluded)
    {
        super(bike_brand, bike_model);
        this.ishelmetIncluded = bike_isHelmetIncluded;
    }
    protected void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Is Helmet included: "+ishelmetIncluded);
    }
}
class InheritancePrac 
{
    public static void main(String[] args)
    {
        CarBook cb = new CarBook("Maruti", "Dzire", 2);
        cb.displayInfo();

        BikeBook bb = new BikeBook("Hero", "Splendor", true);
        bb.displayInfo();
    }
}