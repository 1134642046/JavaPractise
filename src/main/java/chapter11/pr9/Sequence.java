package chapter11.pr9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private List items = new ArrayList();
    private int next = 0;

    public void add(Object x) {
            items.add(x);
    }
    //227
   public void prt(){
       Iterator<String> i = items.iterator();
       while (i.hasNext()){
           System.out.println(i.next());
       }
   }

    private class reverseSelector implements Selector {
        private int i = items.size()-1;
        public boolean end() {
            return i < 0;
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            i--;
        }
    }

//    public Selector getSequenceSelector() {
//        return new SequenceSelector();
//    }

    public Selector getReverseSelector() {
        return new reverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        sequence.prt();
        Selector ss = sequence.getReverseSelector();
        while (!ss.end()){
            System.out.print(ss.current() + " ");
            ss.next();
        }
    }
}