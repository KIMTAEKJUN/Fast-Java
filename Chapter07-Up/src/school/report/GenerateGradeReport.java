package school.report;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 | 중점과목 | 점수 |\n";
    public static final String LINE = "-------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        // 모든 과목에 대한 학점 산
        ArrayList<Subject> subjectList = school.getSubjectList();
        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        // String으로 변환
        return buffer.toString();
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }
    public void makeBody(Subject subject) {
        // 각 과목의 학생력
        ArrayList<Student> studentList = subject.getStudentList();

        for (int i=0; i<studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentID());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            // 학생별 해당과목 학점 계산
            getScoreGrade(student, subject);
            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student student, Subject subject) {
        ArrayList<Score> scoreList = student.getScoreList();
        int majorID = student.getMajorSubject().getSubjectID();

        // 학점 평가 클래스
        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};

        // 학생이 가진 점수들
        for (int i=0; i<scoreList.size(); i++) {
            Score score = scoreList.get(i);
            // 현재 학점을 산출할 과목
            if (score.getSubject().getSubjectID() == subject.getSubjectID()) {
                String grade;

                if (subject.getGradeType() == Define.PF_TYPE) {
                    grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
                } else {
                    // 중점 과목인 경우
                    if (score.getSubject().getSubjectID() == majorID) {
                        // 중점 과목 학점 평가 방법
                        grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                    } else {
                        // 중점 과목이 아닌 경우
                        grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                    }
                }
                buffer.append(score.getPoint());
                buffer.append(" : ");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter() {
        buffer.append("\n");
    }
}
