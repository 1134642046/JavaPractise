package chapter12.pr9;

class MyException1 extends Exception{
    public void MyException1(String ss){
        System.out.println(ss);
    }
}

class MyException2 extends Exception{
    public void MyException2(String ss){
        System.out.println(ss);
    }
}

class MyException3 extends Exception{
    public void MyException3(String ss){
        System.out.println(ss);
    }
}
public class caughtAllException {

    public static void throwAllException(int x) throws MyException1,MyException2,MyException3{
        if (x == 0)throw new MyException1();
        if (x < 0)throw new MyException2();
        if (x > 0)throw new MyException3();
    }
    public static void main(String[] args) {
        try {
            throwAllException(-1);
            throwAllException(0);
            throwAllException(1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
