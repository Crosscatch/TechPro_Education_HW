package MethodCreation;

import java.util.Scanner;

public class MethodExercise1 {
    public static void main(String[] args) {
        // Kullanicidan 3 sayi alip minimum veya maximum degerlerini bulan 2 method olustur ve ekrana yazdir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Sectiginiz Ilk Sayiyi Giriniz");
        int num1 = scan.nextInt();
        System.out.println("Lutfen Sectiginiz Ikinci Sayiyi Giriniz");
        int num2 = scan.nextInt();
        System.out.println("Lutfen Sectiginiz Ucuncu Sayiyi Giriniz");
        int num3 = scan.nextInt();
        maxValue(num1,num2,num3);
        minValue(num1,num2,num3);

    }

    private static void maxValue() {

    }

    public static void maxValue (int sayi1, int sayi2, int sayi3) {
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En buyuk sayi : " + sayi1);
        }
        if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En buyuk sayi : " + sayi2);
        }
        if (sayi3 > sayi2 && sayi3 > sayi1) {
            System.out.println("En buyuk sayi : " + sayi3);
        }

    }

    public static void minValue(int num11, int num22, int num33) {
        if (num11 < num22 && num11 < num33) {
            System.out.println("En kucuk sayi : " + num11);
        }
        if (num22 < num11 && num22 < num33) {
            System.out.println("En kucuk sayi : " + num22);
        }
        if (num33 < num22 && num33 < num11) {
            System.out.println("En kucuk sayi : " + num33);
        }


    }
}
