package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("test2.txt");
        byte[] data = "dlwlrma".getBytes();
        for (int i = 0; i < data.length; i++)
            os.write(data[i]);
        os.flush();
        os.close();
    }
}
