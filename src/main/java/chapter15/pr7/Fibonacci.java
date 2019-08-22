//: generics/Fibonacci.java
package chapter15.pr7; /* Added by Eclipse.py */
// Generate a Fibonacci sequence.

import net.mindview.util.Generator;

import java.util.Iterator;

public class Fibonacci implements Generator<Integer>, Iterable<Integer> {
  private int count = 0;
  private int n;
  Fibonacci(){}
  Fibonacci(int n){
    this.n = n;
  }
  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }
  public Iterator<Integer> iterator(){
    return new Iterator<Integer>() {
      public boolean hasNext() {
        return n > 0;
      }

      public Integer next() {
        n--;
        return  Fibonacci.this.next();
      }

      public void remove(){

      }
    };
  }


  public static void main(String[] args) {
    Fibonacci gen = new Fibonacci();
    for(Integer i : new Fibonacci(18)){
      System.out.print(i + " ");
    }
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
