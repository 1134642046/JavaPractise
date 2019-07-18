package chapter11.pr1;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int i){
        gerbilNumber = i;
    }

    public void hop(){
        System.out.println("jump: " +gerbilNumber);
        gerbilNumber++;
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> array = new ArrayList<Gerbil>();
        array.add(new Gerbil(1));
        array.add(new Gerbil(2));
        array.add(new Gerbil(3));
        array.add(new Gerbil(4));
        array.add(new Gerbil(5));
        Iterator<Gerbil> i = array.iterator();
        while(i.hasNext()) {
            i.next().hop();
        }
    }
}
