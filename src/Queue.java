import java.util.Arrays;

public class Queue {
    private int[] items=new int[5];
    private int front=0;
    private int rear=0;
    
    public void add(int item){
        if(rear==items.length){
            return;
        }
        items[rear]=item;
        rear++;
    }
    public int remove(){
        if(rear==items.length){
            return -1;
        }
        int item=items[front];
        items[front]=0;
        front++;
        return item;
    }
    public void reverse(){
        int[] newItems=new int[items.length];
        for (int i = 0; i < items.length; i++) {
            newItems[i]=items[items.length-1-i];
        }
        items=newItems;
        front=0;
        rear=items.length;
    }

    @Override
    public String toString() {
        // Only return elements that are actually in the stack (up to 'count')
        return "Stack{" +
                "items=" + Arrays.toString(Arrays.copyOfRange(items, front,rear)) +
                '}';
    }
}
