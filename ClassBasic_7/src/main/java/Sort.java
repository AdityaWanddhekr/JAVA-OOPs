
public class Sort {
   int[] getAccending(int a[]){
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       return a;
   } 
   
   int[] getDeccending(int a[]){
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
              if(a[i]<a[j]){
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       return a;
   } 
}
