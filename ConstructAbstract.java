abstract class value
{
    int a;
    int b;
   value(int a,int b)
   {
       this.a=a;
       this.b=b;
   }

   abstract int getResult();
}

class Add extends value
{
   Add(){
      super(12,2);

   }
   int getResult()
   { 
       return a+b;
   }
}

class Sub extends value
{
   Sub(){
      super(12,2);

   }

    int getResult()
    {
         return a-b;
    }
}

class Mul extends value
{

    Mul(){
      super(12,2);

   }

    int getResult()
    {
       
       return a*b;
    }
}

class Div extends value
{
    Div(){
      super(12,2);

   }

    int getResult()
    {
       
       return a/b;
    }
}

public class ConstructAbstract
{
   public static void main(String[] args)
   {
       Add a=new Add();
       System.out.println("Add = "+a.getResult());
       Mul m=new Mul();
       System.out.println("Mul = "+m.getResult());
   }
}