package ch21;

public class ContinueTest {
    public static void main(String[] args) {
        int num = 1;

        for ( ; num <= 100; num++ ) { // 1~100번 반복, 반복 끝날때마다 1 증가
            if ( num % 3 != 0) // num을 3으로 나눈 후, 나머지 값이 0과 같지않다면
                continue; // for문으로 돌아감

            System.out.println(num);
        }
    }
}
