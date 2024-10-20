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

class Calculation{
   void getCal(Value v){
       System.out.println(v.getResult());
   }
}
public class LooseCoupling
{
    public static void main(String[] args)
    {
        Value v=null;
        Calculation c=new Calculation();

        v=new Add();
        v.getData(12,2);
        c.getCal(v);

        v=new Sub();
        v.getData(12,2);
        c.getCal(v);

        v=new Mul();
        v.getData(12,2);
        c.getCal(v);
 
        v=new Div();
        v.getData(12,2);
        c.getCal(v);

    }
}