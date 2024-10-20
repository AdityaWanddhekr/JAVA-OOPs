
public class Even {
    
    int[] getevenArray(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        
        int even[]=new int[count];
        int p=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even[p++]=a[i];
            }
        }
        
        return even;
    }
}
