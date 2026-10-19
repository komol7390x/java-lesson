package Main.Teacher;

public class Main {
        static byte b;
        static short s;
        static int i;
        static long l;
        static float aFloat;
        static double aDouble;
        static char c;
        static boolean bool;
        static String matn; // reference tur
    public static void main(String[] args){
//        int narx;
//        narx=60000;
//        int miqdor=3;
//
//        int jami=narx* miqdor;
//        System.out.println("Jami: " + jami);
//
//        narx=narx+10000;
//        jami=narx*miqdor;
//        System.out.println("Yangi jami: " + jami);

//        int narx = "salom"; // XATO: int ga matn yozib bo'lmaydi
            byte harorat = -15; // havo harorati
            short yilKuni = 365; // yildagi kunlar
            int miqdor = 12; // savatdagi mahsulot soni
            long chekId = 9_000_000_123L; // chek raqami (katta son)
            System.out.println("Harorat: " + harorat);
            System.out.println("Yil kunlari: " + yilKuni);
            System.out.println("Miqdor: " + miqdor);
            System.out.println("Chek ID: " + chekId);

            System.out.println("byte max: " + Byte.MAX_VALUE);
            System.out.println("short max: " + Short.MAX_VALUE);
            System.out.println("int max: " + Integer.MAX_VALUE);
            System.out.println("long max: " + Long.MAX_VALUE+"\n");

            float f = 1.0f / 3; // float: 4 bayt
            double d = 1.0 / 3; // double: 8 bayt
            System.out.println("float : " + f);
            System.out.println("double: " + d);
            double ogirlik = 1.25; // kg
            double kgNarxi = 32000; // 1 kg olma narxi
            System.out.println("To'lov: " + ogirlik * kgNarxi+ "\n");


            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + aFloat);
            System.out.println("double: " + aDouble);
            System.out.println("char kodi: " + (int) c);
            System.out.println("boolean: " + bool);
            System.out.println("String: " + matn);


    }
}
