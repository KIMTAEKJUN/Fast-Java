package ch14;

public class Student {

    String studentName; // 학생 이름
    int money; // 현재 돈

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000); // 버스를 탈 경우 1000원을 냄
        this.money -= 1000; // 현재 돈에서 1000원을 뺌
    }

    public void takeSubway(Subway subway) {
        subway.take(1200); // 지하철을 탈 경우 1200원을 냄
        this.money -= 1200; // 현재 돈에서 1200원을 뺌
    }

    public void showInfo() { // 결과 출력해주는 메소드
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
