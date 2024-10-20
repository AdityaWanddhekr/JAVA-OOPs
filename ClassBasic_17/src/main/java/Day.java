
public class Day {
    int Y,M,W,D;
    void getData(int y,int m,int w,int d){
        Y=y;
        M=m;
        W=w;
        D=d;
    }
    
    Day getSum(Day d1,Day d2){
        int day1=d1.Y*360+d1.M*30+d1.W*4+d1.D;
        int day2=d2.Y*360+d2.M*30+d2.W*4+d2.D;
        
        int Sum=day1+day2;
        Day sum=new Day();
        sum.Y=Sum/360;
        int r1=Sum%360;
        sum.M=r1/30;
        int r2=r1%30;
        sum.W=r2/7;
        sum.D=r2%7;
        
        return sum;
    }
     void disPlay(){
        System.out.println(Y+" year : "+M+" month :"+W+" Week : "+D+" days ");
        
    }
}
