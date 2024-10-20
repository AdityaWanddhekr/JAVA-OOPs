public class Merge
{
    int a[];
    int b[];
    Merge(int a[],int b[]){
     this.a=a;
     this.b=b;
    }
        

   int[] getMerge(Merge m1)
   {
        int k=0;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
           c[k++]=m1.a[i];
        }
        for(int j=0;j<b.length;j++)
        {
           c[k++]=m1.b[j];
        }

      return c; 
   }
}