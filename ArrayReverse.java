public class ArrayReverse extends ArrayPoly

{
    int[] arrayOperation()
    {
       int i=0;
       int j=a.length-1;
       while(i<j)
       {
           int temp=a[i];
               a[i]=a[j];
               a[j]=temp;

          i++;
          j--;
       }
     return a;
    }   
}