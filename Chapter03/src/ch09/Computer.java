package ch09;

// 추상메서드를 포함한 클래스
// 추상메서드를 포함한 클래스는 인스턴스화(new) 할 수 없음
public abstract class Computer {

    // 추상메서드
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 니다.");
    }
}
