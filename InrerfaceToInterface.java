interface A
{
   void show();
}
interface B extends A
{
    void display();
}
class C implements B
{
    public void show()
    {
        System.out.println("I am show method of interface A");
    }
    public void display()
    {
        System.out.println("I am display method of interface B");
    }
}
public class InrerfaceToInterface
{
   public static void main(String[] args)
   {
      C c=new C();
      c.show();
      c.display();
   }

}