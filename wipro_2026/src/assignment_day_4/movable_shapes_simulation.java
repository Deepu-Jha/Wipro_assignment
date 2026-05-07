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
     return "Point(" + x + ", " + y + ")";
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
     return "Rectangle TopLeft: " + topLeft + ", BottomRight: " + bottomRight;
 }
}


public class movable_shapes_simulation {
 public static void main(String[] args) {

     MovablePoint p = new MovablePoint(0, 0, 2, 3);
     MovableCircle circle = new MovableCircle(5, p);

     MovablePoint p1 = new MovablePoint(0, 10, 1, 1);
     MovablePoint p2 = new MovablePoint(5, 0, 1, 1);
     MovableRectangle rectangle = new MovableRectangle(p1, p2);

     System.out.println("Before Move:");
     System.out.println(circle);
     System.out.println(rectangle);

     circle.moveUp();
     circle.moveRight();
     rectangle.moveDown();
     rectangle.moveLeft();

     System.out.println("\nAfter Move:");
     System.out.println(circle);
     System.out.println(rectangle);
 }
}