class Value{
    int a;
    int b;
    void getData(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int getResult(){
       return 0;
    }
}
class Add extends Value{
    int getResult()
    {
       return a+b;
    }
}
class Mul extends Value
{
    int getResult()
    {
       return a*b;
    }

}
public class DynamicPolyApp
{
    public static void main(String[] args)
    {
         Value v=null;
 
         v=new Add();
         v.getData(10,20);
         System.out.println("Sum = "+v.getResult());
 
         v=new Mul();
         v.getData(10,20);
         System.out.println("Sum = "+v.getResult());

    }
}