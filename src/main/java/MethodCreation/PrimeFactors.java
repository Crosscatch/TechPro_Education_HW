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
                //sayi /= i; ==> Asal Carpanlari gosterir.
                /*
                Evet, tabii ki! sayi /= i ifadesi, sayi değişkeninin şu anki değerini i'ye bölerek elde edilen tam sayı sonucunu sayi değişkenine atar.
                Bu işlem, sayi'nın i'ye tam olarak bölünebilecek şekilde küçültülmesini sağlar.
                Örneğin,sayi'nın 60,i'nin ise 2 olduğunu varsayalım.
                Bu durumda, while döngüsü sayi'nın i'ye tam olarak bölünebildiğini anlar ve i'yi ekrana yazdırır.
                Daha sonra, sayi /= i ifadesi, sayi'yı i'ye böler ve sonucu sayi'ya atar.
                Bu, sayi'nın 60'tan 30'a düşmesine neden olur. Bu işlem, sayi'nın i'ye tam olarak bölünebilecek şekilde küçültülmesini sağlar.
                Daha sonra, i değeri 2 olarak kalır ve döngü sayi'nın yeni değeri olan 30 ile devam eder.
                Bu kez, while döngüsü, sayi'nın i'ye tam olarak bölünemediğini anlar ve döngü sona erer.
                Döngü sonlandığında, i değeri 3 olarak artar ve döngü, sayi'nın 30 olduğu durumda tekrarlanır.
                Bu işlem, i'nin her bir değeri için, sayi değerinin bölünebileceği kadar küçültülmesini sağlar.
                Sonunda, sayi'nın 1'e eşit olduğu bir noktada döngü sonlandırılır ve tüm asal çarpanlar ekrana yazdırılır.
                 */

                //break ==> Carpanlari gosterir
            }
        }
    }

}
