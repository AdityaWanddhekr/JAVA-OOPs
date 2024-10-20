public class StudentFee
{
   StudentInfo s;
   void setStudent(StudentInfo s)
   {
       this.s=s;
   }

   void checkElegibility(double per)
   {
       if(per>=60){
         s.discfee=s.totalfee*0.3;
         s.actualpaidfee=s.actualpaidfee-s.discfee;
       }
       else
       {
         s.actualpaidfee=s.actualpaidfee;
       }
   }

   void show()
   {
     System.out.println("Id = "+s.id+" Name = "+s.name+" Actual Paid Fee = "+s.actualpaidfee);
   }
}