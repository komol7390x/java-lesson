package Lesson3.Student;

public class Money {
    private  final long amount;

    public Money(long amount) {
        this.amount = amount;
    }

    public  static Money ofSum(long sum){
        if(sum<0) throw  new IllegalArgumentException("Summa manfiy bo'lmaydi");
        return  new Money(sum*100);
    }
}
