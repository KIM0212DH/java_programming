package practice.week6.q2;

public class Circle extends Shape{
    private int x;
    private int y;
    private int r;

    Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
    }

    @Override
    void draw() {

    }

    @Override
    void calculateArea() {
        double area = r * r * Math.PI;
        System.out.println("area: " + area);
    }
}
