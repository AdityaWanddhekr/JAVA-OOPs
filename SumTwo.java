public class SumTwo
{
   int a;
   int b;
   int sum;


   void getData(int a,int b)
   {
        this.a=a;
        this.b=b;
   }

   SumTwo getSum(SumTwo s1)
   {
      SumTwo s=new SumTwo();
      s.sum=s.a+s.b;
      return s;
   }
 
   void show(SumTwo s)
   {
       System.out.println(s.sum);
   }
}