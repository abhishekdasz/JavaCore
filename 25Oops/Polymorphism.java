class Calculator
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    static double add(int a, double b)
    {
        return a+b;
    }
}
class Shape
{
    public void drawShape()
    {
        System.out.println("Generic shape drawing...");
    }
}
class Circle extends Shape
{
    public void drawShape()
    {
        System.out.println("Circle shape drawing...");
    }
}
class Polymorphism 
{
    public static void doDrawing(Shape s)
    {
        s.drawShape();
    }
    public static void main(String[] args) 
    {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 11.5));
        System.out.println(c.add(5, 8));

        Shape s =new Shape();
        s.drawShape();

        Circle ci = new Circle();
        ci.drawShape();

        doDrawing(s);
        doDrawing(ci);
    }
}