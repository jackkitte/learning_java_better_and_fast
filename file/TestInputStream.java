import java.io.*;

public class TestInputStream {
    public static void main(String[] args) {
        InputStream is = null;

        try {
            is = new FileInputStream(new File("english.txt"));
            byte[] data = new byte[1024];

            is.read(data);
            System.out.println(new String(data));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
