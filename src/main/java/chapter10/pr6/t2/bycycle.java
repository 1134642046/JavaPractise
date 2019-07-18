package chapter10.pr6.t2;

import chapter10.pr6.t1.car;

public class bycycle {
    protected class cycle implements car {

        public String wheel() {
            System.out.println("I is bycycle's InnerClass wheel");
            return "nihao";
        }
    }
}
