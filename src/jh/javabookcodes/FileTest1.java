package jh.javabookcodes;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest1 {
    // 1. github에 JavaBookCodes 레포지토리 만들어서 push 해놀것.
    // 2. FileTest1 예제가 수행하는 기능이 무엇인지?
    // 예) file이 디렉토리 인지 아닌지?를 검사하는 구현이 들어있다. 어디에?
    // 그외 여러가지...
    //왜 untitled가 뜨지?(해결 완료)

    public static class ImageNameFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            return name.endsWith(".jpg") || name.endsWith(".png");
        }
    }

    public static void main(String[] args) {

        System.out.println("c:드라이브의 전체 파일 출력");
        File file = new File("C:\\");//c:드라이브 경로를 이용해 파일 객체 생성
        String[]files = file.list();//c:드라이브 안에 존재하는 모든 디렉토리 파일을 String[]타입으로 불러오기
        for(String fileName : files) {
            File subFile = new File(file, fileName);//파일 이름으로 새로운 객체 생성
            if(file.isDirectory()) {
                System.out.println("디렉토리 이름: " + fileName);
            }
            else {
                System.out.println("파일이름:"+fileName +",파일크기:"+subFile.length()+"byte");
            }
        }

        System.out.println("c:드라이브의 이미지 파일만 출력");
        // .jpg, .png 함께 걸러서 보여주도록 고쳐보시오.
        String[] imageFiles = file.list(new ImageNameFilter());//확장자가 .jpg와 .png로 끝나는 파일 이름만 String[]으로 불러오는 부분
        for(String fileName: imageFiles) {
            File subFile = new File(file,fileName);
            System.out.println("파일 이름:"+fileName+"파일 크기:"+subFile.length()+",byte"+",파일 경로:"+subFile.getAbsolutePath());
        }

        File makeFile = new File("c:\\data\\testFile.txt");//추상적인 객체 생성. 실제로 디렉토리에 파일이 만들어지는게 아니고 직접 파일 만들어서 넣어줘야 함
        try {
            makeFile.createNewFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        if(makeFile.exists()) {
            System.out.println("makeFile이 생성됨");
        }

        File renameFile = new File("c:\\data\\testFile2.txt");//파일 이름 변경
        makeFile.renameTo(renameFile);
        if(renameFile.exists()){
            System.out.println("makeFile의 이름이 변경됨");

        }

        if(renameFile.delete()) {//파일 삭제
            System.out.println("renameFile이 제거됨");
        }
    }
}