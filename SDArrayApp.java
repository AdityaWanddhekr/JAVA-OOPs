import java.util.*;
public class SDArrayApp
{
    /*
        WAP to create a class which contains an integer array as data member
        and create a parameterized constructor to assign the values for the data members.
        Pass the object of this class to a method of another class to calculate
        mean and standard deviation and embed this mean and standard deviation 
        into an object of another class called Datakeeper 
        and return the object to the main and print mean and standard deviation. 
    */
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size : ");
         int size=sc.nextInt();

         int a[]=new int[size];

         System.out.println("Enter the element : ");
         for(int i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
         ArrayFun A=new ArrayFun(a);
         MeanSD m=new MeanSD();
         DataKeeper d=m.getMeanSD(A,a);
         System.out.println("The mean is : "+d.mean);
         System.out.println("The SD is : "+d.SD);
    }
}