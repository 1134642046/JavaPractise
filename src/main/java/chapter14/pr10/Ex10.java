package chapter14.pr10;

import chapter14.pr8_9.getObjectExtendsType;

import static net.mindview.util.Print.print;

public class Ex10 {

    public static void main(String[] args) {
        int i;
        char[] a = {'a','b'};
        getObjectExtendsType g = new getObjectExtendsType();
        print(a.getClass().getSuperclass());
        print(""+a instanceof Object);
    }
}

