public class CircleApp
{
    /*
      WAP to find circumference and area of circle using two different 
      classes called Circumference & Area by inheriting a Class called PI .
      Inherit the value of PI as private data member and set the value
      to PI using private member function.
    */

    public static void main(String[] args)
    {
        CircumferenceApp c=new CircumferenceApp();
        double cir=c.getCircum(3.14,2);
        System.out.println("The Circumferce is : "+cir);
        CAreaApp a=new CAreaApp();
        double area=a.getArea(3.14,2);
        System.out.println("The Area is : "+area);

    }
}