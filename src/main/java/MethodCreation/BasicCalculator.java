package MethodCreation;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        main2();
    }
    public static Scanner main2() {
        //Hesap Makinesi
        Scanner scan = new Scanner(System.in);
        System.out.println("------Iki islemli Hesap Makinesine Hosgeldiniz------\n" +
                "Lutfen Islem Yapilacak Ilk Sayiyi Giriniz");
        double num1 = scan.nextDouble();
        System.out.println("Lutfen Islem Yapilacak Ikinci Sayiyi Giriniz");
        double num2 = scan.nextDouble();
        System.out.println("Lutfen Yapmak Istediginiz Islemi Numara Sistemini Kullanarak Seciniz\n" +
                "Toplama islemini yapmak istiyorsaniz 1 yaziniz\n" +
                "Cikarma islemini yapmak istiyorsaniz 2 yaziniz\n" +
                "Carpma islemini yapmak istiyorsaniz 3 yaziniz\n" +
                "Bolme islemini yapmak istiyorsaniz 4 yaziniz");
        int options = scan.nextInt();

        if (options == 1) {
            Addition(num1, num2);
        }
        if (options == 2) {
            Cikarma(num1, num2);
        }
        if (options == 3) {
            Carpma(num1, num2);
        }
        if (options == 4) {
            Bolme(num1, num2);
        }

        System.out.println("Yapmak Istediginiz Baska Bir Islem Var Mi?\n" +
                "1--Evet\n" +
                "2--Hayir ");
        int yesOrNo = scan.nextInt();
        if (yesOrNo == 2) {
            System.out.println("Bizi kullandiginiz icin tesekkur ederiz\n" +
                    "Iyi Gunler ");
        }
        if (yesOrNo == 1) {
    return main2();
        }


        return scan;
    }


    public static void Addition(double x, double y) {
        System.out.println("Toplama isleminin sonucu : " + (x + y));
    }

    public static void Cikarma(double x, double y) {
        System.out.println("Cikarma isleminin sonucu : " + (x - y));
    }

    public static void Carpma(double x, double y) {
        System.out.println("Carpma isleminin sonucu : " + (x * y));
    }

    public static void Bolme(double x, double y) {
        System.out.println("Bolme isleminin sonucu : " + (x / y));
    }

}
