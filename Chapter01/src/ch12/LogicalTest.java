package ch12;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 += 10) < 10 && (i += 2) < 10); // AND
        System.out.println(value); // false
        System.out.println(num1); // 20
        System.out.println(i); // 앞 항이 이미 false이기때문에 뒤 쪽 항을 실행하지않음

        value = ((num1 += 10) < 10 || (i += 2) < 10); // OR
        System.out.println(value); // true
        System.out.println(num1); // 20
        System.out.println(i); // 4
    }
}
