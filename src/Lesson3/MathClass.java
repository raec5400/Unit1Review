package Lesson3;

public class MathClass {

    public static void main(String[] args) {
        //Math is part of core language - no import needed
        //All Math methods are static - DONT do this: Math m = new Math()
        //Therefore all methods can be run directly through the class itself
        //NOT THIS - m.pow(x,3), but THIS INSTEAD - Math.pow(x,3);
        int x = 25;
        System.out.println(Math.pow(x,3)); //25 to the power of 3
        System.out.println(Math.sqrt(x)); //squar root of 25
        double y = 8.9876;
        System.out.println(Math.round(y)); //9
        System.out.println(Math.max(x, y)); //max = highest
        
        //random class: We used to go: Random r = new Random(); r.next()
        System.out.println("Here is a random number: " + Math.random()); //0 and 1
        
        //To use a range: (int)(Math.random() * range + min number);
        //Ex - 30 to 50: range = 21
        int rnum = (int)(Math.random() * 21 + 30);
        System.out.println("Random number is " + rnum);
        rnum = (int)(Math.random() * 10 + 1);//1 to 10
        
        System.out.println("\n\nShortcut review\n===================\n");
        int a = 10;
        a +=10; //go up by 10 to 20
        System.out.println("a is " + a);
        int b = a;//b = 20
        b++; //b -21;
        System.out.println("b is " + b);
        a *= 2; //a = a * 2; //40
        System.out.println("a is double to " + a);
        //let c = b, then increase b by 1
        int c = b++; //c = 21, b = 22
        System.out.format("c is %d and b is %d\n",c,b);
        //let b go up by 1 and assign NEW b value to d at the same time
        int d = ++b; //d and b will be 23
        System.out.format("d is %d and b is%d\n", d, b);
            }
    
}
