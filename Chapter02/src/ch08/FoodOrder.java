package ch08;

public class FoodOrder { // FoodOrder란 Class 생성

    // Date 나 Calendar 객체를 사용할 줄 알면 시간이나 날짜 대한 값은 해당 객체를 사용하면 됩니다.
    // 여기서 숫자에 해당되는 자료형을 String으로 표현한건 0으로 시작될 가능성이 있는 숫자에 해당합니다.

    public String receiptId; // 주문 접수 번호
    public String phoneNumber; // 주문 핸드폰 번호
    public String address; // 주문 집 주소
    public String orderDate; // 주문 날짜
    public String orderHour; // 주문 시간
    public int orderPrice; // 주문 가격
    public String menuId; // 메뉴 번호

    public void showOrderInfo() { // 결과 출력해주는 메소드
        System.out.println("주문 접수 번호 : " + receiptId + "\n주문 핸드폰 번호 : " + phoneNumber + "\n주문 집 주소 : " + address + "\n주문 날짜 : "
            + orderDate + "\n주문 시간 : " + orderHour + "\n주문 가격 : " + orderPrice + "\n메뉴 번호 : " + menuId);
    }
}
