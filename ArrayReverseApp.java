class Array
{
   int a[];
   Array(int a[])
   {
      this.a=a;
   }
}

class Sort{
 
  int[] getSort(Array a)
  {
    for(int i=0;i<a.a.length;i++)
    {
        for(int j=i+1;j<a.a.length;j++)
        {
             if(a.a[i]<a.a[j]){
                int temp=a.a[i];
                a.a[i]=a.a[j];
                a.a[j]=temp;
             }
        }
    }
    return a.a;
  }
 
}
 
public class ArrayReverseApp
{
    public static void main(String[] args)
    {
       int array[]={10,20,67,46,87};
       Array a=new Array(array);
       Sort s=new Sort();
       int ar[]=s.getSort(a);
       for(int i=0;i<ar.length;i++) 
       {
          System.out.print(ar[i]+" ");
       }
    }
}