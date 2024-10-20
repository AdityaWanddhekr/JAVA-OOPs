
public class MatrixSum {
    int mat[][];
    void getData(int mat[][]){
        this.mat=mat;
    }
    int getSum(){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}
