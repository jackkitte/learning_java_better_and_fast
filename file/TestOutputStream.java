import java.io.*;

public class TestOutputStream {
    public static void main(String[] args) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(new File("test.txt"));
            String content = "good morning";

            byte[] data = content.getBytes();
            os.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
