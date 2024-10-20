
public class Sort {
    Array[] getSort(Array a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                double p1=a[i].per;
                double p2=a[j].per;
                if(p1<p2){
                    Array temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
