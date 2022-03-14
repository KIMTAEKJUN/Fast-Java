package ch19;

public class ForTest {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        for ( int i=0; i< 10; i++, count++ ) { // 10번
            sum += count; // sum = sum + count
            System.out.println(i);
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while ( num <= 10 ) { // 10번
            total += num; // total = total + num
            num++; // num = num + 1
        }
        System.out.println(total);
    }
}
