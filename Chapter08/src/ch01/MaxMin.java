package ch01;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int Min = arr[0];
        int Max = arr[0];
        int MinIndex = 0;
        int MaxIndex = 0;

        for(int i=1; i<arr.length; i++) {

            if(Min > arr[i]) {
                Min = arr[i];
                MinIndex = i+1;
            }

            if(Max < arr[i]) {
                Max = arr[i];
                MaxIndex = i+1;
            }
        }

        System.out.println("가장 큰 값은 " + Max + " 이고, 위치는 " + MaxIndex + "번 입니다.");
        System.out.println("가장 작은 값은 " + Min + " 이고, 위치는 " + MinIndex + "번 입니다.");
    }

}