import java.util.*;
public class SortArrayApp
{ 
    /*
       WAP to sort an array in ascending order and descending order for the two objects of  
       class. Where array will be the data member of a class. And pass the object as argument to 
       the other class Called Sort which contain two functions like ascending and descending .( 
       use constructors to load the objects)
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int a[]=new int[size];
  
        System.out.println("Enter the element : ");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("The Array is : ");
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
 
        ArraySort aa=new ArraySort(a);

         Sorting s=new Sorting();
         int acc[]=s.getAccending(aa);
         System.out.println("The Accending Array is : ");
        for(int i=0;i<acc.length;i++)
        {
           System.out.print(acc[i]+" ");
        }

         int Dcc[]=s.getDeccending(aa);
        System.out.println("The Deccending Array is : ");
        for(int i=0;i<Dcc.length;i++)
        {
           System.out.print(Dcc[i]+" ");
        }

        

    }
}