package fileReadandWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class useFile {
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream("File.txt");

        byte[] bytes = new byte[1024];

        for

        FileOutputStream fos = new FileOutputStream("SomeRandomText.txt");

        String string = "some 随机的 strings";

        byte[] bytes = string.getBytes();

        fos.write(bytes);

        fos.close();
    }
}
