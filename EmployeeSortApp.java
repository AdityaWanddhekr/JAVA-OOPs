import java.util.*;
public class EmployeeSortApp
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size : ");
         int size=sc.nextInt();

         Employee_nfo e[]=new Employee_nfo[size];
  
         for(int i=0;i<e.length;i++)
         {
            e[i]=new Employee_nfo();

            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            Scanner sc3=new Scanner(System.in);

            System.out.println("Enter the employee info : "+(i+1));

            int id=sc1.nextInt();
            String name=sc2.nextLine();
            int sal=sc3.nextInt();
 
            e[i].setId(id);
            e[i].setName(name);
            e[i].setSal(sal);
            
            

         }

         System.out.println("The employee info before sorting is : ");
         for(int i=0;i<e.length;i++)
         {
             System.out.println("Id = "+e[i].getId()+" Name = "+e[i].getName()+" Salary = "+e[i].getSal());
         }

        EmployeeSort es=new EmployeeSort();
        
        Employee_nfo ei[]=es.getSort(e);
 
         System.out.println("The employee info After sorting is : ");
         for(int i=0;i<ei.length;i++)
         {
             System.out.println("Id = "+e[i].getId()+" Name = "+e[i].getName()+" Salary = "+e[i].getSal());
         }


    }
}