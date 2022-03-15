package ch10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전을 합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void wiper() {

    }

    // 재정의를 안했기 때문에 출력하지않음
}