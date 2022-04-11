package jh.BasicParamMethod;

public class VariableArgument {

    void printInfo(String ...infos) {
        if(infos.length != 0) {
            for(int i = 0; i < infos.length; i++) {
                System.out.println(infos[i]);
            }
        }
        else {
            System.out.println("인자가 없네요");
        }
    }

    public static void main(String[] args) {

        VariableArgument vt = new VariableArgument();
        System.out.println("인자 없이");
        vt.printInfo();
        System.out.println("인자 하나");
        vt.printInfo("오정원");
        System.out.println("인자 두 개");
        vt.printInfo("오정원", "전산부");
        System.out.println("인자 세 개");
        vt.printInfo("오정원", "전산부", "1억");
    }
}
