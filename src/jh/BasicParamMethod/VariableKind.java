package jh.BasicParamMethod;

public class VariableKind {
    //인스턴스 멤버 변수
    int memVar;
    //static 멤버 변수
    static int staticVar;

    //변수종류 테스트
    public static void main(String[] args) {
        //로컬 변수
        int localVar;

        VariableKind vk1 = new VariableKind();
        System.out.println("vk1.memVar= " + vk1.memVar);
        System.out.println("vk1.staticVar= " + vk1.staticVar);
        System.out.println("VariableKind.staticVar= " + VariableKind.staticVar);
        System.out.println("staticVar= " + staticVar);
        VariableKind vk2 = new VariableKind();
        vk1.staticVar = 20;
        System.out.println("vk2.staticVar= " + vk2.staticVar);
        //System.out.println("localVar= " + localVar); 로컬 변수는 변수 선언 시 값을 초기화하지 않으면 컴파일러가 값을 자동을로 초기화 해주지 않아서 컴파일 에러가 뜬다.
    }
}
