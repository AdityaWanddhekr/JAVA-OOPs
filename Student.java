import java.util.*;
public class Student
{
   int roll;
   double per;
   String name;

   void getData(int i)
   {
       Scanner sc1=new Scanner(System.in);
       Scanner sc2=new Scanner(System.in);
       Scanner sc3=new Scanner(System.in);
       System.out.println("Enter the roll no,percentage,name : "+i+1);
       roll=sc1.nextInt();
       per=sc2.nextDouble();
       name=sc3.nextLine();

   }

   void display()
   {
      System.out.println("Roll no = "+roll+" Percentage"+per+" name = "+name);
   }
}