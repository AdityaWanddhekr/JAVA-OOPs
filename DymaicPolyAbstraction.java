abstract class Value
{
   int a;
   int b;
   void getData(int a,int b)
   {
       this.a=a;
       this.b=b;
   }

   abstract int getResult();
}

class Add extends Value
{
   int getResult()
   {
      return a+b;
   }
}

class Sub extends Value
{
   int getResult()
   {
      return a-b;
   }
}

class Mul extends Value
{
   int getResult()
   {
      return a*b;
   }
}

class Div extends Value
{
   int getResult()
   {
      return a/b;
   }
}


public class DymaicPolyAbstraction
{
     public static void main(String[] args)
     {
         Value v=null;
       
         v=new Add();
         v.getData(12,2);
         System.out.println("Addition = "+v.getResult());
         v=new Sub();
         v.getData(12,2);
         System.out.println("Substraction = "+v.getResult());
         v=new Mul();
         v.getData(12,2);
         System.out.println("Multiplication = "+v.getResult());
         v=new Div();
         v.getData(12,2);
         System.out.println("Division = "+v.getResult());
     }
}