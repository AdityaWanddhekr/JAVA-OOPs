public class AreaApp
{
    public static void main(String[] args)
    {
        Circle c=new Circle();

        c.setRedius(2);
        c.showArea();

        Rectangle r=new Rectangle();
     
        r.getData(3,3);
        r.showArea();
    }
}