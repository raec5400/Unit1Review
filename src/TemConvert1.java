import java.util.Scanner;

public class TemConvert1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double far, cel;
        //input
        System.out.print("Enter degrees F: ");
        far = s.nextDouble();
        //proecss
        cel = (far-32.0) * 5.0 / 9.0;
        //output
        System.out.format("%.2f F = %.2f C\n", far, cel);
    }
    
}
