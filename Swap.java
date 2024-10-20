public class Swap
{
   int[] getswap(ArrayBigSmall a,int s,int b)
   { 
         int sPos=-1;
         int bPos=-1;
        for(int i=0;i<a.a.length;i++)
        {
           if(s==a.a[i]){
             sPos=i;
           } 
           if(b==a.a[i]){
             bPos=i;
           } 

        }

        for(int i=0;i<a.a.length;i++)
        {
          int temp=a.a[sPos];
          a.a[sPos]=a.a[bPos];
          a.a[bPos]=temp;
        }

         
     return a.a;
   }
}