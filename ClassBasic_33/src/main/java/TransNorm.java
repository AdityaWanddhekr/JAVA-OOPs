
public class TransNorm {
    int m[][];
    
    DataKeeper TransNorm(){
        int trans=0;
        int norms=0;
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                   trans+=m[i][j]; 
                }
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
               norms+=m[i][j];
            }
        }
        
        DataKeeper d=new DataKeeper();
        d.norm=norms;
        d.trans=trans;
        
        return d;
    }
}
