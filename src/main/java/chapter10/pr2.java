package chapter10;


class string{
    String ss;
    public string(String s){
        ss = s;
    }
    @Override
    public String toString() {
        return ss;
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class pr2 {
    private Object[] items;
    private int next = 0;
    public pr2(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if(i < items.length)
                i++;
        }

        public void createPr2(){
            pr2 p = pr2.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
       //原来代码计数、存储
        pr2 sequence = new pr2(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        //练习2创建对象存入pr2
        pr2 string = new pr2(3);
        string.add(new string("good"));
        string.add(new string("hello"));
        string.add(new string("mo"));
        Selector selector2 = string.selector();
        while(!selector2.end()) {
            System.out.print(selector2.current() + " ");
            selector2.next();
        }
    }
}
