public class Sorting
{
    int[] getAccending(ArraySort a){
        for(int i=0;i<a.a.length;i++)
        {
           for(int j=i+1;j<a.a.length;j++)
           {
               if(a.a[i]>a.a[j])
               {
                  int temp=a.a[i];
                  a.a[i]=a.a[j];
                  a.a[j]=temp;
               }
           }
        }
      return a.a;
    }
 
    int[] getDeccending(ArraySort a){
        for(int i=0;i<a.a.length;i++)
        {
           for(int j=i+1;j<a.a.length;j++)
           {
               if(a.a[i]<a.a[j])
               {
                  int temp=a.a[i];
                  a.a[i]=a.a[j];
                  a.a[j]=temp;
               }
           }
        }
      return a.a;
    }

}