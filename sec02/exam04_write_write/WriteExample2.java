package sec02.exam04_write_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("test3.txt");
        char[] data = "dlwlrma".toCharArray();
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
