//: generics/RandomList.java
package chapter15.pr6; /* Added by Eclipse.py */

import java.util.ArrayList;
import java.util.Random;

import static net.mindview.util.Print.print;

public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    int i;
    RandomList<String> rs = new RandomList<String>();
    RandomList<Integer> rl1 = new RandomList<Integer>();
    for(i = 0; i < 10; i++){
      rl1.add(i);
    }
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for( i = 0; i < 11; i++)
      System.out.print(rs.select() + " ");
    print();
    for( i = 0; i < 10; i++)
      System.out.print(rl1.select() + " ");
//    for( i = 0; i < 11; i++)
//      System.out.print(rs.select() + " ");
  }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
