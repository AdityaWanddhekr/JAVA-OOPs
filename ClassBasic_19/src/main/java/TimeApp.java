
public class TimeApp {
    // WAP to find absolute difference of time entities using arguments for objects.
    public static void main(String[] args){
        Time t1=new Time();
        t1.getData(4, 43, 56);
        Time t2=new Time();
        t2.getData(3, 12, 48);
        
        Time Sub=t1.getDiff(t1, t2);
        t1.display();
        t2.display();
        System.out.println("_________");
        Sub.display();
    }
}
