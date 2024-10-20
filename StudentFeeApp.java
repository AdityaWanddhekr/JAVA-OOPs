public class StudentFeeApp
{
    public static void main(String[] args)
    {
       StudentInfo sInfo=new StudentInfo();
       sInfo.setId(1);
       sInfo.setName("Aditya");
       sInfo.setPer(70);
       sInfo.setTotalFee(50000);

       StudentFee sf=new StudentFee();
       sf.setStudent(sInfo);
       sf.checkElegibility(70);
       sf.show();
    }
}