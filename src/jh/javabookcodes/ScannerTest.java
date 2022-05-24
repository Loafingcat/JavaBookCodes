package jh.javabookcodes;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nextString = sc.next();;//문자를 입력 했을땐 nextString = 이라고 출력되고
        System.out.println("nextString= " + nextString);

        int nextIntNum = sc.nextInt();//숫자사 입력 되었을 때는 nextInt 라고 출력된다.
        System.out.println("nextIntNum= " + nextIntNum);
    }
}
