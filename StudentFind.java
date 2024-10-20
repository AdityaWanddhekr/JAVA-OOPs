import java.util.*;
public class StudentFind
{
    void getFind(StudentFindInfo s[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID : ");
        int id=sc.nextInt();

        for(int i=0;i<s.length;i++)
        {
            if(s[i].id==id){
               System.out.println("Student found :\nId = "+s[i].id+" Name = "+s[i].name+" Per = "+s[i].per);
            }
        }
    }
}