package ch08;

public class CharaterText {
    public static void main(String[] args) {
        // 'A' → 문자, "A" → 문자열 : 작은따옴표랑 큰따옴표는 다르다.
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); // 형변환

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2); // 형변환

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3); // 형변환

        // 음수 사용X, 양수만 사용O, 너무 큰 숫자도 사용X
        char han = '한';
        char ch = '\uD55C';
        System.out.println(han);
        System.out.println(ch);
    }
}
