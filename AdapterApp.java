abstract class Value
{
   abstract void show();
   abstract void display();
   abstract void view();
}

class Adapter extends Value
{
    void show(){};
    void display(){};
    void view(){};
}

class Show extends Adapter
{
    void show()
    {
       System.out.println("I am show method.");
    }
}

class Display extends Adapter
{
    void display()
    {
       System.out.println("I am display method.");
    }
}


class View extends Adapter
{
    void view()
    {
       System.out.println("I am view method.");
    }
}

public class AdapterApp
{
   public static void main(String[] args)
   {
        Show s=new Show();
        s.show();
        View v=new View();
        v.view();
   }
}