package chapter14.pr8_9;


import static net.mindview.util.Print.print;

class A {}

class B extends A {int a;}

class C extends B {String s;}
public class getObjectExtendsType {
    public void ClassTypeFrame(Object o){
        Object[] files = o.getClass().getDeclaredFields();
        if (files.length <= 0){
            print(o.getClass()+"has no files");
        }else{
            for (Object f: files) {
                print("Dec: "+f);
            }
        }
        if (o.getClass().getSuperclass() != null){
            print("SimpleName: "+o.getClass().getSimpleName());

            try {
                ClassTypeFrame(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
//        Class c = o.getClass();
//        for (Class cc: c.getInterfaces()) {
//            print("SimpleName: "+cc.getSimpleName());
//        }
    }

    public static void main(String[] args) {
        getObjectExtendsType g = new getObjectExtendsType();
        g.ClassTypeFrame(new C());
    }
}
