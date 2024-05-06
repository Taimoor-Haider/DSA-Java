public class TernerySearch {
    public int search(int[] arr,int target){
       return search(arr, target,0,arr.length - 1);
    }
    private int search(int[] arr,int target, int left ,int right){
        if(left > right){
            return -1;
        }
        int partitionSize=(right - left) / 3;
        int mid1=left + partitionSize;
        int mid2=right - partitionSize;

        if(arr[mid1] == target){
            return mid1;
        }
        if(arr[mid2] == target){
            return mid2;
        }
        if(target < arr[mid1]){
            return search(arr, target, left, mid1-1);
        }
        if(target < arr[mid2]){
            return search(arr, target, mid2+1,right);
        }

        return search(arr, target, mid1+1, mid2-1);
    }
}
