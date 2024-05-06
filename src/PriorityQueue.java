public class PriorityQueue {
    private int[] priority_queue = new int[10];
    private int front = 0;

    public void add(int item) {
        if (front == priority_queue.length) {
            return; // Queue is full
        }

        int i;
        for (i = front - 1; i >= 0; i--) {
            if (priority_queue[i] > item) {
                priority_queue[i + 1] = priority_queue[i];
            } else {
                break;
            }
        }
        priority_queue[i + 1] = item;
        front++;
    }

    public void printList() {
        for (int i = 0; i < front; i++) {
            System.out.println(priority_queue[i]);
        }
    }
}
