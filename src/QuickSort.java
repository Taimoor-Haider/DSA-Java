public class QuickSort {

    public void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }
    private void sort(int[] array,int start,int end) {

        //Base Condition
        if(start >= end){
            return;
        } 
        //Partition
        //0 - 9
        //0 , 3 (left)
        //5 , 9 (right)
        var boundary=partition(array,start,end);
        //Sort Left
        sort(array,start, boundary -1);
        //Sort Right
        sort(array, boundary +1, end);

    }

    private int partition(int[] array,int start,int end){
        var pivot=array[end];
        var boundary=start-1;
        for (int i = start; i <= end; i++) {
            if(array[i]<=pivot){
                boundary++;
                var temp=array[boundary];
                array[boundary]=array[i];
                array[i]=temp;
            }
        }
        return boundary;
    }
}
