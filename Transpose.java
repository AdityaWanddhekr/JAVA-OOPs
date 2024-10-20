public class Transpose
{
   int[][] getTransPose(MatrixApp m)
   {
       for(int i=0;i<m.m.length;i++)
       {
          for(int j=i;j<m.m[0].length;j++){
              int temp=m.m[i][j];
              m.m[i][j]=m.m[j][i];
              m.m[j][i]=temp;
          }
       }
     return m.m;
   }
}