package sec11.exam01_final;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("900212-2234567", "pby");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "930516-2654321";
        //final 변수는 최초 선언할 때 한번, 혹은 생성자를 통해서 한번 정의 가능하다.
        p1.name = "dlwlrma";
    }
}
