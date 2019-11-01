package niuke;

import java.util.Stack;

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            for (int i = 0; !stack1.empty(); i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}

public class offer5 {
    public static void main(String[] args) {

    }
}
