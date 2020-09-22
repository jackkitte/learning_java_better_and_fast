import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            f.createNewFile();
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());

            f.renameTo(new File("rename.txt"));
            System.out.println(f.isFile());
            System.out.println(f.exists());
            System.out.println(f.delete());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
