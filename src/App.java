import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    // CustomArray numbers=new CustomArray(3);
    // numbers.insert(10);
    // numbers.insert(20);
    // numbers.insert(30);
    // numbers.insert(40);
    // numbers.insert(50);
    // numbers.removeAt(1);
    // System.out.println(numbers.indexOf(40));
    // numbers.print();

    // var list=new LinkedList();
    // list.addLast(10);
    // list.addLast(20);
    // list.addLast(30);
    // System.out.println(list.indexOf(20));
    // System.out.println(list.contains(100));
    // list.removeFirst();
    // System.out.println(list.indexOf(10));
    // System.out.println(list.size());
    // list.reverse();
    // System.out.println("Printing the LinkedList");
    // list.printList();
    // System.out.println("=======================");
    // list.getKthFromTheEnd(3);


    // System.out.println("==========================");
    // StringReverser stringReverser = new StringReverser();
    // System.out.println(stringReverser.reverse("abcdef"));
    // System.out.println("==========================");
    // BalanceString balanceString = new BalanceString();
    // System.out.println(balanceString.isBalanced("[{(1+2)]]]"));
    // System.out.println("==========================");
    // Stack stack = new Stack();
    // stack.push(1);
    // stack.push(2);
    // stack.push(3);
    // System.out.println(stack);
    // System.out.println(stack.peek());
    // stack.pop();
    // stack.pop();
    // stack.pop();
    // System.out.println("isEmpty:-" + stack.isEmpty());
    // System.out.println("isFull:-" + stack.isFull());
    // System.out.println(stack);
    // System.out.println(stack.peek());


    

    //  System.out.println("==========================");
    //  Queue queue = new Queue();
    //  queue.add(10);
    //  queue.add(20);
    //  queue.add(30);
    //  System.out.println(queue);
    // //  queue.remove();
    // //  queue.remove();
    //  System.out.println(queue);
    //  queue.reverse();
    //  System.out.println(queue);

    // QueueStack queueStack=new QueueStack();
    // queueStack.enqueue(10);
    // queueStack.enqueue(20);
    // queueStack.enqueue(30);
    // System.out.println(queueStack);
    // System.out.println(queueStack.dequeue());
    // System.out.println(queueStack.dequeue());
    // System.out.println(queueStack.dequeue());
    // System.out.println(queueStack.dequeue());


//     PriorityQueue pq=new PriorityQueue();
//     pq.add(14);
//     pq.add(8);
//     pq.add(12);
//     pq.add(2);
//     pq.add(1);
// pq.printList();


// Trees trees = new Trees();
// Trees trees2=new Trees();
// trees.insert(10);
// trees.insert(20);
// trees.insert(9);
// trees.insert(1);
// trees.insert(11);
// trees.insert(36);

// System.out.println("============Tree 2=============");
// trees2.insert(10);
// trees2.insert(20);
// trees2.insert(9);
// trees2.insert(1);
// trees2.insert(11);
// trees2.insert(36);
// System.out.println("============Tree 2=============");
// System.out.println(trees.find(2));
// System.out.println("==========Pre Order==========");
// trees.preorderTraversal();
// System.out.println("==========In Order==========");
// trees.inOrderTraversal();
// System.out.println("==========Post Order==========");
// trees.postOrderTraversal();
// System.out.println("==========Height==========");
// System.out.println(trees.height()); 


// System.out.println("==========Tree 2=========="); 
// System.out.println("==========Validate BTS=========="); 
// System.out.println(trees.validateBTS());
// System.out.println("==========GET Kth Element=========="); 
// trees.getKthElements(0);


// var bubbleSort=new BubbleSort();
// for (int i = 0; i < bubbleSort.sort().length; i++) {
//     System.out.println(bubbleSort.sort()[i]);
// }
// int[] arr={10,4,2,20,49,1,0,3};
// var selectionSort=new SelectionSort();
// System.out.println(selectionSort.sort(arr));


// int[] arr={7,3,5,2,3,1,5,8};
// var insertionSort=new InsertionSort();
// System.out.println(insertionSort.sort(arr));
// var mergeSort=new MergeSort();
// mergeSort.sort(arr);
// System.out.println(Arrays.toString(arr));

// var quickSort=new QuickSort();
// quickSort.sort(arr);
// System.out.println(Arrays.toString(arr));

// var countSort=new CountingSort();
// System.out.println(countSort.sort(arr));

// var bucketSort=new BucketSort();
// System.out.println(bucketSort.sort(arr,3));
// int[] arr={7,3,5,2,3,1,5,8};
// var binarySearch=new BinarySearch();
// System.out.println(binarySearch.search(arr, arr.length, 3));

// var ternerySearch=new TernerySearch();
// System.out.println(ternerySearch.search(arr, 8));


// var jumpSort=new JumpSearch();
// System.out.println(jumpSort.search(arr,8));

// int[] arr={7,3,5,2,3,1,5,8};
int[] arr2={3,5,6,9,11,18,20,21,24,30};
var exponentialSearch=new ExponentialSearch();
System.out.println(exponentialSearch.search(arr2, 30));
    }
}
