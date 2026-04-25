class CabBooking
{
    private String brand;
    private String model;

    CabBooking(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo()
    {
        System.out.println("Your cab successfully booked.");
        System.out.println("Cab Details: "+brand +" "+model);
    }
    double calculateFare(int distance)
    {
        return 0;
    }
}
class CarBook extends CabBooking
{
    private int noOfSeats;

    CarBook(String car_brand, String car_model, int car_noOfSeats)
    {
        super(car_brand, car_model);
        this.noOfSeats = car_noOfSeats;
    }

    @Override
    double calculateFare(int distance) 
    {
        if(noOfSeats>4)
        {
            return distance * 12;
        }
        else
        {
            return distance*10;
        }
    }
}
class BikeBook extends CabBooking
{
    private boolean isHelmetIncluded;

    BikeBook(String brand, String model, boolean isHelmetIncluded)
    {
        super(brand, model);
        this.isHelmetIncluded = isHelmetIncluded;
    }
    @Override
    double calculateFare(int distance)
    {
        if(isHelmetIncluded)
        {
            return distance * 6;
        }
        else
        {
            return distance*5;
        }
    }
}
public class Oops
{
    public static void main(String[] args) 
    {
        CabBooking ride = new CarBook("Suzuki", "Dzire", 5);
        ride.displayInfo();
        System.out.println(ride.calculateFare(60));

        CabBooking bikeride = new BikeBook("Hero", "Splendor", true);
        bikeride.displayInfo();
        System.out.println(bikeride.calculateFare(15)); 
    }
}
