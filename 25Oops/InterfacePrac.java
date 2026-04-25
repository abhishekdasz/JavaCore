interface Animal 
{
    void run();
    void eat();

    default void sleep()
    {
        System.out.println("Animal is sleeping.");
    }
}
class Tiger implements Animal
{
    @Override
    public void run()
    {
        System.out.println("Tiger is running.");
    }
    @Override 
    public void eat()
    {
        System.out.println("Tiger is eating.");
    }
}
class Deer implements Animal
{
    @Override
    public void run()
    {
        System.out.println("Deer is running.");
    }
    @Override 
    public void eat()
    {
        System.out.println("Deer is eating.");
    }
}
public class InterfacePrac 
{
    public static void main(String[] args) 
    {
        Animal a = new Tiger();
        a.run();
        a.eat();
        a.sleep();

        a = new Deer();
        a.eat();
        a.run();
        a.sleep();
    }
}
