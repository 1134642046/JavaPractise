package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static net.mindview.util.Print.print;
class D{
    int a;
    D(){
        this(0);
    }
    D(int c){
        a = c;
    }
    public int getA() {
        return a;
    }

    public void inc(){
        a++;
    }

    @Override
    public String toString() {
        return "D{" +
                "a=" + a +
                '}';
    }
}

abstract class A {
    int a = 0;
    D d = new D();

    public D getA() {
        return new D(d.getA());
    }

    public abstract void incr();

}
class B extends A{

    public void incr(){
        d.inc();
    }
    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
class C extends A{

    public void incr(){
        d.inc();
//        print(d.getA());
    }
    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
public class test implements Runnable{
    private A a;
    test(A a){
        this.a = a;
    }
    public void run() {
        int count = 10;

       for(int i = 0; i < 5; i++){
            a.incr();
        }

        print(a.getA());
    }

    //
}

class s{

    static void testS(A a,A b){
        A a1 = a;
        A b1 = b;
        test t1 = new test(a1);
        test t2 = new test(b1);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(t1);
        exec.execute(t2);
        exec.shutdown();
    }
    public static void main(String[] args) {
        A b = new B();
        A c = new C();
        testS(b,c);
    }
}
