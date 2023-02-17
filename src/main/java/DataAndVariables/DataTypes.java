package DataAndVariables;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        char className = 'A';
        boolean isValid = true;
        String name = "Burak";
        System.out.println(className + " " + isValid + " " + name);
        // Swap two number with third variables
        int a = 12;
        int b = 20;
        int t = a + b;
        int a1 = t - a;
        int b1 = t - b;
        System.out.println("Swapped a = " + a1);
        System.out.println("Swapped b = " + b1);

        //Swap two number without third variables/************
        int x = 15;
        int y = 25;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Swapped x = " + x);
        System.out.println("Swapped y = " + y);

        //Kullanicidan iki tamsayi alip bu sayilarin toplam , fark ve capimlarini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int num1 = scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz ");
        int num2 = scan.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        // Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin


    }

}


