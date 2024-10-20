public class DistanceApp {
    public static void main(String[] args){
        Point p1=new Point();
        p1.getData(4, 6);
        Point p2=new Point();
        p2.getData(4, 19);
        
        Distance dist=new Distance();
        double distance=dist.getdist(p1, p2);
        System.out.println("Distance is : "+distance);
    }
}
