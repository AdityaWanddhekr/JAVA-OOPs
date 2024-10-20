public class TransNorm
{
    DataKeeperFun getTransNorm(MatrixFun m){
         int trans=0;
         int norm=0;
         for(int i=0;i<m.m.length;i++){
             for(int j=0;j<m.m[0].length;j++){
                  trans+=m.m[i][j]; 
                  if(i==j){
                    norm+=m.m[i][j];
                  } 
             }
         }
        DataKeeperFun d=new DataKeeperFun();
        d.norm=norm;
        d.trans=trans;

        return d;
        
    }
}