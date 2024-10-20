
public class SmallLarge {
    int a[];
    void getData(int a[]){
        this.a=a;
    }
    
    DataKeeper getSmallLarge(){
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(small>a[i]){
                small=a[i];
            }
            if(big<a[i]){
                big=a[i];
            }
        }
        DataKeeper d=new DataKeeper();
        d.small=small;
        d.large=big;
        
        return d;
        
    }
   
    
    
    
}
