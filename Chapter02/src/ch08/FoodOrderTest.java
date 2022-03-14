package ch08;

public class FoodOrderTest {
    public static void main(String[] args) {

        FoodOrder foodorder = new FoodOrder(); // new 생성자를 사용하여, foodorder란 변수 선언

        foodorder.receiptId = "202011020003"; // 주문 접수 번호 : 202011020003
        foodorder.phoneNumber = "010-2345-0001"; // 주문 핸드폰 번호 : 010-2345-0001
        foodorder.address = "서울시 강남구 역삼동 111-333"; // 주문 집 주소 : 서울시 강남구 역삼동 111-333
        foodorder.orderDate = "20201102"; // 주문 날짜 : 20201102
        foodorder.orderHour = "130258"; // 주문 시간 : 130258(1시 2분 58초)
        foodorder.orderPrice = 35000; // 주문 가격 : 35000
        foodorder.menuId = "0003"; // 메뉴 번호 : 0003

        foodorder.showOrderInfo(); // 출력
    }
}
