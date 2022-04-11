package practice.week5.q2;
class ArrayUtil {
    public static int [] concat(int [] a, int[] b) {
        int size = a.length + b.length;
        int ret[]= new int[size];
        int i = 0;
        for (; i < a.length; i++) {
            ret[i] = a[i];
        }
        for (int j = 0; i < a.length + b.length; i++, j++) {
            ret[i] = b[j];
        }
        return (ret);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
public class StaticEx {
    public static void main(String[] args) {
        int [] array1 = { 1, 5, 7, 9};
        int [] array2 = {3, 6, -1, 100, 77};
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
