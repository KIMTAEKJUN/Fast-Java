package ch03;

public class FunctionTest {
    // 멤버 변수를 이용하여 클래스의 기능을 구현한 함수를 메서드(Method)라 말한다.
    public static int addNum(int num1, int num2) { // 매개변수O, 반환값O 함수 선언, 반환해줄 데이터 타입은 int, 메서드의 이름은 addNum
        int result; // 반환값을 받기 위한 변수
        result = num1 + num2;
        return result;
    }
    public static void sayHello(String greeting) { // 반환값X 함수 선언, 반환값이 없을경우 void, 메서드의 이름은 sayHello
        System.out.println(greeting);
    }
    public static int calcSum() { // 매개변수X, 반환값O 함수 선언, 메서드의 이름은 calcSum
        int sum = 0;
        int i;

        for ( i = 0; i <= 100; i++ ) { // 0 ~ 100의 총 합
            sum += i;

        }
        return sum;
    }
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2); // n1, n2를 addNum()으로 넘겨줌
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum(); // total에 calcSum() 함수 할당
        System.out.println(total); // 0 ~ 100의 총 합이 출력
    }
}