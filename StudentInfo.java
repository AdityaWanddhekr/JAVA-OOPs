public class StudentInfo
{
    int id;
    String name;
    double per;

    double totalfee;
    double discfee;

    double actualpaidfee;

    void setId(int id)
    {
       this.id=id;
    }
    int getId(){
       return id;
    }

    void setName(String name)
    {
       this.name=name;
    }
    String getName(){
       return name;
    }

    void setPer(double per)
    {
       this.per=per;
    }
    double getPer(){
       return per;
    }
    
    void setTotalFee(int totalfee)
    {
         this.totalfee=totalfee;
     }

}