package MethodCreation;

import java.util.Scanner;

public class PrimeFactors {
    //Define a method to print the prime factors of a number.
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Asal Carpanlarina ayirmak istediginiz sayiyi giriniz");
        int primeFactor = scan1.nextInt();
        asalCarpanlariGoster(primeFactor);
    }

    public static void asalCarpanlariGoster(int sayi) { // ******     I don't get it // Return Back      *******
        System.out.print("Asal çarpanlar: ");

        for (int i = 2; i <= sayi; i++) {
            while (sayi % i == 0) {
                System.out.print(i + " ");
                sayi /= i;
            }
        }
    }

}
