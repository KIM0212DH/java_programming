package practice.week6.q1;

public class IPTV extends ColorTV {
    private String ip;
    private int size;
    private int color;

    IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }
    String getIp() {
        return ip;
    }
    @Override
    void printProperty() {
        System.out.println("나의 IPTV는 " + getIp() + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }

}
