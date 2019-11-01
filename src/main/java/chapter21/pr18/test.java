package chapter21.pr18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class test implements Runnable{

    public static void main(String[] args) {
        test t = new test();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(t);
        exec.shutdownNow();
    }

    public void run() {
        sleepTest s = new sleepTest();
        s.sleep();

    }
}

class sleepTest{

    public void sleep(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            print("Thread is Interrupt");
        }
    }
}
