public class Distance
{
    double getDist(Point p1,Point p2)
    {
        double dist1=Math.pow(p1.x-p1.y,2);
        double dist2=Math.pow(p2.x-p2.y,2);

        double dist=dist1+dist2;
        double diff=Math.sqrt(dist);

        return diff;
    }
}