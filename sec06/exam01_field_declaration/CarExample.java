package sec06.exam01_field_declaration;

public class CarExample {
    public static void main(String[] args) {
        //create instance
        Car myCar = new Car();

        //read field
        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고 속도: " + myCar.maxSpeed);
        System.out.println("현재 속도: " + myCar.speed);

        //change field value
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
