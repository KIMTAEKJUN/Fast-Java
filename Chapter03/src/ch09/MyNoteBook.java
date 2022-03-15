package ch09;

// 추상메서드를 포함하지 않은 클래스
public class MyNoteBook extends NoteBook {
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing");
    }
}
