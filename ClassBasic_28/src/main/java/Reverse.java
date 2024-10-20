
public class Reverse {
    int a;
    
    void getRev(Reverse r[]){
        int i=0;
        int j=r.length-1;
        while(i<j){
            int temp=r[i].a;
            r[i].a=r[j].a;
            r[j].a=temp;
            i++;
            j--;
        }
        
      
    }
}
