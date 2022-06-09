package sec02.exam04_write_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("test3.txt");
        String data = "dlwlrma wook";
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
