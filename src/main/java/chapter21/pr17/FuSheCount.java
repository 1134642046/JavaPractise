package chapter21.pr17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

class Count{
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public synchronized void inCrement(){
        count++;
    }
}

public class FuSheCount implements Runnable{
    private static boolean cancel = false;
    private final int id;
    private int number = 0;
    private static Count c = new Count();

    public static int getTotal(){
        return c.getCount();
    }

    public FuSheCount(int i) {
        id = i;
    }

    public static void iscCncel(){
        cancel = true;
    }

    public void run() {
        while (!cancel){
            number++;
            c.inCrement();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                print("sleep interrupted");
            }
        }
        print(this + " "+"count: "+c.getCount());
    }

    @Override
    public String toString() {
        return "FuShe-"+id+" "+number;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new FuSheCount(i));
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            FuSheCount.iscCncel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exec.shutdown();
        try {
            if (!exec.awaitTermination(1000,TimeUnit.MILLISECONDS));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        print(c.getCount());
    }
}
