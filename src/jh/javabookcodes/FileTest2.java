package jh.javabookcodes;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;


public class FileTest2 {

    /* 문제 : 1~10 까지의 숫자를 입력받아 (option문제 : TEST/ 디렉토리 안에 있는 파일의 갯수만큼의 숫자를 입력받아)
     * 입력 :  1~ 10 이외 다른 숫자, 문자일 경우
     * 출력 :
     * 1~10 사이의 숫자만 입력하세요.
     * 종료.
     * 입력된 단어나 숫자가 포함된 파일이 없는 경우 시스템을 종료한다.
     * 입력 받는 부분을 고치기, 출력은 냅두고,
     * equals는 String이랑 비교하는 애다. filename을 Strig으로 받아와야 하나? Stirng 맞는거 같은데
     * 파일이 순서대로 나열되고 줄줄 읽혀 내려오는데 중간에 막히는 느낌?
     * 파일이름이 쭉쭉 돌면서 비교를 하면서 이름이 일치하지 않는 경우에만 브레이크가 걸려야 하는데 왜 그렇지 않지?
     * filename이랑 fn을 비교할게 아니라 fn이랑 다른걸 비교해야 될듯?
     * */
    public static void main(String[] args) {

        System.out.print("파일이름 입력: ");
        String input = (new Scanner(System.in)).nextLine();
        File file = new File("C:\\TEST\\TEST");
        String[] files = file.list();



        if (!input.matches("[1-9]|10")) {
            System.out.print("출력: ");
            System.out.println("1~10사이의 숫자만 입력하세요.");
            System.out.println("종료.");
            System.exit(0);
        }


         for (String filename : files) {//files를 filename으로 정의
            String fn = input;//input값을 fn으로 정의


            if (filename.contains(fn)) {//filename에 fn을 포함하고 있다면
                File subFile = new File(file, filename);//file과 filename을 subfile로 새로 생성 파일 경로?
                System.out.println("파일 이름:" + filename + "파일 크기:" + subFile.length() + ",byte" + ",파일 경로:" + subFile.getAbsolutePath());
                break;
            }
        }
    }
}










