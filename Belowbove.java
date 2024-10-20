public class Belowbove
{
    int[] getBelowSecondary(MatrixCon m)
    {
        int k=0;
        int c[]=new int[m.a.length];
    
        for(int i=0;i<m.a.length;i++)
        {
           for(int j=0;j<m.a[0].length;j++)
           {
                if(i>j)
                {
                  c[k++]=m.a[i][j];
                }
           }
        }
      return c;
    }
      
    int[] getAboveSecondary(MatrixCon m)
    {
         int k=0;
        int c[]=new int[m.a.length];
    
        for(int i=0;i<m.a.length;i++)
        {
           for(int j=0;j<m.a[0].length;j++)
           {
                if(i<j)
                {
                  c[k++]=m.a[i][j];
                }
           }
        }
      return c;
    }

}