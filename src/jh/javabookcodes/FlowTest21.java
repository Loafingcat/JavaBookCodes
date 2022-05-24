package jh.javabookcodes;

import java.util.Scanner;

public class FlowTest21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nuumber = (int)(Math.random() * 100) + 1;
        //Math.random() 메소드를 이용해 난수를 구하는 부분. 0.0보다 크거나 같고 1.0보다 작은 double형 데이터를 반환해 주기 때문에
        //(int)(Math.random() * 100) 수식에서 반환할 수 있는 값은 0부터 90까지. (int)(Math.random() * 100) + 1; 따라서 이 수식이
        //반환하는 값은 1부터 100까지이다
        int inNumber = 0;//0으로 초기화

        do {
            System.out.println("숫자를 입력하세요...");
            inNumber = sc.nextInt();

            if (inNumber == nuumber) {//사용자가 난수 값을 맞췄을 때 실행되는 영역. break를 통해  do ~ while 문을 빠져나간다.
                System.out.println("맞혔습니다.");
                break;
            }
            else if (inNumber < nuumber) {
                System.out.println("숫자가 너무 작아요.");
            }
            else {
                System.out.println("숫자가 너무 커요.");
            }
        }
        while(true);
    }
}
