package Main.Market;

import Main.Market.type.ProductInfo;

public class Menu extends Utils {
    Product product = new Product();

    public void showMenu() {
        printLine('=', 40);
        System.out.println("1. Mahsulotlar ro'yhati");
        System.out.println("2. Savatga qo'shish");
        System.out.println("3. Savatdan olib tashlash");
        System.out.println("4. Savatni ko'rish");
        System.out.println("5. Mahsulotni qidirish");
        System.out.println("6. To'lov va chek");
        System.out.println("7. Kun hisoboti");
        System.out.println("0. Chiqish");
        printLine('=', 40);
    }

    public void showProductList() {
        clearConsole();
        System.out.printf("%-2s %-18s %10s %8s%n",
                "#", "Mahsulot", "Narx", "Qoldiq");
        printLine('-', 40);
        for (int i = 0; i < Product.productInfo.length; i++) {
            ProductInfo item = Product.productInfo[i];
            System.out.printf("%-3d %-18s %,10.0f %8d%n",
                    i + 1,
                    item.name,
                    item.price,
                    item.stock);

        }
        System.out.printf("%-3s %-18s %,10d %8d%n",
                "0",
                "Chiqish",
                0,
                0);
    }

    public void addCart() {
        showProductList();
        int number = readNumber("Qaysi mahsulotni kiritmoqchisz? (0-Bekor)\t", 0, this.product.productLength);
        if (number == 0) showMenu();
        number = number - 1;
        int available = Product.productInfo[number].stock - this.product.cart[number];
        if (available < 0) System.out.println(Product.productInfo[number].name + " mahsulot qolmagan");
        int quantity = readNumber("Nechta maxsult sotib olasiz?\t", 1, available);
        this.product.cart[number] += quantity;
        System.out.println("Savatga " + quantity + " ta mahsulot qoshildi!");
    }

    public void showCart() {
        if (this.isEmpty()) System.out.println("Savat bo'sh");
        System.out.println();
        System.out.println("---------------SAVAT----------------");
    }

    public boolean isEmpty() {
        for (int quantity : this.product.cart) {
            if (quantity > 0) return false;
        }
        return true;
    }
}
