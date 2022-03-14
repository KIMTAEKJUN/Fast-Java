package ch24;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point) {
        Subject s = new Subject();

        s.setName(name);
        s.setScorePoint(point);
        subjectList.add(s);
    }

    public void showScoreInfo() {
        int total = 0;

        for(Subject s : subjectList) {
            total += s.getScorePoint();

            System.out.println(studentName + "학생의 " + s.getName() + " 과목의 성적은 " + s.getScorePoint() + "입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
    }
}
