import java.util.Arrays;
import java.util.LinkedList;

public class BucketSort {
    public String sort(int[] array, int numOfBuckets) {
        // Create an array of LinkedLists
        LinkedList<Integer>[] arrayOfLists = new LinkedList[numOfBuckets];
        // Initialize each element of the array with a new LinkedList
        for (int i = 0; i < numOfBuckets; i++) {
            arrayOfLists[i] = new LinkedList<>();
        }
        
        // Distribute elements into buckets
        for (int i = 0; i < array.length; i++) {
            int bucket = array[i] / numOfBuckets;
            arrayOfLists[bucket].add(array[i]);
        }   

        // Sort each bucket and print
        for (LinkedList<Integer> list : arrayOfLists) {
            list.sort(null);
            System.out.println(list);
        }
        
        // Flatten the array of lists into a single array
        int index = 0;
        int[] result = new int[array.length];
        for (LinkedList<Integer> list : arrayOfLists) {
            for (int num : list) {
                result[index++] = num;
            }
        }
        
        // Return the sorted array as a string representation
        return Arrays.toString(result);
    }
}
