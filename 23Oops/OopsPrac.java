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

class Student
{
    int stud_id;
    String stud_name;
}

public class OopsPrac {
    public static void main(String[] args) {
        System.out.println("hello world");

        Employee e = new Employee("Abhishek", 21);
        System.out.println(e.emp_name);
        System.out.println(e.emp_id);


        Student s = new Student();
        System.out.println(s.stud_id);
        System.out.println(s.stud_name);
        
        s.stud_id = 10;
        s.stud_name = "Das";

        System.out.println(s.stud_id);
        System.out.println(s.stud_name);
    }
}
