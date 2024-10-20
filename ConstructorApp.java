class Value{
   int a,b;
   Value(int a,int b){
       this.a=a;
       this.b=b;
   }

   void getSum(){
      System.out.println("Sum is : "+(a+b));
   }
}

public class ConstructorApp
{
   public static void main(String[] args)
   {
      Value v=new Value(12,4);
      v.getSum();
   }
}