package ch06;

public class VariableTest {
    public static void main(String[] args) {
        byte bNum = 127; // byte: -128 ~ 127
        System.out.println(bNum);

        // int num = 12345678900;
        long lNum = 12345678900l; // 32bit를 초과하면 int가 아니라 long으로 선언
        System.out.println(lNum);
    }
}