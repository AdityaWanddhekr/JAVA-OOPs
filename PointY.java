public class PointY extends PointX
{
     int y;
     PointY(int x,int y)
     {
         super(x);
         this.y=y;
     }

     void getCartesian(){
        System.out.println((x>0 && y>0) ?"True":"False");
     }
}