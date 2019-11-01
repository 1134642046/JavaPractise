//: concurrency/LiftOff.java
package chapter21.pr20; /* Added by Eclipse.py */
// Demonstration of the Runnable interface.

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class LiftOff implements Runnable {
  protected int countDown = 10; // Default
  private static int taskCount = 0;
  private final int id = taskCount++;
  public LiftOff() {}
  public LiftOff(int countDown) {
    this.countDown = countDown;
  }
  public String status() {
    return "#" + id + "(" +
      (countDown > 0 ? countDown : "Liftoff!") + "), ";
  }
  public void run() {
    while(countDown-- > 0) {
      System.out.print(status());
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        break;
      }
    }
//    try {
//      TimeUnit.SECONDS.sleep(1);
//    } catch (InterruptedException e) {
//      print(this.getClass().getSimpleName()+" is Interrupte");
//    }
  }
} ///:~
