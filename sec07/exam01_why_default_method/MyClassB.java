package sec07.exam01_why_default_method;

public class MyClassB implements MyInterFace {
    @Override
    public void method1() {
        System.out.println("MyClassB-method1() 실행");
    }

    @Override
    public void method2() {
        System.out.println("MyClassB-method2() 실행");
    }
}
