interface A
{
    float pi;
    void show();
}
class B implements A
{
   public void show()
   {
       System.out.println("I am show method with public static final interface variable pi = "+pi);
   }
}
public class VariableInterface
{
   public static void main(String[] args)
   {
      B b=new B();
      b.show();
   }
}