package DecideIforElse;

import java.util.Scanner;

public class IsSquare {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user and check if it is square or not.

        Scanner scanIsSquare = new Scanner(System.in);
        System.out.println("Please, Write first side length ");
        float firstLength = scanIsSquare.nextFloat();
        System.out.println("Please, Write second side length ");
        float secondLength = scanIsSquare.nextFloat();

        if (firstLength == secondLength) {
            System.out.println("It's a square and its area value : " + secondLength * firstLength);
        }
        if (firstLength != secondLength) {
            System.out.println("It'a rectangle and its area value : " + secondLength * firstLength);
        }



    }
}
