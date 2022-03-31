package sec10.exam03_static_be_careful;

public class Car {
    int speed;

    void run()
    {
        System.out.println(speed + "으로 달립니다");
    }

    public static void main(String[] args) {
        // speed = 60;
        // run()
        //메인이 static 이므로 instance의 멤버를 객체 없이 사용할 수 없다

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
