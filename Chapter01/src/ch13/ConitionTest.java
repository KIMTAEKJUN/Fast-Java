package ch13;

import java.util.Scanner;

public class ConitionTest {
    public static void main(String[] args) {
        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");

        Scanner scanner = new Scanner(System.in); // Scanner 사용법, System.in: 표준입력
        System.out.println("입력 1: ");
        int num1 = scanner.nextInt(); // nextInt(): 정수를 입력받기 위해 사용하는 메서드
        System.out.println("입력 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2; // num1이 num2보다 크면 num1 출력, 그렇지않다면 num2 출력
        System.out.println(max);
    }
}
