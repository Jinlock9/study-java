package ch3.ch3_06;

public class VIP extends Customer {
    private int agentID;
    double salesRatio;

    public VIP() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        // System.out.println("- VIP Constructor Called.");
    }

    public VIP(int customerID, String customerName) {
        super(customerID, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        // System.out.println("- VIP Constructor Called.");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= price * salesRatio;
        return price;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
