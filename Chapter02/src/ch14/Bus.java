package ch14;

public class Bus {

    int busNumber; // 버스 번호
    int passengerCount; // 승객 수
    int money; // 수입

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money; // 수입 증가
        passengerCount++; // 승객 수 1 증가
    }

    public void showBusInfo() { // 결과 출력해주는 메소드
        System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
