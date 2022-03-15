package ch14;

// implements(interface 구현) : 부모 객체는 선언만 하며, 정의는 반드시 자식이 오버라이딩해서 사용한다.
public abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
