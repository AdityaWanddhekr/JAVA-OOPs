import java.util.*;
public class FreqApp
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size : ");
       int size=sc.nextInt();

       int a[]=new int[size];
       
       System.out.println("Enter array element : ");
       for(int i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
       }


       System.out.println("The array is : ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }

       Arrays.sort(a);
       System.out.println();
       Freq f=new Freq();
       f.getData(a);
       f.getFreq();
     
    }
}