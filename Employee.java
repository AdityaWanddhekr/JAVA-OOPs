public class Employee
{
   String name;
   int id;
   double basic_sal;
   double increment_sal;
   double total_sal;
   
   void getData(String name,int id,double basic_sal)
   {
       this.name=name;
       this.id=id;
       this.basic_sal=basic_sal;
      
   }
  
   void setPerformance(double performance)
   {
       if(performance>=60 && performance<=100)
       {
          increment_sal=basic_sal*0.3;
          total_sal=basic_sal+ increment_sal;
       }
       else{
          increment_sal=basic_sal;
       }
   
   }

   void showData()
   {
      System.out.println("Name = "+name+" Id = "+id+" Basic Sal = "+basic_sal+" increment_sal = "+increment_sal+" total_sal = "+total_sal);
   }
}