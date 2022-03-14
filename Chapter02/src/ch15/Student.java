package ch15;

public class Student {

    String studentName; // 학생 이름
    int money; // 현재 돈

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000); // 택시를 탈 경우 10000원을 냄
        this.money -= 10000; // 현재 돈에서 10000원을 뺌
    }

    public void showInfo() { // 결과 출력해주는 메소드
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
