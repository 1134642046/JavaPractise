package chapter12.pr1;

public class MyException extends Exception{
    String ss;
    public MyException (String s){
        ss = s;
    };

    public void print1(){
        System.out.println(ss);
    }
}

class test{
    public static void f() throws MyException{
        throw new MyException("Hello");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (MyException e){
            e.printStackTrace();
            e.print1();
        }
    }
}
