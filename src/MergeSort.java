public class MergeSort {
    public void sort(int[] array){
        //Base case
        if(array.length <2){
            return;
        }
        //Divide the array in half
        var middle=array.length / 2;
        int[] left=new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i]=array[i];
        }
        int[] right=new int[array.length - middle];
        for (int i = middle; i < array.length ; i++) {
            right[i - middle]=array[i];
        }
        //Sort the array
        sort(left);
        sort(right);
        //Merge the array
        merge(array, left, right);
 
   }
   public void merge(int[] result,int[] left,int[] right){
    int i=0;
    int j=0;
    int k=0;
    while (i < left.length && j < right.length) {
        if(left[i] <= right[j]){
            result[k++]=left[i++];
        }else{
            result[k++]=right[j++];
        }
    }
    while (i < left.length) {
        result[k++]=left[i++];
    }
    while (j < right.length) {
        result[k++]=right[j++];
    }
   }
}
