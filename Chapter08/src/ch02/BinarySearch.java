package ch02;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83;

        int left = 0;
        int right = numbers.length - 1;
        int mid = (left+right)/2;

        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if (target == temp) { // 수를 작은 경우
                find = true;
                break;
            } else if (target < temp) { // 찾으려는 수가 더 작은 경우
                right = mid-1;
            } else {
                left = mid+1;
            }
            mid = (left+right)/2;
            temp = numbers[mid];
        }

        if (find) {
            mid++;
            System.out.println("찾는 수는 " + mid + "번째에 있습니다." );
        } else {
            System.out.println("수를 찾지 못했습니다.");
        }
    }
}
