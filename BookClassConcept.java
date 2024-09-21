import java.util.*;
public class BookClassConcept {

    String title;
    String author;
    double price;

    public void getDetails(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of book: ");
        title = sc.nextLine();
        System.out.println("enter the author's name: ");
        author = sc.nextLine();//"Ms. Ritika Kar";
        System.out.println("enter the price of book: ");
        price = sc.nextDouble();//200.00;

        sc.close();
    }
    public static void main(String[] args) {


        BookClassConcept obj = new BookClassConcept();
        obj.getDetails(null, null, 0);;
        obj.setDetails();

         // Print the details set by setDetails()
         System.out.println("Book Title: " + obj.title);
         System.out.println("Author: " + obj.author);
         System.out.println("Price: $" + obj.price);

        
        
        
        
    }
}