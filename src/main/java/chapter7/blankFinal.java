package chapter7;

public class blankFinal {
    private final int i;

    blankFinal(){
        i = 1;
    }

    void print(){
        System.out.println("i =  "+i);
        //i++;
        System.out.println("i = "+i);
    }
    public static void main(String[] args) {
        blankFinal bf = new blankFinal();
        bf.print();
    }
}
