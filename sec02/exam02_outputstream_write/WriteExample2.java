package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("test.txt");
        byte[] data = "dlwlrma".getBytes();
        os.write(data);
        os.flush();
        os.close();
    }
}
