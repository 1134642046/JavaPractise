package chapter21.pr15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static net.mindview.util.Print.print;

public class Name implements Runnable{
    private static String[] pac= new String[200];
    private static int count = 0;
    private int id = 0;
    Name(int a){
        id = a;
    }

    public synchronized void delete(String s){
        int i = getName(s);
        if (i != -1){
            pac[i] = "o";
        }
        print("delete"+id);
    }

    public synchronized int getName(String s){
        int ss = -1;
        for(int i = 0; i < 5; i++){
            if (s.equals(pac[i])){
                ss = i;
            }
        }
        System.out.println("get"+id);
        return ss;
    }


    public synchronized void setSs(String ss) {
        int i = getName(ss);
        if (i == -1){
            pac[count++] = ss;
        }
        print("set"+id);
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 3; i++){
            exec.execute(new Name(i));
        }

    }

    public void run() {
        String[] ss ={"wang","li","liu","ma","yu"};
        int count = 5;
        if (id == 0){
            while (count-- > 0){
                int  a = getName("wang");
            }
        }else if (id == 1){
            while (count-- > 0){
                setSs(ss[count]);
            }
        }else{
            while (count-- > 0){
                delete(ss[count]);
            }
        }
    }
}
