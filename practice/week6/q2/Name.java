package practice.week6.q2;

public class Name {
    public static void main(String[] args) {
        Rect r = new Rect(1, 2, 3, 4);
        Circle c = new Circle(5, 6, 7);
        printInfor(r);
        printInfor(c);
    }

    static void printInfor(Shape s) {
        System.out.println(s.getClass().getSimpleName());
        s.showPoint();
        s.calculateArea();
    }
}
