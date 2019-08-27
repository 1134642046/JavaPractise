//: concurrency/Atomicity.java
package chapter21.pr12; /* Added by Eclipse.py */
// {Exec: javap -c Atomicity}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Atomicity implements Runnable{
  private static int i = 0;
  private static int count = 0;
  synchronized void f1() {
    i++;
    i++;
  }
  int getvalue() {
    return i;
  }

  public void run() {
    while(true){
      f1();
      Thread.yield();
    }
  }

  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    Atomicity at = new Atomicity();
    exec.execute(at);
    while(true){
      int value = at.getvalue();
      if (value%2 != 0){
        System.out.println("i = "+value);
        System.exit(0);
      }
    }
  }

} /* Output: (Sample)
...
void f1();
  Code:
   0:        aload_0
   1:        dup
   2:        getfield        #2; //Field i:I
   5:        iconst_1
   6:        iadd
   7:        putfield        #2; //Field i:I
   10:        return

void f2();
  Code:
   0:        aload_0
   1:        dup
   2:        getfield        #2; //Field i:I
   5:        iconst_3
   6:        iadd
   7:        putfield        #2; //Field i:I
   10:        return
*///:~
