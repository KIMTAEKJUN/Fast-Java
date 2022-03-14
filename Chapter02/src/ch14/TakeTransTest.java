package ch14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000); // new 생성자를 사용하여, studentJ(James)란 변수 선언
        Student studentT = new Student("Tomas", 10000); // new 생성자를 사용하여, studentT(Tomas)드란 변수 선언

        Bus bus100 = new Bus(100); // new 생성자를 사용하여, bus100(100번째 버스)란 변수 선언
        Bus bus500 = new Bus(500); // new 생성자를 사용하여, bus500(500번째 버스)란 변수 선언

        studentJ.takeBus(bus100); // James가 100번째 버스를 탐

        Subway greenSubway = new Subway(2); // new 생성자를 사용하여, greenSubway(초록색 버스)란 변수 선언

        studentT.takeSubway(greenSubway); // Tomas가 초록색 지하철를 탐

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

        bus500.showBusInfo();
    }
}
