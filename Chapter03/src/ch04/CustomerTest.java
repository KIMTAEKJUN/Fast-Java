package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);
        System.out.println(customerKim.showCustomerInfo());

        // vc 변수의 타입은 Customer지만, 인스턴스의 타입은 VIPCustomer임
        Customer vc = new VIPCustomer(12345, "noname");
        System.out.println(vc.calcPrice(1000));
   }
}