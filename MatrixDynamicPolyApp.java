class MatrixPoly{
    int m[][];
    void getData(int m[][])
    {
       this.m=m;
    }
    int matrixOperation()
    {
       return 0;
    }
}

class Trans extends MatrixPoly
{
    int matrixOperation()
    {
       int trans=0;
       for(int i=0;i<m.length;i++)
       {
          for(int j=0;j<m[0].length;j++)
          {
              trans+=m[i][j];
          }
       }
      return trans;
    }

}

class Norms extends MatrixPoly
{
    int matrixOperation()
    {
       int norms=0;
       for(int i=0;i<m.length;i++)
       {
          for(int j=0;j<m[0].length;j++)
          {
              if(i==j){
                 norms+=m[i][j];
              }
          }
       }
      return norms;

    }

}


public class MatrixDynamicPolyApp
{
    public static void main(String[] args)
    { 
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        MatrixPoly m=null;
        
        m=new Trans();
        m.getData(mat);
        System.out.println("Matrix is : "+m.matrixOperation());

        m=new Norms();
        m.getData(mat);
        System.out.println("Matrix is : "+m.matrixOperation());

   
    }
}