package practice.week6.q1;

class TV {
    private int size;

    TV(int size) {
        this. size = size;
    }
    int getSize() {
        return size;
    }
    void printProperty() {
        System.out.println(getSize() + "인치");
    }
}
