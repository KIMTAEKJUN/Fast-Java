package ch10;

public class ConstantTest {
    public static void main(String[] args) {
        // final: 변수나 메서드 또는 클래스가 ‘변경 불가능’하도록 만든다.
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0; // 상수는 사용하기전 꼭 값을 넣어줘야한다.
        // MAX_NUM = 20; 이미 MAX_NUM은 상수이기때문에 값을 바꿀 수 없다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
