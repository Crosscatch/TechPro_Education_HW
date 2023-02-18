package LittleLittleIntoTheMiddle;

import java.util.Scanner;

public class Input_ID {
    public static void main(String[] args) {

        Scanner scanid = new Scanner(System.in);

        System.out.println("Please , Write your name and surname");
        String name = scanid.nextLine();

        System.out.println("Please , Write your Identification Number");
        String idNo = scanid.nextLine();

        System.out.println("Please , Write your Telephone Number");
        String telephoneNumber = scanid.nextLine();

        System.out.println("Please , Write your E-Mail");
        String email = scanid.nextLine();

        System.out.println("Your Information Has Been Saved\n" +
                "Write the information you want to learn by using integers\n" +
                "1 - Name - Surname\n" +
                "2 - Identification Number\n" +
                "3 - Telephone Number\n" +
                "4 - E-Mail Address ");
        byte get= scanid.nextByte();

        if (get == 1){
            System.out.println(name);
        }if (get == 2){
            System.out.println(idNo);
        }if (get == 3){
            System.out.println(telephoneNumber);
        }if (get == 4){
            System.out.println(email);
        } else if (get >= 5 ){
            System.out.println("Wrong Number Entry");
        }


    }
}
