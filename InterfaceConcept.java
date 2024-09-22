interface Shape {

    //Abstract methods: are those methods which dont have a body
    
    double CalculateArea();
    double CalculatePerimeter();
}

// Implementing the shape interface in Circle class

class Circle1 implements Shape
{
    private double radius;

    Circle1(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double CalculateArea()
    {
        return 3.14 * radius *radius;
    }

    @Override
    public double CalculatePerimeter()
    {
        return 2 * 3.14 * radius;
    }
}

// Implementing the shape interface in Rectangle class

class Rectangle implements Shape
{
    private double length;
    private double breadth;

    Rectangle(double l, double b)
    {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double CalculateArea()
    {
        return length * breadth;
    }

    @Override
    public double CalculatePerimeter()
    {
        return 2 * (length + breadth);
    }
}
 

public class InterfaceConcept 
{

    public static void main(String[] args) {

        Shape circle = new Circle1(5);
        System.out.println("The area and perimeter of circle are respectively as follows: ");
        System.out.println("Area: " + circle.CalculateArea());
        System.out.println("Perimeter: " + circle.CalculatePerimeter());

        Shape rectangle = new Rectangle(2,3);
        System.out.println("The area and perimeter of rectangle are respectively as follows: ");
        System.out.println("Area: " + rectangle.CalculateArea());
        System.out.println("Perimeter: " + rectangle.CalculatePerimeter());
        
    }
}
