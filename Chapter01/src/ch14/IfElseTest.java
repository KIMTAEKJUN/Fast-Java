package ch14;

public class IfElseTest {
    public static void main(String[] args) {
        int age = 7;

        if ( age >= 8 ) { // age가 8보다 크거나 같을때
            System.out.println("학교에 다닙니다."); // 조건식이 '참'인 경우 출력
        } else {
            System.out.println("학교에 다니지 않습니다."); // 조건식이 '참'이 아닌 경우 출력
        }
        System.out.println("노는게 제일 좋아 ~");
    }
}
