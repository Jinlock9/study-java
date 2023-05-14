package ch1_7;

public class DoubleTest {
    public static void main(String[] args) {

        double dNum = 3.14; // 실수는 기본적으로 8byte double에 저장
        float fNum = 3.14f; // float는 4byte라 실수는 기본적으로 8byte로 처리되기에 f라고 뒤에 붙혀서 float으로 처리하게 명령

        System.out.println(dNum);
        System.out.println(fNum);
    }
}
