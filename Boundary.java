public class Boundary
{
      int[] getBoundaryEle(MatrixB m)
      {
          int k=0;
          int c[]=new int[m.m.length*m.m[0].length];
          
          int topRow=0;
          int rightCol=m.m[0].length-1;
          int bottomRow=m.m.length-1;
          int leftCol=0;
 
          for(int i=leftCol;i<=rightCol;i++)
          {
             c[k++]=m.m[topRow][i];     
          }
          topRow++;
           for(int i=topRow;i<=bottomRow;i++)
          {
             c[k++]=m.m[i][rightCol];     
          }
         rightCol--;
           for(int i=rightCol;i>=leftCol;i--)
          {
             c[k++]=m.m[bottomRow][i];     
          }
         bottomRow--;
           for(int i=bottomRow;i>=topRow;i--)
          {
             c[k++]=m.m[i][leftCol];     
          }
        leftCol++;

        return c;
      }
}