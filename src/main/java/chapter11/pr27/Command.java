// holding/Queue27.java
// TIJ4 Chapter Holding, Exercise 27, page 424
/* Write a class called Command that contains a String and has a method operation()
 * that displays the String. Write a second class with a method that fills a Queue
 * with Command objects and returns it. Pass the filled Queue to a method in a third
 * class that consumes the objects in the Queue and calls their operation() methods.
 */
package chapter11.pr27;

import java.util.LinkedList;
import java.util.Queue;

public class Command {
    String ss;
    public Command(String ss){
        this.ss = ss;
    }
    public void operation(){
        System.out.println(this.ss);
    }
}

class A1{
    Queue<Command> q = new LinkedList<Command>();

    public Queue<Command> addCommand(){
        for (int i = 0; i < 10; i++) {
            q.offer(new Command(i+""));
        }
        return q;
    }}

class A2{

    public static void main(String[] args) {
        A1 a = new A1();
        Command c;
        Queue<Command> queue = a.addCommand();
        while((c = queue.poll()) != null){
            c.operation();
        }
    }
}