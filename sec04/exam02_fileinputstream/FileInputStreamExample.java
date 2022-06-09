package sec04.exam02_fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sec02/exam01_byte/ByteExample.java");
            int data;
            while ( (data = fis.read() ) != -1 ) {
                System.out.write(data);
            }
            fis.close();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
