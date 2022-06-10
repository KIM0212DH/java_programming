package sec04.exam01_generic_method;

public class test {
    public static <T> void fun(T t) {
        System.out.println(t.getClass().getName());
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 5;
        fun(a);
        test.<Integer>fun(a);
        //test.<int>fun(a); generic에선 객체타입만 가능
    }
}
