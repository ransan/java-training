package IPK.read_and_write;

import java.io.File;

public class ReadDirectoryProps {
    public static void main(String[] args) {
        File f1 = new File("read_and_writee");
        System.out.println(f1.isDirectory());
        f1.mkdirs();
        System.out.println(f1.isDirectory());
        System.out.println(f1.delete());
    }
}
