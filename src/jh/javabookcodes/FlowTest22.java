package jh.javabookcodes;

import java.util.Scanner;

public class FlowTest22 {
    //break문 테스트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "서울"; //맞혀야 할 수도 이름 정의
        String inString = "";//사용자가 입력할 수도 이름을 저장할 변수를 ""으로 초기화
        do {
            System.out.println("대한민국 수도를 입력하세요.");
            inString = sc.next();
            if (inString.equals(answer)) {
                System.out.println("대한민국 수도는" + answer + "입니다");//수도 이름을 맞히면 break문을 통해 do 블록을 빠져나감
                break;
            }
            System.out.println("다시 입력해주세요.");
        }
        while(true);
    }
}
