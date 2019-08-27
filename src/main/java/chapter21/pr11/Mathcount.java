package chapter21.pr11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mathcount implements Runnable {
    private static String ss = "One";
    private volatile static boolean b = true;

    private int count1 = 0;
    private static String[] s = {"O","P","d","s","a"};
    Mathcount(int a){
        count1 = a;
    }

    public void run() {
        while (b){
            getSs(s[count1]);
        }
    }

    public synchronized void getSs(String In){
        ss = In;
        printSs(In);
    }

    public void printSs(String In) {
        if (ss.equals(In)){
            System.out.println(b);
        }else{
            System.out.println("Thread = "+count1+" ss = "+ss+" In = "+In);
            b = false;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new Mathcount(i));
        }
        exec.shutdown();
    }
}
