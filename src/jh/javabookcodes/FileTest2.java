package jh.javabookcodes;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {
    //String으로 파일 검색하는건 알겠는데 정수로 파일이름 불러오는건 도저히 모르겠다.
    //파일을 sort해서 각 순번대로 오게하는건? 0부터 시작하니까 3을 입력하면 네번째 파일이 출력될텐데...
    //디렉토리 안에 있는 파일 개수 만큼만 입력이 가능하게 하라...?
    //try (Stream<Path> files = Files.list(Paths.get("C:\TEST\TEST"))) {
    //    long count = files.count()
    //} 폴더 내 파일 개수 구하는 코드

    public static void main(String[] args) {
        System.out.print("파일이름 입력: ");
        String input = (new Scanner(System.in)).nextLine();
        File file = new File("C:\\TEST\\TEST");
        String[] files = file.list();
        for (String filename : files) {
            File subFile = new File(file, filename);

            if (file.getName().contains(input)) {
                System.out.println("파일 이름:"+filename+"파일 크기:"+subFile.length()+",byte"+",파일 경로:"+subFile.getAbsolutePath());
            }
        }
    }
}










