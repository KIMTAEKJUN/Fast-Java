package ch20;

public class NestedLoopTest {
    public static void main(String[] args) {
        // for문 구구단 출력
        int dan = 2;
        int count;

        for ( ; dan <= 9; dan++ ) { // 2 ~ 9번 반복, 반복 끝날때마다 1 증가
            for ( count = 1; count <= 9; count++ ) { // 2 ~ 9번 반복, 반복 끝날때마다 1 증가
                System.out.println(dan + " * " + count + " = " + dan * count); // 구구단 출력
            }
            System.out.println(); // 단마다 띄어서 출력
        }

        // while문 구구단 출력
        dan = 2;
        while ( dan <= 9 ) { // dan이 9보다 작거나 같을때까지 반복
            count = 1;
            while ( count <= 9 ) { // count가 9보다 작거나 같을때까지 반복
                System.out.println(dan + " * " + count + " = " + dan * count); // 구구단 출력
                count++; // count 1 증가
            }
            dan++; // dan 1 증가
            System.out.println(); // 단마다 띄어서 출력
        }
    }
}