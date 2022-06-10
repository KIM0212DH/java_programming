public class ObjectPropertyEx {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p);
        String s = p.toString() + "점";
        System.out.println(s);
    }

}
class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


