package ch09;

// 추상메서드를 포함한 클래스
// 추상메서드를 포함한 클래스는 인스턴스화(new) 할 수 없음
public abstract class NoteBook extends Computer {
    @Override
    public void display() {
        System.out.println("NoteBook display");
    }
}
