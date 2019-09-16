package Lesson4fLoop;

import java.util.Scanner;

public class IfReview {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        if(num>7){
            System.out.println("Too high");
            num--;
        }
        else if(num<7){
            System.out.println("Too low");
            num++;
                    }
        else
            System.out.println("Just right"); 
        //not part of IF will run every time
        System.out.format("Number is now %d\n", num);
        int rnum = (int)(Math.random() * 10 +1); //1 to 10
        System.out.format("Random number is %d\n", rnum);
        
        //which one is higher 3 ways
        int higher;
        if(rnum > num) higher = rnum;
        else higher = num;
        System.out.println("The higher number is " + higher);
        
        //2nd way
        higher = Math.max(num, rnum);
        System.out.println("The higher number is " + higher);
        
        //3rd way
        //  higher = is this true?  Yes : No    :=else
        higher = (rnum > num)? rnum : num;
        System.out.println("The higher number is " + higher);
    }
    
}
