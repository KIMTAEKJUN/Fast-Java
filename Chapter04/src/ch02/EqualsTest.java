package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        // 실제 주소는 다르기때문에 false 출력
        System.out.println(std1 == std2);
        // 논리적으로 같기때문에 true 출력
        System.out.println(std1.equals(std2));

        // 실제 주소는 다르지만, 논리적으론 같기 때문에 같은 해쉬코드값이 반환됐다.
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        // clone은 생성을 하는게 아니라, 인스턴스의 상태를 그대로 복제 해오는것이다.
        // 하위 클래스들도 그대로 복제할 때 사용할 수 있다.
        std1.setStudentName("Kim");
        Student copyStudent = (Student)std1.clone();
        System.out.println(copyStudent);


        /* String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100;
        System.out.println(i); */
    }
}
