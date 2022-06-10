package gui;

import javax.swing.*;

class MyFrame2 extends JFrame {
    MyFrame2() {
        setTitle("첫번재 프레임");
        setSize(300,300);
        setVisible(true);
    }
}

public class MyApp {
    public static void main(String[] args) {
        MyFrame2 mf = new MyFrame2();
    }
}
