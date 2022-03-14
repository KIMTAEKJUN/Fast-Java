package ch15;

public class Taxi {

    String taxiName; // 택시 이름
    int money; // 수입

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int money) {
        this.money += money; // 수입 증가
    }

    public void showTaxiInfo() { // 결과를 출력해주는 메소드
        System.out.println(taxiName + " 수입은 " + money + "원 입니다.");
    }
}
