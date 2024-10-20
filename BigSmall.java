public class BigSmall
{
   int getSmall(ArrayBigSmall a)
   {
       int small=Integer.MAX_VALUE;
       for(int i=0;i<a.a.length;i++)
       {
           if(a.a[i]<small){
              small=a.a[i];
           }
       }
     return small;
   }
 
    int getBig(ArrayBigSmall a)
   {
       int Big=Integer.MIN_VALUE;
       for(int i=0;i<a.a.length;i++)
       {
           if(a.a[i]>Big){
              Big=a.a[i];
           }
       }
     return Big;
   }

}