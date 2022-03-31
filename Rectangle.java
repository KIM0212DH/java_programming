public class Rectangle {
    double x;
    double y;
    double width;
    double height;

    Rectangle(double x, double y, double width)
    {
        this(x, y, width, width);
    }
    Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    double getWidth()
    {
        return width;
    }
    double getHeight()
    {
        return height;
    }
    int square()
    {
        return (int)(width * height);
    }
    void show()
    {
        System.out.println("("+ (int)x + ","+ (int)y +")에서 크기가 " + (int)width + "x" + (int)height + "인 사각형");
    }

    boolean contains(Rectangle r)
    {
        /*System.out.println("r.getX(): " + r.getX() + " this.getX(): "+ this.getX());

        System.out.println("r.getWidth()/2 :" + r.getWidth()/2 + " this.getWidth()/2 :" + this.getWidth()/2);
        System.out.println("r.getX() + r.getWidth()/2 :"+ (r.getX() + r.getWidth()/2) + " this.getX() + this.getWidth()/2 :" + (this.getX() + this.getWidth()/2));

        System.out.println("r.getHeight()/2 :" + r.getHeight()/2 + " this.getHeight()/2 :" + this.getHeight()/2);
        System.out.println("r.getY() + r.getHeight()/2 :"+ (r.getX() + r.getHeight()/2) + " this.getY() + this.getHeight()/2 :" + (this.getX() + this.getHeight()/2));
        System.out.println();
        */

        if (r.getX() + r.getWidth()/(double)2 <= this.getX() + this.getWidth()/(double)2 && r.getY() + r.getHeight()/(double)2 <= this.getY() + this.getHeight()/(double)2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6);
        Rectangle t = new Rectangle(1, 1, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if(t.contains(s))
            System.out.println("t는 s를 포함합니다.");
    }
}
