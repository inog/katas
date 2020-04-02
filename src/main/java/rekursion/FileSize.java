package rekursion;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File(("src/main/resources/test.png"));
        System.out.println("File exists:" + file.exists());
        double fileSize = file.length() / 1024d;
        System.out.println(String.format("%,2f kb", fileSize));
    }
}
