import java.util.*;
public class StudentResApp
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the subject number : ");
         int sub=sc.nextInt();

         int subject[]=new int[sub];

         System.out.println("Enter the subject marks : ");
         for(int i=0;i<subject.length;i++)
         {
            subject[i]=sc.nextInt();
         }
         
    
         StudentRes s=new StudentRes();
         s.studentMark(subject);
         s.calPercent();
         s.checkGrade();
     }
}