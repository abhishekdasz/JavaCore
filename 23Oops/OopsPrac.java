class Employee 
{
    String emp_name;
    int emp_id;

    Employee(String name, int id) 
    {
        this.emp_name = name;
        this.emp_id = id;
    }
}

public class OopsPrac {
    public static void main(String[] args) {
        System.out.println("hello world");

        Employee e = new Employee("Abhishek", 21);
        System.out.println(e.emp_name);
        System.out.println(e.emp_id);
    }
}
