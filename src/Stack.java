import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count = 0;

    public void push(int item) {
        if (count == items.length) {
            return; // Array is full, cannot push more elements
        }
        items[count++] = item;
    }

    public int pop() {
        if (count == 0) {
            return -1; // Array is empty, cannot pop elements
        }
        return items[--count];
    }

    public int peek() {
        if (count == 0) {
            return -1; // Array is empty, cannot peek elements
        }
        return items[count - 1];
    }
    public boolean isFull() {
        return count == items.length;
    }
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        // Only return elements that are actually in the stack (up to 'count')
        return "Stack{" +
                "items=" + Arrays.toString(Arrays.copyOfRange(items, 0, count)) +
                '}';
    }
}
