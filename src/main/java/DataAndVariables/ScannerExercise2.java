package DataAndVariables;

import java.util.Scanner;

public class ScannerExercise2 {
    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayin yazdirin
        Scanner circle = new Scanner(System.in);
        System.out.println("Lutfen Cemberin yaricapini yaziniz ");
        double yaricap = circle.nextDouble();
        System.out.println("Cemberin Cevresi = " + 3*(yaricap*2) + "(--Pi sayisi = 3 alinmistir.--)");
        System.out.println("Dairenin Alani = " + 3*(yaricap*yaricap)+ "(--Pi sayisi = 3 alinmistir.--)");
    }
}
