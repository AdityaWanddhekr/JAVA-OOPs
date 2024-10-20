import java.util.*;
public class MergeArrayApp
{
     /*
      WAP to create a class which contains an integer array as its data member. Create 2 
      objects for the class and give the value to the array using default constructor and 
      parameterized constructor and merge both one after another using methods in the same 
      class.
     */
    public static void main(String[] args)
    {
         int a[]={1,2,3,4,5};
         int b[]={100,200,300,400,500};
         Merge m1=new Merge(a,b);
         
 
         int c[]=m1.getMerge(m1);
         System.out.println("The merged array is : ");
         for(int i=0;i<c.length;i++)
         {
            System.out.print(c[i]+" ");
         }

     
    }
}