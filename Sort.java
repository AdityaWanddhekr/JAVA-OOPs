public class Sort
{
   Student[] getSort(Student s[]){
      for(int i=0;i<s.length;i++){
         for(int j=i+1;j<s.length;j++){
              
              double p1=s[i].per;
              double p2=s[j].per;

             if(p1<p2){
                Student temp=s[i];
                s[i]=s[j];
                s[j]=temp;
             } 
         } 
      }
    return s;
   }
}