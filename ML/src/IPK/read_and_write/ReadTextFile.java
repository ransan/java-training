package IPK.read_and_write;

import java.io.File;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/file/github-recovery-codes.txt");
        System.out.println("getAbsoluteFile : " +  f1.getAbsoluteFile());
        System.out.println("getName : " + f1.getName());
        System.out.println("getPath : "+ f1.getPath());
        System.out.println("getParentFile : " + f1.getParentFile());
        System.out.println("getCanonicalPath : "+ f1.getCanonicalPath());
        System.out.println("exists : " + f1.exists());
        System.out.println( "canRead : " + f1.canRead());
        System.out.println( "canWrite : "+ f1.canWrite());
        System.out.println("isAbsolute : " + f1.isAbsolute());
        System.out.println("lastModified : " + f1.lastModified());
        System.out.println("length : "+ f1.length());
        System.out.println("isFile : "+ f1.isFile());
        System.out.println("isDirectory : "+ f1.isDirectory());

    }
}
