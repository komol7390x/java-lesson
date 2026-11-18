package exercise;

public class Card {
    private final String owner;
    private double balance;

    public Card(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void addCashback(double cashBack) {
        this.balance *= 1 + (cashBack / 100);
    }

    public void chargeFee(double fee) {
        if (this.balance < fee) return;
        this.balance -= fee;
    }

    public void print() {
        System.out.println(this.owner + " : " + this.balance+" so\'m");
    }

}
