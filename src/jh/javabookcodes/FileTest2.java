package jh.javabookcodes;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;


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

    /*
     * NEXT 문제 :
     * Test/ 디렉토리 안에 존재하는 파일의 갯수에 따라서, 파일의 정보를 출력.
     * 파일이 3개면
     * TEST1.txt
     * TEST2.txt
     * TEST3.txt
     *
     * 파일이 2개면
     * TEST1.txt
     * TEST2.txt
     *
     * 인것처럼 파일 갯수 N개에 따라서 TEST1, TEST2, ...순차적으로 TESTN.txt까지 존재함.
     *
     * 이걸 입력받아 파일 번호와 다른 입력을 받으면 종료.
     * 아니면 파일 정보를 출력.
     * */

    /*
     * 숙제
     * 1. 잘못 입력받으면, "다시 입력하세요" 출력 후 종료처리 하지 않고 다시 입력 받을 수 있도록 만들기.
     * 2. Java책 Chapter 5 클래스 기본 - 변수와 메소드 정의하기
     * 부터
     * Chapter 6 클래스 고급 - 변수와 메소드 상속받아 정의하기
     * 예제 따라 쳐서 push하기
     *
     * 월요일이 되면
     * Chapter 5 or Chapter 6 에 나온 예제 들 중 하나 or 몇개를 골라
     * 왜 이렇게 돌아가는지에 대해 물어볼것임. 나름 설명하면 됨.
     * 할수있는만큼 하되, Chapter 5부터 나오는 예제 순차적으로 할것.
     * */
    public static void main(String[] args) {
        while (true) {
            try {

                System.out.print("파일이름 입력: ");
                String input = (new Scanner(System.in)).nextLine();
                File file = new File("C:\\TEST\\TEST");
                String[] files = file.list();
                int newInt = Integer.parseInt(input);
                int fileCount = files.length;

                // 1. 정규식 패턴을 써서 입력받은 문자열에 숫자만 있는지를 검사. (문자가 들어가면 false)
                boolean hasOnlyNumberInString = input.matches("[0-9]+");
                System.out.println("숫자만 있는 input인가 아닌가?" + hasOnlyNumberInString);

                if (newInt > fileCount) {
                    System.out.println("파일이 존재하지 않습니다.");
                    System.exit(0);
                }

                for (String filename : files) {//files를 filename으로 정의
                    String fn = input;//input값을 fn으로 정의

                    if (filename.startsWith("TEST" + fn)) {
                        File subFile = new File(file, filename);//file과 filename을 subfile로 새로 생성 파일 경로?
                        System.out.println("파일 이름:" + filename + "파일 크기:" + subFile.length() + ",byte" + ",파일 경로:" + subFile.getAbsolutePath());
                        break;
                    }
                }
            } catch (InputMismatchException | NumberFormatException ex ) {
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }
}








