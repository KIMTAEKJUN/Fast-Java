package ch15;

// Customer 클래스가 Buy, Sell 클래스를 상속받는다.
public class Customer implements Buy, Sell {
    @Override
    public void Buy() {
        System.out.println("Customer Buy");
    }

    @Override
    public void Sell() {
        System.out.println("Customer Sell");
    }

    @Override
    public void order() {
        // 둘 중에 하나를 선택을 하던가, 재정의를 해야된다.
        // Buy.super.order();
        // Sell.super.order();
        System.out.println("Customer order");
    }

    public void hello() {
        System.out.println("Hello");
    }
}
