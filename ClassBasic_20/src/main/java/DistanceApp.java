
public class DistanceApp {
//       WAP to find the Distance between two points using objects as arguments by creating 
//       class called Point and another class called Distance. 
    
    public static void main(String[] args){
        Point p1=new Point();
        p1.getData(4, 6);
        Point p2=new Point();
        p1.getData(4, 19);
        
        Distance d=new Distance();
        double dist=d.getDistance(p1, p2);
        System.out.println("Distance between two point is : "+dist);
    }
}
