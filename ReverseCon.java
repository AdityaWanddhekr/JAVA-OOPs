public class ReverseCon
{
     int[] getReverse(ArrayConFun A)
     {
        int i=0;
        int j=A.a.length-1;
        while(i<j)
        {
           int temp=A.a[i];
           A.a[i]=A.a[j];
           A.a[j]=temp;

           i++;
           j--;
        }
      return A.a;
     }
}