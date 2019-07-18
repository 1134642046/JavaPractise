// strings/Scanner20.java
// TIJ4 Chapter Strings, Exercise 20, page 549
/* Create a class that contains int, long, float and double and String fields.
 * Create a constructor for this class that takes a single String argument, and
 * scans that string into the various fields. Add a toString(0 method and
 * demonstrate that your class works correctly.
 */

package chapter13;

import java.util.Scanner;

import static net.mindview.util.Print.print;

public class pr20 {
    String s;
    int a;
    float b;
    double c;
    long d;

    public pr20(String ss){
        Scanner scaner = new Scanner(ss);
        this.s = scaner.next();
        this.a = scaner.nextInt();
        this.b = scaner.nextFloat();
        this.c = scaner.nextDouble();
        this.d = scaner.nextLong();
    }

    @Override
    public String toString() {
        return "pr20{" +
                "s='" + s + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public static void main(String[] args) {
        String s = new String("hello 16 1.23456 6661.112 521348685");
        pr20 p =new pr20(s);
        print(p.toString());
    }
}
