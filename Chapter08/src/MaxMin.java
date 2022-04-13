//public class MaxMin {
//    public static void main(String[] args) {
//        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
//
//        int Maxarr = arr[0];
//        int Minarr = arr[0];
//        int Max = 0;
//        int Min = 0;
//
//        for (int i=1; i<arr.length; i++) {
//            if (Max < Maxarr[i]) {
//                Max = Maxarr[i];
//                Maxarr = i+1;
//            }
//            if (Min > Minarr[i]) {
//                Min = Minarr[i];
//                Minarr = i+1;
//            }
//        }
//        System.out.println("가장 큰 값은 " + Maxarr + " 이고, 위치는 " + Max + " 입니다." );
//        System.out.println("가장 작은 값은 " + Minarr + " 이고, 위치는 " + Min + " 입니다." );
//    }
//}
