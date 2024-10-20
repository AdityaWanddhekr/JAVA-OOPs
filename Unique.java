public class Unique
{
   int[] getUnique(int a[]){
      int u[]=new int[a.length];

      for(int i=0;i<a.length;i++)
      {
         int count=0;
         for(int j=i+1;j<a.length;j++)
         {
             if(a[i]==a[j])
             {
                count++;
             }
         }
        if(count==1)
        {
           u[i]=a[i];
        }
      }
     return u;
   }
}