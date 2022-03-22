package jh.javabookcodes;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {
    /*
     * 문제 : 1~10 까지의 숫자를 입력받아 (option문제 : TEST/ 디렉토리 안에 있는 파일의 갯수만큼의 숫자를 입력받아)
     * TESTX.txt에 해당하는 파일의 정보를 보여주시오.
     *
     * 입력 :
     * 3
     * 출력 :
     * 파일명: TEST3.txt, 파일크기 : 6bytes, 파일 경로: C:\TEST\TEST3.txt
     *
     * --------------
     *
     * 입력 :  1~ 10 이외 다른 숫자, 문자일 경우
     * 출력 :
     * 1~10 사이의 숫자만 입력하세요.
     * 종료.
     * */
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










