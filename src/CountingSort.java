import java.util.Arrays;

public class CountingSort {
    public String sort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] count = new int[max + 1];
        for (int value : array) {
            count[value]++;
        }

        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                result[index++] = i;
            }
        }

        return Arrays.toString(result);
    }
}
