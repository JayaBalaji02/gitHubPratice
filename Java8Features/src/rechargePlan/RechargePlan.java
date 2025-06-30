package rechargePlan;

class RechargePlan {
    int id;
    String description;
    double amount;

    public RechargePlan(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public void display() {
        System.out.println(id + ". " + description + " - " + amount);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
