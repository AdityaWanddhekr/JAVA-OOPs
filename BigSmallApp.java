import java.util.*;
public class BigSmallApp
{
    /*
       WAP to swap the biggest and smallest elements of an array Where array will be the data 
       member of a class. And pass the object as argument to the other class Called big small to 
       find the biggest and smallest.( use constructors to load the objects)
    */
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size : ");
         int size=sc.nextInt();

         int a[]=new int[size];
      
         System.out.println("Enter the element of array : ");
         for(int i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
         System.out.println("The array is : ");
         for(int i=0;i<a.length;i++)
         {
            System.out.print(a[i]+" ");
         }

         ArrayBigSmall abs=new ArrayBigSmall(a);
         
         BigSmall BS=new BigSmall();
         int s=BS.getSmall(abs);
         int b=BS.getBig(abs);
 
         Swap sa=new Swap();
 
         int swap[]=sa.getswap(abs,s,b);
         System.out.println();
         System.out.println("The swap big small array is : ");
         for(int i=0;i<swap.length;i++)
         {
            System.out.print(swap[i]+" ");
         }

    }
}