final class A
{
    void show()
   {
      System.out.println("I am A show()");
   }
}
class B extends A
{
    void show()
   {  
      System.out.println("I am B show()");
   }
}
public class Overrideing
{
    public static void main(String[] args)
    {
         B b=new B();
         b.show();
    }
}