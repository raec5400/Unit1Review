package Lesson3;

public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x * 2; //44
        //must cast (convert on the fly) y to a double
        double z = (double) y / 7;
        System.out.println("z is " + z);

        //MOD - gives the remainder (int) from a divide calculation       
        int remain = y % 7;
        System.out.format("%d / 7 = %d, remainder %d", y, y / 7, remain);

        //BEDMAS
        int e, f, g;
        e = f = g = 5; //assign all to 5
        int ans;

        ans = e + f * g; //5+5*5
        System.out.format("%d + %d * %d = %d\n", e, f, g, ans); //30

        ans = (e + f) * g; //(5+5)*5
        System.out.format("(%d + %d) * %d = %d\n", e, f, g, ans); //50

        ans = e + f % g; //5+5%5 = 5+0
        System.out.format("%d + %d %% %d = %d\n", e, f, g, ans); //5
        
        ans = (e + f) % g; //(5+5)%5 = 10%5 = 0
        System.out.format("(%d + %d) %% %d = %d\n", e, f ,g, ans); //0
    }

}
