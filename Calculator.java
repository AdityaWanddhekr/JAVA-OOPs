class Value{
   int a,b;
   void getData(int a,int b){
      this.a=a;
      this.b=b;
   }
   int getResult(){
       return 0;
   }
}

class Add extends Value
{
    int getResult(){
       return a+b;
    }
}
class Sub extends Value
{
    int getResult(){
       return a-b;
    }
}

class Mul extends Value
{
    int getResult(){
       return a*b;
    }
}

class Div extends Value
{
    int getResult(){
       return a/b;
    }
}

public class Calculator
{
   public static void main(String[] args)
   {
       Value v=null;
       v=new Add();
       v.getData(10,2);
       System.out.println("Sum is : "+v.getResult());
        v=new Sub();
        v.getData(10,2);

       System.out.println("Sub is : "+v.getResult());
        v=new Mul();
        v.getData(10,2);

       System.out.println("Mul is : "+v.getResult());
        v=new Div();
      v.getData(10,2);

       System.out.println("Div is : "+v.getResult());

   }
}