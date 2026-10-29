package Lesson5;

public enum OrderStatus {
    NEW("Yangi"),
    PAID("To'langan"),
    SHIPPED("Yo'lda"),
    DELIVERED("Yetkazildi"),
    CANCELLED("Bekor qilindi");

    private final String label;

    OrderStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
