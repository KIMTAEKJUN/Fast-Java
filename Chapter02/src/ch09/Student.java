package ch09;

public class Student {

    // 기본 자료형
    int studentId; // 학생 학번
    String studentName; // 학생 이름

    // 참조 자료형
    Subject korea;
    Subject math;

    Student(int studentId, String studentName) { // 생성자 선언
        this.studentId = studentId;
        this.studentName = studentName;

        // 생성자 호출 시 참조 자료형 초기화
        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) { // 국어 점수 가져오기
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) { // 수학 점수 가져오기
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() { // 총점 보여주는 메소드 선언
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}