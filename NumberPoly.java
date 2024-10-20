class Value{
    int performeOperation(int num){
        return 0;
    }
}

class Reverse extends Value
{
     int performeOperation(int num){
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

class SumOfDigit extends Value
{
     int performeOperation(int num){
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

public class NumberPoly
{
   public static void main(String[] args)
   {
        Value v=null;
        v=new Reverse();
        System.out.println(v.performeOperation(2745));
        v=new SumOfDigit();
         System.out.println(v.performeOperation(2745));

   }
}