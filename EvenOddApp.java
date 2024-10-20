import java.util.*;
public class EvenOddApp
{
   
   /*
      WAP to create 5 classes which contains one data member and one member 
      function to get the data. Inherit all classes in multilevel manner into 
      a 5th class and create an array for these data member’s in function of
      5th class and get the array into main. Send this array to a class called
      Evenodd to create two arrays called even array and odd array embed those
     arrays into object of another clsass Datakeeper and send it back to main and print.
   */
 
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       Five f=new Five();
       int a[]=f.getArray();
  
       System.out.println("Enter the element of the array  : ");
       for(int i=0;i<a.length;i++)
       {
          a[i]=sc.nextInt();
       }

       System.out.println("The array is : ");
       for(int i=0;i<a.length;i++)
       {
          System.out.print(a[i]+" ");
       }
 
       EvenOdd eo=new EvenOdd();
       Data_keeper d=eo.getOddEven(a);

       System.out.println();

       System.out.println("Even array is : ");
       for(int i=0;i<d.even_arr.length;i++){
          System.out.print(d.even_arr[i]+" ");
       }

       System.out.println();
       System.out.println("Odd array is : ");
       for(int i=0;i<d.odd_arr.length;i++){
          System.out.print(d.odd_arr[i]+" ");
       }

       
   }
}