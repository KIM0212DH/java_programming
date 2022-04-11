package practice.week6.q2;

abstract class Shape {
    private int x;
    private int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void draw();
    abstract void calculateArea();
    void showPoint() {
        System.out.println("point: (" + x + ", " + y + ")");
    }
}
