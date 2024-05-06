import java.util.HashMap;
import java.util.Map;

public class SubString {
    private class Node{
        public String data;
        public int subStringLength;
        public Node leftChild;
        public Node rightChild;

        public Node(String data){
            this.data=data;
            //SubString length
             int maxLength = 0;
             Map<Character, Integer> lastIndexMap = new HashMap<>();
             int start = 0;
            for (int end = 0; end < this.data.length(); end++) {
               char c =  this.data.charAt(end);
               if (lastIndexMap.containsKey(c)) {
               start = Math.max(start, lastIndexMap.get(c) + 1);
              }
              lastIndexMap.put(c, end);
              maxLength = Math.max(maxLength, end - start + 1);
            } 
            this.subStringLength=maxLength;
        }
    }
    
    public Node root;

    public void inser(String str){
        var node=new Node(str);

    }
}