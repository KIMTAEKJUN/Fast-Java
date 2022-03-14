package ch03;

public class VIPCustomer extends Customer {
    private String agentID;
    double salesRatio;

    /* public VIPCustomer() {
        customerGrade = "VIP"; // 오류 발생
        salesRatio = 0.1;
        bonusRatio = 0.05;

        System.out.println("VIPCustomer() call");
    } */

    // super()는 상위 클래스의 기본 생성자를 호출 함
    // super를 이용하여 상위 클래스의 생성자 명시적으로 호출
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;

        System.out.println("VIPCustomer(int, String) call");
    }

    public String getAgentID() {
        return agentID;
    }
}
