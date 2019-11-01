package chapter21.pr1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StartRunnable {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new RunnableTest());
        exec.shutdown();
    }
}
