
public class Product {
    int m1[][];
    int m2[][];
    void getData(int mat[][]){
        m1=mat;
    }
    
    int [][] getProduct(int m1[][],int m2[][]){
        int c[][]=new int[m1.length][m2[0].length];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                int sum=0;
                for(int k=0;k<m1[0].length;k++){
                    sum+=m1[i][k]*m2[k][j];
                    c[i][j]=sum;
                }
                
            }
        }
        return c;
    }
}
