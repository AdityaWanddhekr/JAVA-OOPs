public class SortArray {
   int[] getSort(ArrayCon A) {
      for (int i = 0; i < A.a.length; i++) {
         for (int j = i + 1; j < A.a.length; j++) {
            if (A.a[i] > A.a[j]) {
               int temp = A.a[i];
               A.a[i] = A.a[j];
               A.a[j] = temp;
            }
         }
      }
      return A.a;
   }
}