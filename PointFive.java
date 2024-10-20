public class PointFive extends PointFour
{
     int e;
     PointFive(int a,int b,int c,int d,int e){
         super(a,b,c,d);  
         this.e=e;
     }
 
     int[] getArray(){
        int ar[]={a,b,c,d,e};
        return ar;
     }
}