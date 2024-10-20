
public class SDMean {
    double getMean(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
           
        }
         return sum/a.length;
    }
    DataKeeper SD(double mean,int a[]){
        double val=0;
        for(int i=0;i<a.length;i++){
           val=Math.pow(mean-a[i],2);
        }
        double total=val/a.length;
        double sd=Math.sqrt(total);
        DataKeeper d=new DataKeeper();
        d.SD=sd;
        d.mean=mean;
        
        return d;
        
    }
}
