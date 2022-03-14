package ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10개의 배열 선언 ( 0 ~ 9 )
        int total = 0; // 총값 계산하는 변수 선언

        for(int i=0, num=1; i < arr.length; i++) { // 0 ~ 10번 반복 ( num은 1부터 시작 )
            arr[i] = num++; // 한번씩 반복 한 후 num에다가 +1

        }

        for(int num : arr) { // 0 ~ 10번 반복
            total += num; // total에다가 num값을 더함
        }

        System.out.println(total); // 총값 출력

        double[] dArr = new double[5]; // 5개의 배열 선언언 ( 0 ~ 4 )
        int count = 0;
        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for(int i=0; i < count; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);
    }
}
