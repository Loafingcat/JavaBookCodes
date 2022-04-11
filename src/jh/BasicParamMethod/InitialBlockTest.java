package jh.BasicParamMethod;

class Good {
    {
        System.out.println("good의 인스턴스 초기화 블록 실행");//객체를 생성할 때마다 반복적으로 호출
    }
    static {
        System.out.println("good의 static 초기화 블록 실행");//클래스가 로딩될 때 한 번만 실행
    }
}

public class InitialBlockTest {
    public static void main(String[] args) {

        Good g1 = new Good();
        Good g2 = new Good();
        Good g3 = new Good();
        System.out.println("main");
    }
}
