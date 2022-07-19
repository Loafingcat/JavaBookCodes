package jh.javabookcodes;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fo = null;
        String msg = "FileOutputStreamTest";
        byte[] byteArray = msg.getBytes();

        try {
            fo = new FileOutputStream("fileOutput.txt", true);
            fo.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fo.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
