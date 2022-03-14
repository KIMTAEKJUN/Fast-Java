package ch13;

public class BitOperationTest {
    public static void main(String[] args) {
        int num1 = 5; // 00000101
        int num2 = 10; // 00001010

        System.out.println(num1 | num2); // OR
        System.out.println(num1 & num2); // AND
        System.out.println(num1 ^ num2); // XOR
        System.out.println(~num1); // 1의 보수

        System.out.println(num1 << 2); // 왼쪽으로 2번 시프트, 00010100(20)
        System.out.println(num1 <<= 2); // 변수의 값을 바꿀려면 대입 연산자를 써야된다. (복합 대입 연산자)
        System.out.println(num1 >> 1); // 오른쪽으로 1번 시프트, 00001010(10)
    }
}
