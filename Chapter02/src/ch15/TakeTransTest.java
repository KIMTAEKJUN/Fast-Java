package ch15;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentE = new Student("Edward", 20000); // new 생성자를 사용하여, studentE(Edward)란 변수 선언

        Taxi taxi1 = new Taxi("잘 간다 운수택시"); // new 생성자를 사용하여, taxi1(잘 간다 운수택시)란 변수 선언

        studentE.takeTaxi(taxi1); // Edward가 잘 간다 운수택시를 탐

        studentE.showInfo();
        taxi1.showTaxiInfo();
    }
}
