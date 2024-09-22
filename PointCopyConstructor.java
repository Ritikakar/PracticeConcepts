public class PointCopyConstructor {

    private int x;
    private int y;

    PointCopyConstructor(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
//copy constructor
    PointCopyConstructor(PointCopyConstructor point)
    {
        this.x = point.x;
        this.y = point.y;
    }

    public int get_x()
    {
        return  x;
    }
    public int get_y()
    {
        return y;
    }

    public void details()
    {
        System.out.println("Point(" +x+ " , " +y+")");
    }
    public static void main(String[] args) {
        PointCopyConstructor obj = new PointCopyConstructor(4,5);
        
        System.out.println("original: ");
        obj.details();

        PointCopyConstructor obj1 = new PointCopyConstructor(obj);// make the obj of original constructor the parameter of copy constuctor
        System.out.println("copy:");
        obj1.details();
        
    }
}