import java.util.Scanner;
class Person
{
    String name;
    int age;

    // Parameterized constructor for Person.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Work()
    {
        System.out.println(name + " works at a firm. ");
    }

    public void print_details()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person
{
    String employeeID;
    String department;
    String company;

    Employee(String name, int age, String id, String dept)
    {   
        super(name, age); // super() becomes necessary here to call the parameterized constructor of Person
        this.employeeID = id;
        this.department = dept;
    }

    public String details_ID()
    {
        return employeeID;
    }

    public String details_dept()
    {
        return department;
    }

    @Override
    public void Work()
    {
        company = "XYZ";
        System.out.println("works at " + company);
    }
}

public class InheritanceConcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter employee ID:");
        String id = sc.nextLine();
        System.out.println("Enter department:");
        String dept = sc.nextLine();
        System.out.println("=============================D E T A I L S=================================");

        Employee obj = new Employee(name, age, id, dept);
        obj.print_details();
        obj.Work();
        System.out.println("The employee id " + obj.details_ID() + " and department is " + obj.details_dept());
        sc.close();
    }
}
