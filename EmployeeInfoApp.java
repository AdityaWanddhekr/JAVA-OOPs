import java.util.*;
public class EmployeeInfoApp
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the size : ");
       int size =sc.nextInt();

       EmployeeInfo ei[]=new EmployeeInfo[size];

       for(int i=0;i<ei.length;i++){
           ei[i]=new EmployeeInfo();

           Scanner sc1=new Scanner(System.in);
           Scanner sc2=new Scanner(System.in);
           Scanner sc3=new Scanner(System.in);
           System.out.println("Enter the Employee info : "+(i+1));
           int id=sc1.nextInt();
           String name=sc2.nextLine();
           int sal=sc3.nextInt();
           
           ei[i].setId(id);
           ei[i].setName(name);
           ei[i].setSal(sal);

          
       }
 
       System.out.println("The employee info is : ");
        for(int i=0;i<ei.length;i++)
         {
            System.out.println("Id = "+ei[i].getId()+" Name = "+ei[i].getName()+" Salary = "+ei[i].getSal());
         }
       
   }
}