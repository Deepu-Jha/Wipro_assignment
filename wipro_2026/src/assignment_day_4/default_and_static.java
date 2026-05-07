package assignment_day_4;

interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

class MovablePoint implements Movable {
 int x, y, xSpeed, ySpeed;

 MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }

 public void moveUp() { y += ySpeed; }
 public void moveDown() { y -= ySpeed; }
 public void moveLeft() { x -= xSpeed; }
 public void moveRight() { x += xSpeed; }

 public String toString() {
     return "(" + x + ", " + y + ")";
 }
}

class MovableCircle implements Movable {
 int radius;
 MovablePoint center;

 MovableCircle(int radius, MovablePoint center) {
     this.radius = radius;
     this.center = center;
 }

 public void moveUp() { center.moveUp(); }
 public void moveDown() { center.moveDown(); }
 public void moveLeft() { center.moveLeft(); }
 public void moveRight() { center.moveRight(); }

 public String toString() {
     return "Circle center: " + center + ", radius: " + radius;
 }
}

class MovableRectangle implements Movable {
 MovablePoint topLeft, bottomRight;

 MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
     if (topLeft.xSpeed != bottomRight.xSpeed ||
         topLeft.ySpeed != bottomRight.ySpeed) {
         throw new IllegalArgumentException("Points must have same speed");
     }
     this.topLeft = topLeft;
     this.bottomRight = bottomRight;
 }

 public void moveUp() {
     topLeft.moveUp();
     bottomRight.moveUp();
 }

 public void moveDown() {
     topLeft.moveDown();
     bottomRight.moveDown();
 }

 public void moveLeft() {
     topLeft.moveLeft();
     bottomRight.moveLeft();
 }

 public void moveRight() {
     topLeft.moveRight();
     bottomRight.moveRight();
 }

 public String toString() {
     return "Rectangle TL: " + topLeft + ", BR: " + bottomRight;
 }
}


interface Polygon {
 double getArea();

 default double getPerimeter(int... sides) {
     int sum = 0;
     for (int s : sides) sum += s;
     return sum;
 }

 static String shapeInfo() {
     return "Polygons are 2D shapes with straight sides.";
 }
}

class Rectangle implements Polygon {
 int length, width;

 Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 public double getArea() {
     return length * width;
 }
}

class Triangle implements Polygon {
 int base, height;

 Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 public double getArea() {
     return 0.5 * base * height;
 }
}


public class default_and_static {
 public static void main(String[] args) {

     MovablePoint p = new MovablePoint(0, 0, 2, 3);
     MovableCircle c = new MovableCircle(5, p);

     MovablePoint p1 = new MovablePoint(0, 10, 1, 1);
     MovablePoint p2 = new MovablePoint(5, 0, 1, 1);
     MovableRectangle r = new MovableRectangle(p1, p2);

     System.out.println(c);
     System.out.println(r);

     c.moveUp();
     c.moveRight();
     r.moveDown();
     r.moveLeft();

     System.out.println(c);
     System.out.println(r);

    
     Rectangle rect = new Rectangle(10, 5);
     Triangle tri = new Triangle(6, 4);

     System.out.println("Rectangle Area: " + rect.getArea());
     System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));

     System.out.println("Triangle Area: " + tri.getArea());
     System.out.println("Triangle Perimeter: " + tri.getPerimeter(3, 4, 5));

     System.out.println(Polygon.shapeInfo());
 }
}