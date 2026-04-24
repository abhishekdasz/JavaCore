class Employee
{
    public String name;
    public int id;
    private int age;
    private String homeTown;

    Employee(String emp_name, int emp_id, int emp_age) 
    {
        this.name = emp_name; 
        this.id = emp_id;
        this.age = emp_age;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int emp_age)
    {
        this.age = emp_age;
    }
}
class Encapsulation
{
    public static void main(String[] args) 
    {
        Employee e = new Employee("Abhishek", 10, 24);
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.getAge());

        e.name = "Abhishek Das";
        System.out.println(e.name);
        
        e.setAge(23);
        System.out.println(e.getAge());

    }
}