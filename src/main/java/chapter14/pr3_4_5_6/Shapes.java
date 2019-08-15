//: typeinfo/Shapes.java
package chapter14.pr3_4_5_6; /* Added by Eclipse.py */

import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Rhomboid extends Shape {

  public String toString() {
    return "Rhomboid";
  }
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}

public class Shapes {
  public static void rotate(Shape s){
    if (!(s instanceof Circle)){
      print("this is not Circle");
    }
  }
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid()
    );
    for(Shape shape : shapeList)
      shape.draw();
    System.out.println();
    for (Shape shape: shapeList) {
      rotate(shape);
    }
//    Shape s = new Rhomboid();
//    if (s instanceof Rhomboid){
//      print("s === Rhomboid");
//    }

//    Circle c = (Circle)s;
//    print(c);
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
