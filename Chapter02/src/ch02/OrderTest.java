package ch02;

public class OrderTest {
    public static void main(String[] args) {
        Order orderby01 = new Order();

        orderby01.orderId = 2021103023;
        orderby01.setBuyerName("Kuah_0");
        orderby01.sellerId = "어반스터프";
        orderby01.productId = "아크 로고 후디";
        orderby01.orderDate = "2021-10-30";

        orderby01.showOrderby();

        System.out.println();

        Order orderby02 = new Order();

        orderby02.orderId = 2021111732;
        orderby02.setBuyerName("택쭈니");
        orderby02.sellerId = "브라운브레스";
        orderby02.productId = "PAISLEY TAG HOODIE";
        orderby02.orderDate = "2021-11-17";

        orderby02.showOrderby();
    }
}
