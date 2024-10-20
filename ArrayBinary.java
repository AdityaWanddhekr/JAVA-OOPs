public class ArrayBinary extends ArrayPoly
{
   int[] arrayOperation()
   {
       for(int i=0;i<a.length;i++){
         
           int binary=0;
            int pow=0;
           while(a[i]>0)
           {
               int last=a[i]%2;
               binary+=last*(int)Math.pow(10,pow);
               a[i]/=2;
               pow++;
           }
          a[i]=binary;
       }
    return a;
   }
}