package chapter11.pr28;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class doublePriorityQueue {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            pq.add(rand.nextDouble());
        }
        Iterator<Double> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(pq.poll() + " ");
        }
    }
}
