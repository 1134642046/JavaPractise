//: innerclasses/Sequence.java
package chapter15.pr4; /* Added by Eclipse.py */
// Holds a sequence of Objects.

import java.util.ArrayList;
import java.util.List;

interface Selector {
  boolean end();
  Object current();
  void next();
}

public class Sequence<A> {
  private List<A> items;
  private int next = 0;
  public Sequence() { items = new ArrayList<A>(); }
  public void add(A a) {
      items.add(a);
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public A current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
