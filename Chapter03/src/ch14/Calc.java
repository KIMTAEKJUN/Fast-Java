package ch14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // default 메소드
   default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        // description을 재정의 하지않으면 호출된다.
        myMethod();
   }

   // 정적 메소드
   static int total(int[] arr) {
       int total = 0;
       for( int num : arr ) {
           total += num;
       }
       myStaticMethod();
       return total;
   }

   // 일반적으로 사용하는 private method
    private void myMethod() {
        System.out.println("myMethod");
    }

    // static에서 사용하는 private method
    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}
