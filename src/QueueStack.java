import java.util.Stack;

public class QueueStack {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();


    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){

        if(stack1.isEmpty() && stack2.isEmpty()){
         return -1;
        }
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
       return stack2.pop();
    }

    @Override
    public String toString() {
        return "QueueStack{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
    
}
