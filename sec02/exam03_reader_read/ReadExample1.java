package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("test.txt");

        int readData;
        while ((readData = reader.read()) != -1)
            System.out.println((char)readData);

        reader.close();
    }
}
