package Lesson3.Student;

public class Main {
    static void main(String[] args) {
//        Product bread=new Product("Non", 4000,50);
//        System.out.println(bread.getPrice());
//
//        Money money=Money.ofSum(5000);
//        Money priceMoney=new Money(500);
//        System.out.println(money);

//        BankAccount acc=new BankAccount("UZ0001","Ali Valiyev");
//        acc.deposit(500_000);
//        acc.withdraw(200_000);
//        System.out.println(acc.getBalance());
//
//        acc.withdraw(1_000_000);
//        System.out.println(acc.getBalance());

        Money2 a = new Money2(500_000, "UZS");
        Money2 b = a.plus(new Money2(100_000, "UZS"));
        System.out.println(a.getAmount()); // 500000 (a o'zgarmadi)
        System.out.println(b.getAmount()); // 600000 (yangi object)


         

    }

}
