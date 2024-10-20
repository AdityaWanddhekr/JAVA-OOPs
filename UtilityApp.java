class Utility{
    int a;
    private Utility(int a)
    {
       this.a=a;
    }
 
     static void getData(int a){
       System.out.println("A is : "+a);
    }
}
public class UtilityApp
{
   public static void main(String[] args)
   {
        // Utility u=new Utility(12);
         Utility.getData(12);
   }
}