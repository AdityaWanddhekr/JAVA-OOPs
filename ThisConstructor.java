class This
{
  This(){
    this(5);
    System.out.println("This is a default constructor.");
  }

  This(int a){
    this(5.6f);
    System.out.println("This is a Parametarised int constructor.");
  }

 This(float a){
    System.out.println("This is a Parametarised float constructor.");
  }

}
public class ThisConstructor
{
   public static void main(String[] args)
   {
       This a=new This();
   } 
}