public class Trees {
    public class Node{
        int value;
        Node leftChild;
        Node rightChild;
        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return value+"";
        }
    }
    public Node root ;
     

    public void insert(int value){
        var node=new Node(value);
        if(root==null){
            root=node;
            return;
        }else{
          Node current=root;
          while (true) {
            if(value <current.value){
                if(current.leftChild==null){
                    current.leftChild=node;
                    break;
                }
              current=current.leftChild;
            }else{
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
              current=current.rightChild;
            }
        
          }
        }

    } 

    public boolean find(int value){
        var current=root;
        while (current!=null) {
             if(value <current.value){
                current=current.leftChild;
             }else if(value>current.value){
                current=current.rightChild;
             }else{
                return true;
             }
        }
        return false; 
    }


    public void preorderTraversal(){
        preorderTraversal(root);
    }
    private void preorderTraversal(Node root){
        if(root ==null){
            return;
        }
        System.out.println(root.value);
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node root){
        if(root ==null){
            return;
        }
        inOrderTraversal(root.leftChild);
        System.err.println(root.value);
        inOrderTraversal(root.rightChild);
        
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node root){
        if(root ==null){
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.err.println(root.value);
        
    }

    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root ==null){
            return -1;
        }
        if(root.leftChild == null && root.rightChild == null){
            return 0;
        }
        return 1+Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int min(){
      return min(root);
    }
    private int min(Node root){
        if(root.leftChild ==null && root.rightChild ==null){
            return -1;
    }
    var left=min(root.leftChild);
    var right=min(root.rightChild);

    return Math.min(Math.min(left,right),root.value);
}
private int max(Node root){
    if(root.leftChild ==null && root.rightChild ==null){
        return -1;
    }
    var left=min(root.leftChild);
    var right=min(root.rightChild);

    return Math.max(Math.max(left,right),root.value);

}
private int minInBST(Node root){
    if(root.leftChild ==null && root.rightChild ==null){
        return -1;
    }
    var current=root.leftChild;
    while(current.leftChild!=null){
        current=current.leftChild;
    }
    return current.value;
}

private int maxInBST(Node root){
    if(root.leftChild == null && root.rightChild == null){
        return -1;
    }
    var current=root.rightChild;
    while(current.rightChild!=null){
        current=current.rightChild;
    }
    return current.value;
}

private boolean equal(Node root1, Node root2) {
    if (root1 == null && root2 == null) {
        return true;
    }

    if (root1 != null && root2 != null && root1.value == root2.value) {
        // Recursively check the equality of left and right subtrees
        return equal(root1.leftChild, root2.leftChild) && equal(root1.rightChild, root2.rightChild);
    }

    return false;
}
public boolean validateBTS(){
    return validateBTS(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
private boolean validateBTS(Node root,int min,int max){
    if(root == null){
        return true;
    }
    if(root.value < min && root.value > max){
        return true;
    }
    return validateBTS(root.leftChild,min,root.value-1) && validateBTS(root.rightChild,root.value+1,max);
}

public void getKthElements(int distance){
    getKthElements(root,distance);
}
private void getKthElements(Node root,int distance){
    if(root==null){
        System.out.println("The tree is empty");
        return;
    }
    if(distance==0){
        System.out.println(root.value);
        return;
    };
        getKthElements(root.leftChild,distance-1);
        getKthElements(root.rightChild,distance-1);
}
}