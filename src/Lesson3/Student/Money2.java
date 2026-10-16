package Lesson3.Student;

public class Money2 {
    private final long amount; // tiyinlarda
    private final String currency;
    public Money2(long amount, String currency) {
        if (amount < 0) throw new IllegalArgumentException("Summa manfiy bo'lmaydi");
        this.amount = amount;
        this.currency = currency;
    }
    public long getAmount() { return amount; }
    public String getCurrency() { return currency; }
    // "O'zgartirish" o'rniga YANGI object qaytaramiz
    public Money2 plus(Money2 other) {
        return new Money2(this.amount + other.amount, currency);
    }

}
