package ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alphabets = new char[26]; // char 26개의 배열 선언 ( 0 ~ 25 )
        char ch = 'A'; // 배열 초기값 'A' 변수 선언

        for(int i=0; i < alphabets.length; i++) { // 0 ~ 26번 반복
            alphabets[i] = ch++; // 한번씩 반복 한 후 ch에다가 +1
        }

        for(char alpha : alphabets) { // 0 ~ 26번 반복
            System.out.println(alpha + "," + (int)alpha); // A~Z 출력 한 후 알파벳에 대한 아스키코드 출력
        }
    }
}
