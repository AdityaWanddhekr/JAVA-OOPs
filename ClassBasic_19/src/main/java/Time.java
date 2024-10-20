
public class Time {
    int Hr;
    int Min;
    int Sec;
    void getData(int hr,int min,int sec){
        Hr=hr;
        Min=min;
        Sec=sec;
    }
    Time getDiff(Time t1,Time t2){
        int time1=t1.Hr*3600+t1.Min*60+t1.Sec;
        int time2=t2.Hr*3600+t1.Min*60+t1.Sec;
        
        int diff=Math.abs(time1-time2);
        Time t=new Time();
        t.Hr=diff/3600;
        int r1=diff%3600;
        t.Min=r1/60;
        t.Sec=r1%60;
        
        return t;
        
        
    }
    
    void display(){
        System.out.println(Hr+" Hours"+Min+" Minutes"+Sec+" Second");
    }
}
