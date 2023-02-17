package DataAndVariables;

import java.util.Scanner;

public class ScannerExercise4 {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini alip aralarindan
        // bir bosluk olusturulmus sekilde yazdiriniz

        Scanner nameSurname= new Scanner(System.in);
        System.out.println("Isminizi yaziniz");
        String name= nameSurname.nextLine();
        System.out.println("Soyisminizi yaziniz");
        String Surname= nameSurname.nextLine();
        System.out.println(name + " "+ Surname);
        System.out.println(name.charAt(0));

    }
}
