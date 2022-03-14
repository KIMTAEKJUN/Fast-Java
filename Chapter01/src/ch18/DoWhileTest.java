package ch18;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        do {
            input = scanner.nextInt(); // 값 입력 받기
            sum += input; // sum에다가 input값 누적, sum = sum + input
        } while ( input != 0 ); // input이 0과 같지 않다면
            System.out.println(sum);
    }
}
