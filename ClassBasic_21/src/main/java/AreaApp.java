
public class AreaApp {
//    WAP to find the area of a triangle when three points are given using the Objects as 
//arguments by creating three classes like Point, Distance and Area.
    
    public static void main(String[] args){
        Point p1=new Point();
        p1.getData(5, 6);
        Point p2=new Point();
        p2.getData(7, 9);
        Point p3=new Point();
        p3.getData(4, 12);
        
        Distance d=new Distance();
        
        double a=d.getDist(p1, p2);
        double b=d.getDist(p2, p3);
        double c=d.getDist(p1,p3);
        
        Area area=new Area();
        double Area=area.getAraea(a, b, c);
        System.out.println("The area is : "+Area);
        
        
    }
}
