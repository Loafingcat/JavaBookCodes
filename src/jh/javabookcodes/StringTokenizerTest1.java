package jh.javabookcodes;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

    public static void main(String[] args) {
        String source1 = "111-111|강원도|춘천시|퇴계동";//소스 String 객체를 생성하는 부분.  "|"로 구분 지어 놨다.
        StringTokenizer st1 = new StringTokenizer(source1, "|");//소스 문자열을 "|"로 분리하여 토큰 생성
        String zip = st1.nextToken();//nextToken을 이용하여 계속 다음 토큰을 불러와 변수에 할당. zip, dou, si, dong
        String dou = st1.nextToken();
        String si = st1.nextToken();
        String dong = st1.nextToken();

        System.out.println("우편번호:" + zip);
        System.out.println("도:" + dou);
        System.out.println("시:" + si);
        System.out.println("동:" + dong);
    }
}
