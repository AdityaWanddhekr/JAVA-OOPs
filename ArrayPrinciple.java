public class ArrayPrinciple
{
    int[] getPrinciple(MatrixPrinciple p){
        int c[]=new int[p.m.length];
        int k=0;
        for(int i=0;i<p.m.length;i++){
            for(int j=0;j<p.m[0].length;j++)
            {
                if(i==j)
                {
                    c[k++]=p.m[i][j];
                }
            }
        }
      return c;
    }
}