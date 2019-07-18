package chapter10;

public class pr5 {

    class Inner{

    }

}

class test1{
    pr5 p = new pr5();
    pr5.Inner i = p.new Inner();
}