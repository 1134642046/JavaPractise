//: typeinfo/Shapes.java
package typeinfo; /* Added by Eclipse.py */

import java.util.Arrays;
import java.util.List;
import static net.mindview.util.Print.print;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Rhomboid extends Shape{

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
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
      shape.draw();
  }
  Shape s = new Rhomboid();
  Circle c = (Circle)s;
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
