package ch08;

public class PersonTest {
    public static void main(String[] args) {

        Person tomas = new Person(); // new 생성자를 사용하여, tomas란 변수 선언

        tomas.personWeight = 180; // 키 : 180
        tomas.personHeight = 78; // 몸무게 : 78
        tomas.personName = "Tomas"; // 이름 : Tomas
        tomas.personGender = "남자"; // 성별 : 남자
        tomas.personAge = 37; // 나이 : 37

        tomas.showPersonInfo(); // 출력
    }
}
