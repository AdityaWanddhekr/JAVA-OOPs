abstract class A
{
   abstract void show();
}

class B extends A
{
   void show()
   {
      System.out.println("I am show method of A");
   }
}
public class ClassWithInInterface
{
  public static void main(String[] args)
  {
      B b=new B();
      b.show();
  }
}