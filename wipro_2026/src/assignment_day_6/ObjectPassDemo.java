package assignment_day_6;
class Box {
    int length;
    Box(int length) {
        this.length = length;
    }
}
public class ObjectPassDemo {
    static void modifyBox(Box b) {
        System.out.println("Inside method before change: " + b.length);
        b.length = 25;
        System.out.println("Inside method after change: " + b.length);
    }
    public static void main(String[] args) {
        Box box1 = new Box(10);
        System.out.println("Before method call: " + box1.length);
        modifyBox(box1);
        System.out.println("After method call: " + box1.length);
    }
}