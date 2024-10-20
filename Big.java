public class Big extends NumOne
{ 
    int b;
    void getData(int b){
        this.b=b;
    }  
 
    void getBig(int a,int b)
    {
      
       if(a>b)
       {
          System.out.println("A is big.");
       }
       else
       {
          System.out.println("B is big.");
       }
    }
}