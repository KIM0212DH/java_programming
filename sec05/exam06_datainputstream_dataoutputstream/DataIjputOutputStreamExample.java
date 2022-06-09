package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataIjputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);
    }
}
