package sec07.exam03_file_initialize;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("pby", "900212-2234567");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);

        Korean k2 = new Korean("dlwlrma", "930516-2654321");
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssm : " + k2.ssn);
    }
}
