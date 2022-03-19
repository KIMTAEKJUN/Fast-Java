package ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.Buy();
        customer.Sell();
        customer.order();
        customer.hello();

        // Upcasting
        // Buy에서 정의된 메서드만 호출 가능하다.
        Buy buyer = customer;
        buyer.Buy();
        buyer.order();

        // Upcasting
        // Sell에서 정의된 메서드만 호출 가능하다.
        Sell seller = customer;
        seller.order();
        seller.Sell();
    }
}
