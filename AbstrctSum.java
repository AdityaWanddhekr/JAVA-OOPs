abstract class Array
{
   abstract int[] performOperation(int a[]);
}

class Reverse extends Array{
   int[] performOperation(int a[])
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

class deleteArray extends Array{
    int[] performOperation(int a[])
    {    
        
        int id=3;
        for(int i=id;i<a.length-1;i++){
            a[i]=a[i+1];
        }
       return a;
    }
}
public class AbstrctSum
{
   public static void main(String args[])
   {
        int a[]={10,20,30,40,50};
        Reverse r=new Reverse();
        int rev[]=r.performOperation(a);
        System.out.println("Reversed array is : ");
        for(int i=0;i<rev.length;i++)
        {
           System.out.print(rev[i]+" ");
        }
        System.out.println();
        deleteArray d=new deleteArray();
        int del[]=d.performOperation(a);
         System.out.println("Delete array is : ");
        for(int i=0;i<del.length-1;i++)
        {
           System.out.print(del[i]+" ");
        }

        
   }
}