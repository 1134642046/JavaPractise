package chapter21.pr1;

import static net.mindview.util.Print.print;

public class RunnableTest implements Runnable{
    private static int count = 0;
    private final int id = count++;

    RunnableTest(){
        print();
        print("Runable("+id+") start");
    }
    public void run() {
        int i = 3;
        while(i-- > 0){
            System.out.print("RunnableTest("+id+") is runing\t");
            Thread.yield();
        }
        print();
        print("Runable("+id+") stop");
    }
}
