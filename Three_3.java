public class Three_3 extends Two_2
{ 
    public int x2;
    public int y2;
    double getDistance(){
       double dist1=Math.pow(x2-x1,2);
       double dist2=Math.pow(y2-y1,2);
 
       double dist=Math.sqrt(dist+dist2);

       return dist;
    }

}