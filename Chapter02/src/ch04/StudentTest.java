package ch04;

public class StudentTest {
    public static void main(String[] args) {
        // new 키워드를 사용하여 클래스를 메모리에 생성한 상태를 인스턴스(Instance)라 말한다.
        Student studentLee = new Student(); // new 키워드를 사용하여, 타입은 Student, studentLee란 변수를 선언 (인스턴스)

        studentLee.studentID = 12345; // studentLee에 대한 학번 값 생성
        studentLee.setStudentName("Lee"); // studentLee에 대한 이름 값 생성
        studentLee.address = "서울 강남구"; // studentLee에 대한 주소 값 생성

        studentLee.showStudentInfo(); // studentLee의 학번, 이름, 주소 출력

        Student studentKim = new Student(); // new 키워드를 사용하여, 타입은 Student, studentKim란 변수를 선언 (인스턴스)

        studentKim.studentID = 54321; // studentKim에 대한 학번 값 생성
        studentKim.setStudentName("Kim"); // studentKim에 대한 이름 값 생성
        studentKim.address = "경기도 성남시"; // studentKim에 대한 주소 값 생성

        studentKim.showStudentInfo(); // studentKim의 학번, 이름, 주소 출력

        // 실제로 참조값이 가르키는 주소는 힙에 studentLee와 studentKim이 자리잡은(저장된) 주소를 뜻한다.
        // 실제 물리적인 주소가 아니라, JVM이 준 가상 주소다.

        // 메모리 생성된 인스턴스를 가르키는 변수를 참조 변수(Reference Variable)라 말하고,
        // 생성된 인스턴스의 메모리 주 값을 참조값(Reference Value)이라고 한다.

        System.out.println(studentLee); // studentLee에 대한 패키지 이름, 클래스 이름, 참조값 출력
        System.out.println(studentKim); // studentKim에 대한 패키지 이름, 클래스 이름, 참조값 출력
    }
}