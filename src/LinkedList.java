import java.util.NoSuchElementException;

public class LinkedList {
   private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public Node first;
    public Node last;

    
public void addLast(int item) {
    var node=new Node(item);
    if(first == null){
        first=last= node;
    }else{
        last.next=node;
        last=node;
    }
}

public void addFirst(int item) {
    var node=new Node(item);
    if(isEmpty()){
        first=last= node;
    }else{ 
        node.next=first;
        first=node;
    }
}
public int indexOf(int num) {
    int index=0;
    var current=first;
    while (current!=null) {
        if(current.value==num){
            return index;
        }
        current=current.next;
        index++;
    }
    return -1;
}
public boolean contains(int item){
    return indexOf(item) !=-1;
}
public void removeFirst(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    if(first==last){
        first=last=null;
    }
    var second=first.next;
    first.next=null;
    first=second;
    //It list only have one element
}

public void removeLast(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }

    var previous=getPrevious(last);
    last=previous;
    last.next=null;
}
public int size(){
    int count=0;
    if(isEmpty()){
        return count;
    }else{
        var current=first;
        while(current!=null){
            count++;
            current=current.next; 
        }
        return count;
    }
}
public int[] toArray(){
  int [] array=new int[size()];
  var current=first;
  var index=0;
  while(current!=null){
    array[index++] =current.value;
  }
  return array;
}

public void reverse(){

    if(isEmpty())return;
    Node prev=null;
    var current=first;
    Node next=null;

    while (current!=null) {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    first=prev;
}

public void getKthFromTheEnd(int k){
    if(k<=0 || k >size()){
        System.out.println("-1");
    }
    if(k==1){
        var current=first;
        while(current!=null){
            if(current.next==null){
                break;
            }
            current=current.next;
        }
        System.out.println( current.value);
    }
    if(k==2){
        var current=first;
        var second=first.next;
        while(second!=null){
          if(second.next==null){
            break;
          }
          second=second.next;
          current=current.next;
        }
        System.out.println("Runnning");
        System.out.println( current.value);
    }
    if(k>2){
        var current=first;
        var second=first;
      for (int i = 0; i < k; i++) {
        System.out.println(second.value + "->");
        second=second.next;
      }
      while (second!=null) {
        current=current.next;
        second=second.next;
      }
      System.out.println( current.value);
    }

}
public void printList(){
    var current=first;
    while(current!=null){
        System.out.println(current.value);
        current=current.next;
    }
}
private boolean isEmpty() {
    return first == null;
}
private Node getPrevious(Node node){
    var current=first;
    while(current!=null){
        if(current.next==node) return current;
        current=current.next;
    }
    return null;
}
}

