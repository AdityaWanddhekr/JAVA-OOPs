interface Value{
   void getData(int a,int b);
   int getResult();
}

class Add implements Value
{
   int a;
   int b;
   public void getData(int a,int b)
   {
       this.a=a;
       this.b=b;
   }
   public int getResult()
   {
      return a+b;
   }
}

class Sub implements Value
{
    int a;
   int b;
   public void getData(int a,int b)
   {
       this.a=a;
       this.b=b;
   }

   public int getResult()
   {
      return a-b;
   }
}

class Mul implements Value
{
    int a;
   int b;
   public void getData(int a,int b)
   {
       this.a=a;
       this.b=b;
   }

   public int getResult()
   {
      return a*b;
   }
}

class Div implements Value
{
    int a;
   int b;
  public void getData(int a,int b)
   {
       this.a=a;
       this.b=b;
   }

   public int getResult()
   {
      return a/b;
   }
}

public class InterfaceDynamicPoly
{
   public static void main(String[] args)
   {
       Value v=null;
  
       v=new Add();
       v.getData(12,3);
       int sum=v.getResult();
       System.out.println("Sum  = "+sum);

      v=new Mul();
       v.getData(12,3);
       int mul=v.getResult();
       System.out.println("Mul  = "+mul);

   }
}