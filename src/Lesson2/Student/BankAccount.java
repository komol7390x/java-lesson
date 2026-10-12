package Lesson2.Student;

public class BankAccount {
    final String accountNumber; // ochilgandan keyin hech qacho o'zgarmaydi
    final String owner;
    double balance; // final emas: pul kirib-chiqib turadi

    BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber; // constructorda bir marta: ruxsat
        this.owner = owner;
        this.balance = 0;
    }
    void deposit(double amount) {
        balance += amount; // ruxsat
    }
    void changeAccountNumber(String newNumber) {
//        accountNumber = newNumber; // XATO: final maydon
    }

}
