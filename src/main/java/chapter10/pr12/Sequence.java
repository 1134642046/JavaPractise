package chapter10.pr12;

import java.util.ArrayList;
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
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.size();
        }
        public Object current() {
            return items.get(i);
        }
        public void next() {
            if(i < items.size()) i++;
        }
    }

    private class reverseSelector implements Selector{
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

    public Selector getSequenceSelector() {
        return new SequenceSelector();
    }

    public Selector getReverseSelector() {
        return new reverseSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.getSequenceSelector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        Selector ss = sequence.getReverseSelector();
        while (!ss.end()){
            System.out.print(ss.current() + " ");
            ss.next();
        }
    }
}