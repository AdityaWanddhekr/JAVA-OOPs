interface A{
  void show();
}
class B implements A
{
   public void show()
   {
     System.out.println("I am show method of interface override.");
   }
}
public class Interface
{
    public static void main(String[] args)
    {
         B b=new B();
         b.show();
    }
}