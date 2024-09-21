public class Student {

    long stu_ID;
    String stu_name;
    double mark_s1;
    double mark_s2;
    double mark_s3;

    public void printDetails()
    {
        System.out.println("Student ID: "+stu_ID);
        System.out.println("Student name: "+stu_name);
        System.out.println("mark in first subject: "+mark_s1);
        System.out.println("mark in second subject: "+mark_s2);
        System.out.println("mark in third subject: "+mark_s3);
    }

    public void getDetails(long stu_ID,String stu_name, double mark_s1, double mark_s2, double mark_s3)
    {
        this.stu_ID = stu_ID;
        this.stu_name = stu_name;
        this.mark_s1 = mark_s1;
        this.mark_s2 = mark_s2;
        this.mark_s3 = mark_s3;
    }

    public void setDetails()
    {
        stu_ID = 2041011008;
        stu_name = "Ritika Kar";
        mark_s1 = 95;
        mark_s2 = 90;
        mark_s3 = 97;
    }
   

    public double AverageMarks()
    {
        double sum = mark_s1 + mark_s2 + mark_s3;
        double average = sum/3;
        return average;
    }

    public static void main(String[] args) {

        Student obj = new Student();
        obj.getDetails(0, null, 0, 0, 0);
        System.out.println("the details of the student are as follows: ");
        obj.setDetails();
        obj.printDetails();
        System.out.println("the average mark of student is: "+obj.AverageMarks());
        
    }
    
}
