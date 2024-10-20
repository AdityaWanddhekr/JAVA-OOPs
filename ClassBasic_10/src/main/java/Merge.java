
public class Merge {
    int[] MergeArray(int a[],int b[]){
        int c[]=new int[a.length+b.length];
        int k=0;
        int l=0;
        for(int i=0;i<c.length;i++){
            if(k<a.length){
                c[i++]=a[k++];
                
            }
            if(l<b.length){
                c[i]=b[l++];
            }
        }
        return c;
    }
}
