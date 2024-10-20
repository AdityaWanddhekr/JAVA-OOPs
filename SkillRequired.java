abstract class Post
{
    abstract void skill();
}

class Developer extends Post
{
    void skill()
    {
       System.out.println("Any Programing language.\n FrontEnd Technology\n BackEnd Technology.");
    }
}

class HR extends Post
{
    void skill()
    {
      System.out.println("Master in HR\n 1 yr Experience.");
    }
}
public class SkillRequired
{
   public static void main(String[] args)
   {
       Developer d=new Developer();
       d.skill();
   }
}