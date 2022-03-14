package ch15;

public class IfElseIfTest {
    public static void main(String[] args) {
        int age = 20;
        int charge;

        if ( age < 8 ) { // age가 8보다 작으면
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        } else if ( age < 14 ) { // age가 14보다 작으면
            charge = 2000;
            System.out.println("초등학생 입니다.");
        } else if ( age < 20 ) { // age가 20보다 작으면
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        } else { // 20이상이면
            charge = 3000;
            System.out.println("일반인 입니다.");
        }
        System.out.println("입장료는 " + charge + " 원입니다.");
    }
}
