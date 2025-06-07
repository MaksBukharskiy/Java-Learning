package StackLearning;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
                                                                                                    
        System.out.println(stack.pop());
        System.out.println(stack.search("e"));
        
    }
}
