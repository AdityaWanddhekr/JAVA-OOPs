public class Library
{
    Department d[];
    void setDep(Department ...d)
    {
       this.d=d;
    }

    void showBook()
    {
       for(int i=0;i<d.length;i++){
          Department dl=d[i];

          System.out.println("Dep Id = "+d[i].getDepId()+"Dep Name = "+d[i].getDepName());
       
    
       Book b[]=dl.getBook();
       for(Book book:b){
          System.out.println("Book id = "+Book.getId()+" Book Name = "+Book.getName());
       }
       System.out.println("The total book count is : "+b.length);
      }
    }
}