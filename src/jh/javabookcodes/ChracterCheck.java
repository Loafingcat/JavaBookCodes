package jh.javabookcodes;

public class ChracterCheck {
    public static void main(String[] args) {
        // 한줄의 문자열을 입력 받아서
        // 문자가 들어가는 입력이면 false
        // 숫자만 들어있는 입력이면 true

        String input = "19";

        boolean isMatch = input.matches("[0-9]+");
        System.out.println(isMatch);
    }
}
