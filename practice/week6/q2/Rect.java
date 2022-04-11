package practice.week6.q2;

public class Rect extends Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    Rect(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {

    }

    @Override
    void calculateArea() {
        int area = width * height;
        System.out.println("area: " + area);
    }
}
