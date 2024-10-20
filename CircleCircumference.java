public class CircleCircumference
{
    public static void main(String[] args)
    {
        int r=2;
        CircleArea c=new CircleArea();
        System.out.println("Area = "+c.getArea(r));
        Circumference cf=new Circumference();
        System.out.println("Circumference = "+cf.getCircumference(r));

    }
}