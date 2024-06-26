import java.util.Stack;

public class BalanceString {
    public boolean isBalanced(String input){
    Stack<Character> stack=new Stack<>();
        if(input == null){
            return false;
        }
        for(char ch:input.toCharArray()){
            if(ch=='(' || ch=='<'|| ch=='{' || ch=='['){
             stack.push(ch);
            }
            if(ch==')' || ch=='>'|| ch=='}' || ch==']'){
                if(stack.empty())return false;
                var top=stack.pop();
                if(ch==')' && top !='(' || ch=='>' && top !='<' || ch=='}' && top !='{' ||  ch==']' && top !='['){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
