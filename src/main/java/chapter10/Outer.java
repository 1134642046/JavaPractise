package chapter10;

public class Outer {
    private String ss;

    public Outer(String s2){
        ss = s2;
    }

    class Inner{
        String s1 = "hellp";
        public void print(){
            System.out .println(ss);
        }
    }

    public Inner returnInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer("hello");
        Outer.Inner inner = outer.returnInner();
        inner.print();
    }
}
