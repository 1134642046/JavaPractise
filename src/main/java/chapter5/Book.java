package chapter5;

public class Book {
    Book(){
        System.out.println("hello");
    }
    Book(String s){
        this();
        System.out.println(s);
    }

}
