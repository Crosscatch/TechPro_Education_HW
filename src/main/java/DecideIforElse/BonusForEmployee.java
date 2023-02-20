package DecideIforElse;

import java.util.Scanner;

public class BonusForEmployee {
    public static void main(String[] args) {

        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        // Ask user for their salary and year of service and print the net bonus amount.

        Scanner scanBonus = new Scanner(System.in);
        System.out.println("Please , Entry Your Year of Service");
        short yearOfService = scanBonus.nextShort();
        System.out.println("Please , Entry Your Salary");
        int salary = scanBonus.nextInt();

        if (yearOfService > 5){
            System.out.println(salary+(salary*0.05));
        }
        else {
            System.out.println(salary + "\n" +
                    "You cannot get a bonus because your year of service is not more than 5 year");
        }










    }
}
