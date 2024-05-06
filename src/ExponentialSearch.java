import java.util.Arrays;

public class ExponentialSearch {

    public int search(int[] array,int target){
        int bound=1;
        int previousBound=0;
        while (array[bound] < target) {
            bound=bound + bound;
            previousBound=bound / 2;
            if(bound >= array.length){
                bound=array.length;
                previousBound=bound/2;
                break;
            }
        }
      return  binarySearch(array, previousBound, bound, target);
    }
    public int binarySearch(int[] array,int bound, int size,int key){
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("Start Bound is:-" + bound);
        System.out.println("End Bound is:-" + size);
        System.out.println("Key is:-" + key);
        int start=bound;
        int end=size;
  
        while(start<=end){
            int mid=(start+end)/2;
            System.out.println("Start is:" + start + "End is :" + end);
            if(array[mid] == key){
                return mid;
            }else if(array[mid] > key){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    
}
