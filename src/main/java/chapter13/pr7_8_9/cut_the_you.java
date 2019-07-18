package chapter13.pr7_8_9;

import net.mindview.util.Print;

import java.util.Arrays;

public class cut_the_you {
//    Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!
    String ss = Splitting.knights;

    public void Split(String s){
        System.out.println(Arrays.toString(ss.split(s)));
    }

    public static void main(String[] args) {
        cut_the_you c = new cut_the_you();
        c.Split("you|the");

    }
}
