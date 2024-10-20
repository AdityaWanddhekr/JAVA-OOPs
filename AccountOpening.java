abstract class Account
{
   abstract void accountType();
}

class Saving extends Account
{
   void accountType()
   {
      System.out.println("Minimum balanced 10000 required.");
      System.out.println("Adhar/Voteing card required.");
   }
}

class Current extends Account
{
   void accountType()
   {
      System.out.println("Minimum balanced 20000 required.");
      System.out.println("TAN/PAN card required.");
   }
}
public class AccountOpening
{
    public static void main(String[] args)
    {
        Saving s=new Saving();
        s.accountType();
    }
}