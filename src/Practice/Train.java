package Practice;

public class Train {
    private int id;
    private String fromCity;
    private String toCity;
    private double price;

    public Train(int id, String fromCity, String toCity, double price) {
        this.id = id;
        this.fromCity = fromCity;
        this.toCity = toCity;
        checkPrice(price);
    }

    private void checkPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Pul manfi bolmaligi kere");
        this.price = price;
    }


    public void printInfo() {
        System.out.printf("👉 [%d] %s -> %s | 💰 %,.0f so'm%n", id, fromCity, toCity, price);
    }

    public int getId() {
        return this.id;
    }
}
