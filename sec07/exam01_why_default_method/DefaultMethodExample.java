package sec07.exam01_why_default_method;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterFace mi1 = new MyClassA();
        mi1.method1();
        mi1.method2();

        MyInterFace mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
    }
}