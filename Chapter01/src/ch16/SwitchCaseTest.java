package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day = switch(month) { // month 변수랑 비교, day 변수에 리턴 값을 받을 수 있음
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("이번달은 31일까지 입니다.");
                yield 31; // day 변수에 리턴 할 값
            }
            case 2 -> 
                28; // day 변수에 리턴 할 값
            case 4, 6, 9, 11 ->
                30; // day 변수에 리턴 할 값
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                yield -1; // 수행하는거랑 반환 값이 같이 들어가기때문에 yield를 사용
            }
        };
        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
