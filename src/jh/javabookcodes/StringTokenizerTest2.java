package jh.javabookcodes;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

    public static void main(String[] args) {
        String source1 = "한국 미국 태국 중국 이란";//소스 Stirng 객체를 생성하는 부분. 문자열을 ""로 구분지어 놓고 있다.
        StringTokenizer st1 = new StringTokenizer(source1);
        //StringTokenizer 객체를 생성할 때 구분자를 지정하지 않으면 기본적으로 white space를 기준으로 문자열을 분리한다.
        while(st1.hasMoreTokens()) { //반환된 토큰들을 출력해 주는 부분.
            System.out.println("st1 token:" + st1.nextToken());
        }
        System.out.println();
        System.out.println();

        String source2 = "푸들,삽살개,풍산개,진돗개";//두 번째 소스 문자열 객체 생성 부분. 이번엔 , 문자로 구분 지었다.
        StringTokenizer st2 = new StringTokenizer(source2, ",");//구분자를 , 로 지정하여 StingTokenizer 객체 생성
        while(st2.hasMoreTokens()){//토큰 값 출력
            System.out.println("st2 token:" + st2.nextToken());
        }
        System.out.println();
        System.out.println();

        StringTokenizer st3 = new StringTokenizer(source2,",",true);
        //StirngTokenizer 객체를 생성할 때 마지막 파라미터 값을 true로 지정함. 이러면 구분 문자열도 토큰으로 반환된다. 신기..
        while(st3.hasMoreTokens()){//각 토큰 값 출력
            System.out.println("st3 token:" + st3.nextToken());
        }
    }
}
