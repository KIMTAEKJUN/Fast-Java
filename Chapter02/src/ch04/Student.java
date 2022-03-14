package ch04;

public class Student { // 학생(Student) Class 구현용
    public int studentID; // 학생의 학번
    public String studentName; // 학생의 이름
    public String address; // 주소

    public void showStudentInfo() { // 총 출력
        System.out.println(studentID + "학번 학생의 이름 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() { // studentName을 가져가는 함수
        return studentName;
    }
    public void setStudentName(String name) { // 학생 이름을 바꾸는 함수, String 타입으로 name이라는 매개변수
        studentName = name; // studentName에다가 name이라는 매개변수 삽입
    }
}