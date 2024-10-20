public class MeanSD
{
     DataKeeper getMeanSD(ArrayFun AF,int a[])
     {
         double sum=0;
         for(int i=0;i<a.length;i++){
             sum+=AF.a[i];
         }
         double mean=sum/a.length;
         double val=0;
         for(int i=0;i<a.length;i++){
              val=Math.pow(mean-AF.a[i],2); 
         }
          double total=val/a.length;
          double SD=Math.sqrt(total);
 
          DataKeeper d=new DataKeeper();
          d.mean=mean;
          d.SD=SD;

        return d;
     }
}