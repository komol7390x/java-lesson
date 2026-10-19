package Main.Market;
import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    static protected void printLine(char symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    static protected int readNumber(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number>=min && number<=max) return number;
                System.out.println("Siz kiritgan son oraliqda emass!!!!");
            }
            System.out.println("Siz kiritgan belgi son emas!!!!");
        }
    }

    static protected void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

}
