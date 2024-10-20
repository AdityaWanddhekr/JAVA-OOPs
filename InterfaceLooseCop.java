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

class Operation
{
   void performOp(Value v){
       System.out.println(v.getResult());
   }
}
public class InterfaceLooseCop
{
   public static void main(String[] args)
   {
       Value v=null;
  
       v=new Add();
       v.getData(12,3);
       Operation o=new Operation();
       o.performOp(v);

       v=new Sub();
       v.getData(12,3);
       o.performOp(v);


   }
}