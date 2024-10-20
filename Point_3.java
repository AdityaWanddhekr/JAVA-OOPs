public class Point_3 extends Point_2
{
    int z;
    Point_3(int x,int y,int z)
    {
       super(x,y);
       this.z=z;
    }
 
     int getBig(){
       
        return (x>y && x>z)?x:(y>x && y>z)?y:z;
     }
}