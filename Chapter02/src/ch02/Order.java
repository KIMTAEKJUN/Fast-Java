package ch02;

public class Order { // 주문(Order) Class 구현
    // 클래스의 속성, 특성을 멤버 변수(Member Variable)라 말한다.
    // 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태를 클래스(Class)라 말한다.
    int orderId; // 주문번호
    String buyerId; // 구매자(회원ID)
    String sellerId; // 판매자
    String productId; // 구매한 물건
    String orderDate; // 구매날짜

    public void setBuyerName(String name) {
        buyerId = name;
    }

    public void showOrderby() {
        System.out.println("구매자 이름: " + buyerId + ", 판매자 이름: " + sellerId + ", \n구매 제품: " + productId + ", 주문날짜: " + orderDate + ", " + orderId);
    }
}
