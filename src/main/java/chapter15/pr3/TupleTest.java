package chapter15.pr3;

class A{}
class B{}
class c{}
public class TupleTest {

    public sixTuole<A,B,c,Integer,String,Double> f(){
        return new sixTuole(new A(),new B(), new c(),new Integer(15),"hello",new Double(15.2));
    }

    public static void main(String[] args) {
        TupleTest t = new TupleTest();
        System.out.print(t.f());
    }
}
