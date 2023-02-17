package DataCasting;

public class ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1 = 59;
        short sayi2 = (short) sayi1; // Manual casting : double to int
        byte sayi3 = (byte) sayi2;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);


    }
}
