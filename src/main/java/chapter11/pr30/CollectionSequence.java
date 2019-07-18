//: holding/CollectionSequence.java
package chapter11.pr30; /* Added by Eclipse.py */

import typeinfo.pets.*;

import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence implements Collection {
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }

  public boolean isEmpty() {
    return false;
  }

  public boolean contains(Object o) {
    return false;
  }

  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }

  public Object[] toArray() {
    return new Object[0];
  }

  public boolean add(Object o) {
    return false;
  }

  public boolean remove(Object o) {
    return false;
  }

  public boolean addAll(Collection c) {
    return false;
  }

  public void clear() {
    if(this.size() != 0)
      for(Pet p : pets)
        p = null;
  }

  public boolean retainAll(Collection c) {
    return false;
  }

  public boolean removeAll(Collection c) {
    return false;
  }

  public boolean containsAll(Collection c) {
    return false;
  }

  public Object[] toArray(Object[] a) {
    return new Object[0];
  }

  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
    System.out.println(System.getProperty("user.dir"));
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
