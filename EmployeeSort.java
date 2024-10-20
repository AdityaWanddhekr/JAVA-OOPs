public class EmployeeSort
{
    Employee_nfo[] getSort(Employee_nfo e[]){
         for(int i=0;i<e.length;i++)
         {
            for(int j=i+1;j<e.length;j++){
                 int sal1=e[i].sal;
                 int sal2=e[j].sal;
                 if(sal1<sal2)
                 {
                    Employee_nfo temp=e[i];
                    e[i]=e[j];
                    e[j]=temp;
                 }
            }
         }
      return e;
    }    
}