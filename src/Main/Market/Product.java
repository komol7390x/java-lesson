package Main.Market;

import Main.Market.type.ProductInfo;

public class Product {

    public static ProductInfo[] productInfo = {
            new ProductInfo("Non", 3500.0, 50),
            new ProductInfo("Sut 1L", 11000.0, 30),
            new ProductInfo("Tuxum (10 talik)", 18000.0, 40),
            new ProductInfo("O'simlik yog'i 1L", 22000.0, 25),
            new ProductInfo("G'sht (Mol)", 85000.0, 15),
            new ProductInfo("Guruch 1kg", 16000.0, 60),
            new ProductInfo("Shakar 1kg", 14000.0, 45),
            new ProductInfo("Tuz 1kg", 3000.0, 100),
            new ProductInfo("Kartoshka 1kg", 5500.0, 80),
            new ProductInfo("Piyoz 1kg", 4500.0, 70),
            new ProductInfo("Sabzi 1kg", 4000.0, 65),
            new ProductInfo("Makaron 500g", 8000.0, 50),
            new ProductInfo("Choy (Qora)", 15000.0, 35),
            new ProductInfo("Kofe", 45000.0, 20),
            new ProductInfo("Sariyog' 200g", 12000.0, 25),
            new ProductInfo("Pishloq 200g", 24000.0, 18),
            new ProductInfo("Mavsumiy meva 1kg", 20000.0, 30),
            new ProductInfo("Pamidor 1kg", 15000.0, 40),
            new ProductInfo("Bodring 1kg", 13000.0, 40),
            new ProductInfo("Suv 1.5L", 4000.0, 90)
    };

    public int productLength = productInfo.length;
    public int[] cart = new int[productLength];
    public int[] sold = new int[productLength];
    int dailyRevenue = 0;
    int receiptNumber = 0;
};

