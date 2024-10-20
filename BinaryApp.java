import java.util.*;
public class BinaryApp
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size : ");
      int size=sc.nextInt();

      Binary b[]=new Binary[size];
      for(int i=0;i<b.length;i++)
      {
         b[i]=new Binary();
      }

      System.out.println("Enter the element of the array : ");
      for(int i=0;i<b.length;i++)
      {
          b[i].a=sc.nextInt();
      }

      System.out.println("The Original array is : ");
      for(int i=0;i<b.length;i++)
      {
          System.out.println(b[i].a+" ");
      }

      Binary bin[]=b[0].getBinary(b);
      System.out.println("The Original array is : ");
      for(int i=0;i<bin.length;i++)
      {
          System.out.println(bin[i]+" ");
      }


   }
}