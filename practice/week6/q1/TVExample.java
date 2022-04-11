package practice.week6.q1;

import sec07.exam01_promotion.C;

public class TVExample {
    public static void main(String[] args) {
        TV myTV = new TV(24);
        myTV.printProperty();
        ColorTV myColorTV = new ColorTV(32, 1024);
        myColorTV.printProperty();
        IPTV myIPTV = new IPTV("192.1.1.2", 32, 2048);
        myIPTV.printProperty();
    }
}
