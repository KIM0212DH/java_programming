package sec05.exam04_casting;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();

        Bus bus = (Bus) vehicle;    //강제타입변환 다운캐스팅 isistance가 참일때 수행가능

        bus.run();
        bus.checkFare();
    }
}
