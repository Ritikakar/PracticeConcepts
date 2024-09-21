import java.util.Scanner;
public class CalculatorOverloadingConcept {

    public int Add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public double Add(double n1, double n2)
    {
        double sum = n1 + n2;
        return sum;
    }

    public String Add(String str1, String str2)
    {
        String string = str1 + str2;
        return string;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integer numbers one by one to find their sum:");
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();

        System.out.println("enter two decimal numbers one by one to find their sum:");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        sc.nextLine(); // Consume the newline left-over
        System.out.println("enter two strings one by one to join them:");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();

        CalculatorOverloadingConcept obj = new CalculatorOverloadingConcept();
        System.out.println("sum of two integer numbers are: "+obj.Add(first_number, second_number));
        System.out.println("Sum of two floating point numbers is: "+obj.Add(number1, number2));
        System.out.println("The concatenated string is: "+obj.Add(string1, string2));
        
        sc.close();

    }
    
}
