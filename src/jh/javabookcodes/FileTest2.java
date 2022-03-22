package jh.javabookcodes;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {

    public static void main(String[] args) {
        System.out.print("파일이름 입력: ");
        String input = (new Scanner(System.in)).nextLine();
        File file = new File("C:\\TEST\\TEST");
        String[] files = file.list();
        for (String filename : files) {
            String fn = input;

            if (filename.contains(fn)) {
                File subFile = new File(file, filename);
                System.out.println("파일 이름:" + filename + "파일 크기:" + subFile.length() + ",byte" + ",파일 경로:" + subFile.getAbsolutePath());
            }
        }
    }
}










