package chapter11.pr15;

import net.mindview.util.*;

import java.io.File;

public class StackCalculation {
    File f = new File(this.getClass().getResource("").getPath());
    public static void main(String[] args) {
        String s = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '+'){
                stack.push(s.charAt(++i));
            }
            if(s.charAt(i) == '-'){
                System.out.println(stack.pop()+" ");
            }

        }
        StackCalculation ss = new StackCalculation();
        System.out.println(ss.f);
    }
}
