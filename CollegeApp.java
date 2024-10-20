public class CollegeApp
{
   public static void main(String[] args)
   {
       Book b1=new Book();
       b1.setId(1);
       b1.setName("Wings of Fire");
       
       Book b2=new Book();
       b2.setId(2);
       b2.setName("Rich Dady poor dady");

       Department d1=new Department();
       d1.setDepId(1);
       d1.setDepName("CSE");
       d1.setBook(b1,b2);

       Department d2=new Department();
       d2.setDepId(2);
       d2.setDepName("Civil");
       d2.setBook(b1,b2);

       Library l=new Library();
       l.setDep(d1,d2);
       l.showBook();

   }
}