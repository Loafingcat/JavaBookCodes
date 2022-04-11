package jh.BasicParamMethod;

public class AirConUse {

    //객체의 변수와 메소드 사용 테스트

    public static void main(String[] args) {//public은 "접근제어자"

        AirCon airCon = new AirCon(); //new 연산자를 사용해서 객체 생성

        //변수 사용
        airCon.color = "White";//변수값을 초기화
        airCon.temp = 10;
        airCon.price = 10000;

        //메소드 사용
        airCon.tempUp();//온도 증가하는 메소드 호출
        System.out.println("airCon.temp= " + airCon.temp + ",airCon.color= " + airCon.color + ",airCon.price= " + airCon.price + "원");
        airCon.powerOn();//전원켜는 메소드 호출
        airCon.powerOff();//전원끄는 메소드 호출
        airCon.tempDown();//온도 내리는 메소드 호출
        System.out.println("airCon.temp= " + airCon.temp + ",airCon.color= " + airCon.color + ",airCon.price= " + airCon.price + "원");

    }
}
