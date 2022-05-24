package jh.javabookcodes;

public class FlowTest20 {
    public static void main(String[] args) {
        int i = 0;
        while (i >= 1) { //while문의 영역이다. 조건식이 i >= 1인데 현재 i 값이 0이기 때문에 식이 성립하지 않는다.
            System.out.println("while area");//그러니 이 부분은 실행되지 않는다.
        }
        do {
            System.out.println("do ~ while area");//do ~ while문 부분이다. 조건식은 위와 같지만 do 문장을 먼저 실행하고 이후에
        } while (i >= 1);//조건식을 비교하기 때문에 실행문이 한번은 실행된다.
    }
}
