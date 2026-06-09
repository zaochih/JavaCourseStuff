package useFileIOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class useIO {
    static void main() throws IOException {
        File file = new File("File.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
//        FileWriter fw = new FileWriter(file, true);



        fos.close();
    }
}
