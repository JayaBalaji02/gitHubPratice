package rechargePlan2;

public class PlanDTO {
    int customerId;
    String customerName;
    String planDetails;
    long amount;

    @Override
    public String toString() {
        return "PlanDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", planDetails='" + planDetails + '\'' +
                ", amount=" + amount +
                '}';
    }

    public PlanDTO(int customerId, String customerName, String planDetails, long amount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.planDetails = planDetails;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(String planDetails) {
        this.planDetails = planDetails;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
