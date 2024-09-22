import java.util.Scanner;
public class Circle  {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(int diameter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of diameter in integer:");
        this.radius = sc.nextInt() / 2.0;
        sc.close();
    }

    public double Area() {
        return Math.PI * (radius * radius);
    }

    public double Area(int diameter) {
        double radius = diameter / 2.0;
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle obj = new Circle(4.2);
        System.out.println("The area of first circle is: " + obj.Area());

        Circle obj1 = new Circle(0);
        System.out.println("The area of second circle is: " + obj1.Area());
    }
}
