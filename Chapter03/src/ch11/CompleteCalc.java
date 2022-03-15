package ch11;

// extends : 부모에서 선언/정의 모두하며, 자식은 오버라이딩 할 필요 없이 부모의 메소드/변수 모두 사용 할 수 있다.
public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if( num2 == 0 ) {
            return ERROR;
        } else
            return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현했습니다.");
    }
}
