public class EmployeeApp
{
   public static void main(String[] args)
   {
        Employee e1=new Employee();
        e1.getData("Aditya",1,50000);
        e1.setPerformance(50);
        e1.showData(); 

        e1.getData("Akash",1,50000);
        e1.setPerformance(80);
        e1.showData(); 
   }
}