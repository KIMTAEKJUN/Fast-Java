package ch02;

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
