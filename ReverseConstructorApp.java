import java.util.*;
public class ReverseConstructorApp
{
   /*
       WAP to create a class which contains an integer array as data member and create a 
       default constructor to assign the values for the data members. 
       Pass the object of this class to a method of another class to get the 
       reverse array and  return the array to the main class and print it.
   */
   public static void main(String[] args)
   { 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size : ");
       int size=sc.nextInt();

       int a[]=new int[size];

       System.out.println("Enter the element of the array : ");
       for(int i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
       }

       System.out.println("The Original array is : ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }

       ArrayConFun A=new ArrayConFun(a);
    
       ReverseCon rc=new ReverseCon();
       int rev[]=rc.getReverse(A);
      
       System.out.println("The Reverse array is : ");
       for(int i=0;i<rev.length;i++)
       {
           System.out.print(rev[i]+" ");
       }


       
   }
}