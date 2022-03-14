package ch17;

public class WhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0; // 지역변수는 초기화를 해줘야한다.

        while ( num <= 10 ) { // num이 10보다 작거나 같을때
            sum += num; // sum = sum + num
            num++; // num = num + 1
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
