public class Department
{
    int depId;
    String depName;
    Book b[];

    void setDepId(int depId)
    { 
        this.depId=depId;
    }
    int getDepId()
    {
        return depId;
    }

    void setDepName(String depName)
    { 
        this.depName=depName;
    }
    String getDepName()
    {
        return depName;
    }

    void setBook(Book ...b)
    {
        this.b=b;
    }
    
    Book[] getBook()
    {
       return b;
    }

}