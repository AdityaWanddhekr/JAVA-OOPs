
public class PDElement {
    int[] getPDArray(int mat[][]){
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    count++;
                }
            }
        }
        int pd[]=new int[count];
        int p=0;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    pd[p++]=mat[i][j];
                }
            }
        }
        return pd;
    }
}
