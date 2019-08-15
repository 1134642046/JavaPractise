//: typeinfo/SweetShop.java
package chapter14.pr7; /* Added by Eclipse.py */
// Examination of the way the class loader works.
import static net.mindview.util.Print.print;

class Candy {
  static { print("Loading Candy"); }
}

class Gum {
  static { print("Loading Gum"); }
}

class Cookie {
  static { print("Loading Cookie"); }
}

public class SweetShop {
  public static void main(String[] args) {
    Class c = null;

    try {
      c = Class.forName(args[0]);
      print("Enjoy "+args[0]);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

//    print("inside main");
//    new Candy();
//    print("After creating Candy");
//    try {
//      Class.forName("chapter14.pr7.Gum");
//    } catch(ClassNotFoundException e) {
//      print("Couldn't find Gum");
//    }
//    print("After Class.forName(\"Gum\")");
//    new Cookie();
//    print("After creating Cookie");
  }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
