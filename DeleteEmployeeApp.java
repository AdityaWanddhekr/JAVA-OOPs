import java.util.*;
public class DeleteEmployeeApp
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the employee ");
         int size=sc.nextInt();
         Employee_INFO EI[]=new Employee_INFO[size];
         
         for(int i=0;i<EI.length;i++)
         {
            EI[i]=new Employee_INFO();
         }

         for(int i=0;i<EI.length;i++)
         {
             Scanner sc1=new Scanner(System.in);
             Scanner sc2=new Scanner(System.in);
             Scanner sc3=new Scanner(System.in);
            
             System.out.println("Enter the employee info : "+(i+1));

             int id=sc1.nextInt();
             String name=sc2.nextLine();
             int sal=sc3.nextInt();
 
             EI[i].setId(id);
             EI[i].setName(name);
             EI[i].setSal(sal);
         
         }
 
         System.out.println("The employees before deleting : ");
         for(int i=0;i<EI.length;i++)
         {
             System.out.println("ID = "+EI[i].getId()+" Name = "+EI[i].getName()+" Sal = "+EI[i].getSal());
         }

         DeleteEmployee DE=new DeleteEmployee();
         Employee_INFO E[]=DE.getDelete(EI);
         System.out.println("The employees after deleting : ");
         for(int i=0;i<E.length-1;i++)
         {
             System.out.println("ID = "+E[i].getId()+" Name = "+E[i].getName()+" Sal = "+E[i].getSal());
         }

    }
}