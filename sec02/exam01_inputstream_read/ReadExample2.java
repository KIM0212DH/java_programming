package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("test.txt");

        int readByteNo;
        byte[] readBytes = new byte[3];
        String data = "";
        while((readByteNo = is.read(readBytes)) != -1)
            data += new String(readBytes, 0, readByteNo);
            //String(문자열로 바꿀 배열, 시작위치, 개수)
        System.out.println(data);
        is.close();
    }
}