abstract class Number
{
   int num;
   void getData(int num)
   {
      this.num=num;
   }
  
   abstract int operation();
}

class SumDigit extends Number
{
     int operation()
     {
        int sum=0;
        while(num>0)
        {
           int last=num%10;
           sum+=last;
           num/=10;
        }
       return sum;
     }
}

class RevNum extends Number
{
     int operation()
     {
        int rev=0;
        while(num>0)
        {
           int last=num%10;
           rev=rev*10+last;
           num/=10;
        }
       return rev;
     }
}

class NumOp
{
    void getNum(Number n)
    {
        System.out.println(n.operation());
    }

}

public class LooseCApp
{
   public static void main(String[] args)
   {
      Number n=null;
      NumOp o=new NumOp();

      n=new SumDigit();
      n.getData(27801);
      o.getNum(n);

      n=new RevNum();
      n.getData(27801);
      o.getNum(n);

   }
}