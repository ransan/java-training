package IPK.read_and_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingTextFile {
    public static void main(String[] args) throws IOException {
        String input = "This is an Demo of IO Library";
        byte[] bytes = input.getBytes();
        FileOutputStream f1 = new FileOutputStream("file1.txt");
        f1.write(bytes);
        f1.close();
    }
}
