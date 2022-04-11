package jh.BasicParamMethod;

public class BasicParamMethod2 {

    //객체의 변수와 메소드 사용 테스트

    public static void main(String[] args) {

        AirCon airCon = new AirCon();

        //변수 사용
        airCon.color = "White";
        airCon.temp = 10;
        airCon.price = 10000;

        //메소드 사용
        airCon.tempUp();
        System.out.println("airCon.temp= " + airContemp + ",airCon.color= " + airCon.color + ",airConprice= " + airCon.price + "원");
        airCon.powerOn();
        airCon.powerOff();
        airCon.tempDown();
        System.out.println("airCon.temp= " + airCon.temp + ",airCon.color= " + airCon.color + ",airCon.price= " + airCon.price + "원");

    }
}
