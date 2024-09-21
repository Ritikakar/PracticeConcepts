import java.util.Scanner;

public class BasicArithmeticMethods{

    double div = 0;

    public double add(double a, double b){
        double sum = a+b;
        return sum;
    }

    public double difference(double a, double b)
    {   double diff = 0;
        if(a>b){
            diff = a - b;
        }
        else {
            diff = b - a;
        }
        return diff;
        
    }

    public double product(double a, double b)
    {
        double prod = a * b;
        return prod;
    }

    public double division(double a , double b)
    {   
        if(b == 0){
            System.out.println("division by 0 not possible");
            return Double.NaN; // Return Not-a-Number for division by zero
        }else {
            div = a / b;
        }
        
        return div;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        double x = sc.nextDouble();
        System.out.println("enter the second number");
        double y = sc.nextDouble();
        BasicArithmeticMethods obj = new BasicArithmeticMethods();

        
        System.out.println("the sum of two numbers is : "+obj.add(x,y));
        System.out.println("the difference of two numbers is : "+obj.difference(x,y));
        System.out.println("the product of two numbers is : "+obj.product(x,y));
        System.out.println("the division of two numbers is : "+obj.division(x,y));

sc.close();
    }
}