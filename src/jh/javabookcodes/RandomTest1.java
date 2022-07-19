package jh.javabookcodes;

import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("1부터 100까지의 난수: " + random.nextInt(101));
        System.out.println("1부터 50까지의 난수 발생: " + random.nextInt(51));
        System.out.println("1부터 20까지의 난수 발생: " + random.nextInt(21));
        System.out.println("int형 전체 범위의 난수 발생: " + random.nextInt());

        System.out.println("float 타입의 난수 발생: " + random.nextFloat());
        System.out.println("double 타입의 난수 발생: " + random.nextDouble());
        System.out.println("long 타입의 난수 발생: " + random.nextLong());
        System.out.println("boolean 타입의 난수 발생: " + random.nextBoolean());
    }
}
