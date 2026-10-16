package Lesson3.Student;

public class BankAccount {
    private final String accountNumber;
    private final String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Summa musbat bo'lishi kerak");
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Summa musbat bo'lishi kerak");
        }
        if (amount > balance) {
            throw new IllegalStateException("Hisobda mablag' yetarli emas");
        }
        balance -= amount;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }
}
