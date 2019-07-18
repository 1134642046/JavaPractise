//: strings/SplitDemo.java
package chapter13.pr14; /* Added by Eclipse.py */

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class SplitDemo {
  public static void main(String[] args) {
    String input =
      "This!!unusual use!!of exclamation!!points";
    print(Arrays.toString(
      Pattern.compile("!!").split(input)));
    // Only do the first three:
    print(Arrays.toString(
      Pattern.compile("!!").split(input, 3)));
    print(Arrays.toString(input.split("!!")));
  }
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
