
public class Point {
    int a;
    int b;
    Point(){
       a=10;
       b=20;
    }
    Point(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    double getDiastance(Point p1,Point p2){
         double dist1=Math.pow(p1.a+p2.a,2);
         double dist2=Math.pow(p2.b+p2.b,2);
         double dist=dist1+dist2;
         double diff=Math.sqrt(dist);
         
         return diff;
    }
}
