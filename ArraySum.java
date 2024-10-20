public class ArraySum
{
   int a;
 
   void getData(int i)
   {
      a=i;
   }

   int getSum(ArraySum a[])
   {
       int sum=0;
       for(int i=0;i<a.length;i++){
          sum+=a[i].a;
       }
     return sum;
   }
}