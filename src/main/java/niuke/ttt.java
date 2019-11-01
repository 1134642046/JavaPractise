package niuke;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ttt {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new RunnableTest());
        exec.execute(new RunnableTest2());
        exec.shutdown();
    }
}

class RunnableTest implements Runnable{
    private  int count = 1;
    private int id;
    private char c;
    public void run() {
        int i = 1;
        while(count < 100){
            System.out.print(i);
            Thread.yield();
            i++;
            i=i%10;
        }
    }
}

class RunnableTest2 implements Runnable{
    private  int count = 0;
    private char c = 'A';
    public void run() {
        while(count < 100){

            System.out.print((char)(c+count));
            Thread.yield();
            count++;
            count=count%26;
        }
    }
}

