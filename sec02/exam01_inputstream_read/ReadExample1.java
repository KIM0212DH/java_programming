package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("test.txt");
        int readByte;
        while ((readByte = is.read()) != -1)
            System.out.println((char) readByte);
        is.close();
    }
}
