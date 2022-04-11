package jh.BasicParamMethod;

public class BasicParamMethod { //클래스 이름 정의

    //변수 정의 6~10라인 모델링 단계에서 특성으로 도출한 단위들이 클래스를 정의하며 변수 단위가 됨.
    String company;
    String color;
    int price;
    int size;
    int temp;

    //메소드 정의
    void powerOn() { //에어컨이 기능을 하기위한 메소드 정의.
        System.out.println("power on"); //켜져랏
    }
    void powerOff() {
        System.out.println("power off");//꺼져랏
    }
    void tempUp() {//온도 올라가고
        temp++;
    }
    void tempDown() {//내려가고
        temp--;
    }
}
