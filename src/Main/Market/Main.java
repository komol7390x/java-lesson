package Main.Market;
import java.util.Scanner;


public class Main {
    Menu menu=new Menu();

    public void main() {
        System.out.println("BIZNING BIRINCHI DO'KON MINI LOYIHAMIZ!");
        boolean isRunning = true;

        while (isRunning){
            this.menu.showMenu();
            int choice=Menu.readNumber("Operatsiyani tanglang: ",0,Product.productInfo.length);

            switch (choice){
                case 1:
                    this.menu.showProductList();
                    break;
                case 2:
                    this.menu.addCart();
                    break;
                case 0:
                    isRunning = false;
                    break;
            };
        }
    }
}
