package test;

import school.School;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();


    }

    public void createSubject() {
        korean = new Subject(Define.KOREAN, "국어");
        math = new Subject(Define.MATH, "수학");

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    public void createStudent() {
        Student student1 = new Student(211213, "강감찬", korean);
        Student student2 = new Student(212330, "김유신", math);
        Student student3 = new Student(201518, "신사임당", korean);
        Student student4 = new Student(202360, "이순신", korean);
        Student student5 = new Student(201290, "홍길동", math);
    }
}
