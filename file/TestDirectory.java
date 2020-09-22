import java.io.File;

public class TestDirectory {
    public static void main(String[] args) {
        File dir = new File("dir2/test");
        dir.mkdir();
        dir.mkdirs();
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getName());

        dir.renameTo(new File("dir2/newtest"));
        System.out.println(dir.isDirectory());
        System.out.println(dir.exists());
    }
}
