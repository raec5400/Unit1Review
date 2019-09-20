package Lesson3;

public class VariablesReview {

    public static void main(String[] args) {
        //primitive data types - can only store data
        //whole numbers
        byte b = 127; //1 byte of memory, 127 max
        short c = 12345; //2 bytes
        int a = 1234567890; //4 bytes
        long d = 1234567890123456789L; //8 bytes
        //decimals
        float flt = 45.78F; //4 bytes
        double dbl = 45.78; //8 bytes
        //2 more
        char letter = 'c'; //2 bytes
        boolean bool = true; //1 byte
        
        //Strings - NOT primitive
        //Strings have lots of 'abilities' (methods)
        //3 things to know about ALL object-methods
        //a) All methods have return types (even void - returns nothing
        //b) methods may or may not require parameters (data) to be sent in
        //c) some methods have more than 1 way to run them (ex, pen.move(x), .move(x,y)
        
        String s = "I went to school today";
        //s. brings up the string methods
        
        int len = s.length();
        System.out.println("Length of s is " + len);
        char lett = s.charAt(7);
        String str1 = s.substring(0,4); //I we
        String str2 = s.substring(7); //to school today
        System.out.println(str1);
        System.out.println(str2);
        
        //escape codes: \n \t \" \\
        System.out.println("I went \n to school today"); //\n = new line
        System.out.println("I went \t\t\t to school today"); //\t = tab
        System.out.println("She was line \"No way!\""); //\" = print "
        System.out.println("Path to file is C:\\Downloads\\Temp"); //\\ = print \
        
        
    }
    
}
