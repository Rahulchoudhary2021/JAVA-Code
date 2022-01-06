public class Selectionshort1 {
   public static void main(String[] args) {
                int[] a={3,45,67,89,56,74,4,5,2};
         int n=a.length;

         for(int i=0;i<n-1;i++){
              int minIndex=i;
             for(int j=i;j<n;j++){
                  if(a[j]<a[minIndex]){
                          minIndex=j;
                  }}
                  int temp=a[i];
                  a[i]=a[minIndex];
                  a[minIndex]=temp;
         }
         for(int item: a){
              System.out.print(item +" ");

         }
       
   } 
}























 
