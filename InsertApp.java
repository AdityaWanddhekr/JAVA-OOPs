import java.util.*;
public class InsertApp
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the size : ");
      int size=sc.nextInt();

      int a[]=new int[size+1];

      System.out.println("Enter the element of array : ");
      for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
      }
  
      System.out.println("The array before inserting is : ");
      for(int i=0;i<size;i++){
         System.out.print(a[i]+" ");
      }


      Insert I=new Insert();
      I.getData(a);

      System.out.println("Enter the position : ");
      int posi=sc.nextInt();

      System.out.println("Enter the element : ");
      int ele=sc.nextInt();


      I.posi=posi;
      I.size=size;
      I.ele=ele;

      I.insertValue();

      System.out.println("The array after inserting is : ");
      for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
      }

      
  }
}