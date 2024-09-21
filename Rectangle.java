public class Rectangle {

    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        
        this.length = length;
        this.breadth = breadth;
        // Remove or comment out these lines:
        // length = 10;
        // breadth = 5;
    }
    
    public void printDetails()
    {
        System.out.println("the length of rectangle is: "+length);
        System.out.println("the breadth of rectangle is: "+breadth);
    }

  /*   public void setDetails()
    {
        length = 2.5;
        breadth = 1.5;
    }*/

    public double Area()
    {
        double area = length * breadth;
        return area;
    }
    public static void main(String[] args) {
        double l = 5;
        double b = 3;

        Rectangle obj = new Rectangle(l, b);
       // obj.setDetails();
        
        obj.printDetails();
        System.out.println("the area of the rectangle is: "+obj.Area());
        
    }
    
}
