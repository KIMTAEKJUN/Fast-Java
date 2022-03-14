package ch08;

public class Person { // Person이란 Class 생언

    public int personWeight; // 키
    public int personHeight; // 몸무게
    public String personName; // 이름
    public String personGender; // 성별
    public int personAge; // 나이

    public void showPersonInfo() { // 결과 출력해주는 메소드
        System.out.println("키가 " + personWeight + " 이고, 몸무게가 " + personHeight + "킬로인 " + personGender +
                "이 있습니다. \n이름은 " + personName + " 이고, 나이는 " + personAge + "세입니다.");
    }
}
