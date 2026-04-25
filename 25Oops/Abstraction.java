abstract class Bird
{
    abstract void fly();
    abstract void eat();
}
class Sparrow extends Bird
{
    @Override
    void fly()
    {
        System.out.println("Sparrow is flying.");
    }
    @Override 
    void eat()
    {
        System.out.println("Sparrow is eating.");
    }
}
class Crow extends Bird
{
    @Override
    void fly()
    {
        System.out.println("Crow is flying.");
    }
    @Override 
    void eat()
    {
        System.out.println("Crow is eating.");
    }
}
public class Abstraction 
{
    public static void main(String[] args) 
    {
        Bird b = new Sparrow();
        b.fly();
        b = new Crow();
        b.fly();
        Sparrow s = new Sparrow();
        s.eat();
    }    
}
