package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>(); // Book의 ArrayList 객체 배열 선언

        // add() → 객체를 리스트에 추가
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥2", "조정래"));
        library.add(new Book("태백산맥3", "조정래"));
        library.add(new Book("태백산맥4", "조정래"));
        library.add(new Book("태백산맥5", "조정래"));

        // size() → 리스트에 들어있는 원소 수, get() → 인덱스의 위치에 있는 객체를 리턴
        for(int i=0; i< library.size(); i++) { //
            library.get(i).showInfo();
        }
    }
}
