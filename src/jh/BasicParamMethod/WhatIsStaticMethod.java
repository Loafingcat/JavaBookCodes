package jh.BasicParamMethod;

class Name {
    static void print() {
        System.out.println("내 이름은 홍길동입니다.");
    }
    void print2() {
        System.out.println("내 이름은 이순신입니다.");
    }
}

public class WhatIsStaticMethod {
    public static void main(String[] args) {
        Name.print();

        Name name = new Name();
        name.print2();
    }
}
