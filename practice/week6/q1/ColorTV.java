package practice.week6.q1;

public class ColorTV extends TV {
    private int size;
    private int color;
    ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    int getColor() {
        return color;
    }

    @Override
    void printProperty() {
        System.out.println(getSize() + "인치 " + getColor() + "컬러");
    }
}
