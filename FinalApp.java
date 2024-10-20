class A{
   final void show()
   {
      System.out.println("I am A show method.");
   }
}
 
class B extends A
{
   void display()
   {
      System.out.println("I am B show method.");
   }
}
public class FinalApp
{
   public static void main(String[] args)
   {
       B b=new B();
       b.show();
   }
}