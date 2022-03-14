package ch06;

public class StudentTest {
    public static void main(String[] args) {
        
        Student studentLee = new Student(); // new 키워드를 사용하여, studentLee란 변수를 선언, Default 생성자로 선언

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(12345, "Kim", 3); // new 키워드를 사용하여, studentKim이란 변수를 선언, 매개변수로 선언

        System.out.println(studentKim.showStudentInfo());
    }
}
