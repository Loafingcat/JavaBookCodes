package jh.BasicParamMethod;

class Number {
    static int num = 0; // 클래스 필드
    int num2 = 0; // 인스턴스 필드
}

public class WhatIsStatic {

    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num++;
        number1.num2++;
        System.out.println(number2.num);//두 번째 number의 클래스 필드 출력
        System.out.println(number2.num2);//두 번째 number의 인스턴스 필드 출력
    }
}
