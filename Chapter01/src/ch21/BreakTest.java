package ch21;

public class BreakTest {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        for ( ; ; num++ ) {
            sum += num; // sum = sum + num;
            if( sum >= 100 ) // sum이 100보다 크거나 같으면
                break; // 종료
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
