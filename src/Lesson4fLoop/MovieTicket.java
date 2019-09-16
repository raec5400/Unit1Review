package Lesson4fLoop;

import java.util.Scanner;

public class MovieTicket {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        char day;
        double price;
        //ask for day of week until you get back m, t or o
        while(true){
            System.out.print("Enter day of the week: ");
            System.out.print("\"m\" for matinee, \"t\" for Tuesday, \"o\" for other: ");
            day = s.next().charAt(0);
            if(day=='m' || day== 't' || day=='o')break;
            System.out.println("Invalid - try again!");
        }
        //m = 5, t = 4, else - age:
        if(day=='m') price = 5;
        else if(day=='t')price = 4;
        else{
            //it's o - this code only runs if day is o
            boolean ageok;
            do{
                System.out.print("Enter your age for price (0 to 99): ");
                age = s.nextInt();
                ageok = age >=0 && age <=99;
                if(!ageok)System.out.println("Error try again.\n");
            }while(!ageok);
            
            price = age >= 18? 12 : 10.5;
        }//end else
        //final code for ALL choices
        System.out.format("Price will be $%.2f\n", price);
    }
    
}
