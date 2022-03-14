package ch06;

public class Student { // 학생(Student) Class 구현

    public int studentNumber; // 학생 학번
    public String studentName; // 학생 이름
    public int grade; // 학년

    public Student() {} // 오버로딩(OverRoding): 여러가지 생성자를 정의하는 생성자
    public Student(int studentNumber, String studentName, int grade) { // 생성자 생성, 변수들이 넘어옴
        this.studentNumber = studentNumber; // this 키워드
        this.studentName = studentName; // 〃
        this.grade = grade; // 〃
    }

    public String showStudentInfo() { // 총 출력
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
