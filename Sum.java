public class Sum
{
     
    int calSum(int ...x)
    {int sum=0;
       for(int i=0;i<x.length;i++)
       {
            sum+=x[i];
       }
      return sum;
    }

}