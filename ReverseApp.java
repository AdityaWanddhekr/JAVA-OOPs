import java.util.*;
public class ReverseApp
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size : ");
      int size=sc.nextInt();

      Reverse r[]=new Reverse[size];
 
      for(int i=0;i<r.length;i++){
          r[i]=new Reverse();
      }

      System.out.println("Enter the array element : ");
      for(int i=0;i<r.length;i++){
          r[i].a=sc.nextInt();
      }

      System.out.println("The original array is : ");
      for(int i=0;i<r.length;i++){
        System.out.print(r[i].a+" ");
      }

      Reverse rev[]=r[0].getRev(r);
      System.out.println("The reversed array is : ");
      for(int i=0;i<rev.length;i++){
        System.out.print(rev[i].a+" ");
      }

   }
}