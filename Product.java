public class Product
{
   int[][] getProduct(int a[][],int b[][]){
    int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<c.length;i++){
           for(int j=0;j<c[0].length;j++){
              int sum=0;
             for(int k=0;k<a[0].length;k++){
                  sum+=a[i][k]*b[k][j];
                  c[i][j]=sum;
             }
           }
        }
      return c;
   }
}