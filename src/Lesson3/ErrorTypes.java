package Lesson3;

import java.util.Scanner;

public class ErrorTypes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Syntax - error in code, prevents program from running
        int x;
        //x = x.nextDouble(); //error

        //Logic error - code words ok but wrong result happens
        double hours = 10.5, wage = 14.50;
        double pay = hours + wage; //should be * not +
        System.out.println("Your pay this week is " + pay);

        //runtime error - program starts then crashes
        System.out.print("Enter a value for x: ");
        x = s.nextInt(); //error will get thrown if user does not enter an integer

        //better approach - use try / catch to respond to error
        try {
            System.out.print("Enter a value for x: ");
            x = s.nextInt();
        } catch (Exception e) {
            //this runs if error happens
            System.out.println("Error - did not enter a number");
        }
    }

}
