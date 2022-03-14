package ch02;

// Customer(상위) 클래스가 VIPCustomer(하위) 클래스에게 상속한다.
public class VIPCustomer extends Customer {
    private String agentID;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }

    public String getAgentID() {
        return agentID;
    }
}
