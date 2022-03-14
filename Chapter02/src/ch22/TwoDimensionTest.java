package ch22;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6,7}}; // 2차원 배열 선언
        int i,j;

        for(i=0; i<arr.length; i++) { // 2차원 배열에 행의 개수
            for (j = 0; j < arr[i].length; j++) { // 2차원 배열에 열의 개수
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(", \t" + arr[i].length); // 열의 개수 출력
        }
    }
}
