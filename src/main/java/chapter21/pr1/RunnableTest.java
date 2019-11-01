package chapter21.pr1;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class RunnableTest implements Runnable{
    private static int count = 0;
    private final int id = count++;

    RunnableTest(){
        System.out.println("Runable("+id+") start");
    }
    public void run() {
        int i = 3;
        while(i-- > 0){
            System.out.println("RunnableTest("+id+") is runing\t");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Runable("+id+") stop");
    }
}
