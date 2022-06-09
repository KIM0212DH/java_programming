package sec04.exam01_file;

import java.io.File;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("Dir");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("test3.txt");

        if (dir.exists() == false) {
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            file2.createNewFile();
        }
        if (file3.exists() == false) {
            file3.createNewFile();
        }

        System.out.println(file3);
        System.out.println(file3.getPath());
        System.out.println(file3.getName());
    }
}
