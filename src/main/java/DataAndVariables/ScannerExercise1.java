package DataAndVariables;

import java.util.Scanner;

public class ScannerExercise1 {
    public static void main(String[] args) {

        // Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarinin uzunlugunu yazin");
        int square1 = scan.nextInt();
        System.out.println("Cevre = "+ 4*square1);
        System.out.println("Alan = " + square1*square1);

    }
}
