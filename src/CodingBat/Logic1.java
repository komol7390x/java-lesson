package CodingBat;

public class Logic1 {
    static void main() {
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int newSpeed = speed;
        if (isBirthday) newSpeed = speed - 5;
        if (newSpeed <= 60) return 0;
        else if (newSpeed >= 61 && newSpeed <= 80) return 1;
        return 2;
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        if (a + b == 6) return true;
        return Math.abs(a - b) == 6;
    }

    public boolean more20(int n) {
        int number = n % 20;
        return number == 2 || number == 1;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer && temp >= 40 && temp <= 100) return true;
        else if (temp >= 40 && temp <= 90 && !isSummer) return true;
        return false;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) return "off";
            return "10:00";
        } else {
            if (day == 0 || day == 6) return "10:00";
            return "7:00";
        }
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10) return true;
            return false;
        } else {
            if (n >= 1 && n <= 10) return true;
            return false;
        }
    }

    public boolean specialEleven(int n) {
        int num = n % 11;
        return num == 0 || num == 1;
    }

    public boolean old35(int n) {
        if (n < 0 || (n % 3 == 0 && n % 5 == 0)) return false;
        if (n % 3 == 0 || n % 5 == 0) return true;
        return false;
    }

    public boolean less20(int n) {
        if (n <= 0) return false;
        int num = n % 20;
        return num == 18 || num == 19;
    }

    public boolean nearTen(int num) {
        if (num < 0) return false;
        int n = num % 10;
        if (n == 1 || n == 2 || n == 9 || n == 8 || n == 0) return true;
        return false;
    }

    public int teenSum(int a, int b) {
        int age = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        return age;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        return !isMorning || isMom;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') return "FizzBuzz";
        else if (str.charAt(0) == 'f') return "Fizz";
        else if (str.charAt(str.length() - 1) == 'b') return "Buzz";
        else return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        else if (n % 3 == 0) return "Fizz!";
        else if (n % 5 == 0) return "Buzz!";
        else return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        int x = a % 10;
        int y = b % 10;
        int z = c % 10;
        return x == y || y == z || z == x;
    }

    public boolean lessBy10(int a, int b, int c) {
        boolean x = Math.abs(a - b) >= 10;
        boolean y = Math.abs(c - b) >= 10;
        boolean z = Math.abs(c - a) >= 10;
        return x || y || z;
    }


}
