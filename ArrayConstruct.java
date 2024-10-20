import java.util.*;
 
public class ArrayConstruct
{
    /*
       WAP to create a class which contains an integer array as data member and create a 
       parameterized constructor to assign the values for the data members. 
       Pass the object of this class to a method of another class to sort them 
       in ascending order and return the array to the main and print it. 
    */
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size : ");
         int size=sc.nextInt();
 
         int a[]=new int[size];

         System.out.println("Enter the element of the array : ");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }
      
         System.out.println("The array before accending order : ");
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
         }

         ArrayCon ac=new ArrayCon(a);

         SortArray s=new SortArray();
         int sort[]=s.getSort(ac);
       
         System.out.println("The array after accending order : ");
         for(int i=0;i<sort.length;i++){
            System.out.print(sort[i]+" ");
         }

    }
}