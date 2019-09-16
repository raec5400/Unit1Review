package Lesson4fLoop;

public class FormatReview {

    public static void main(String[] args) {
        //assume Barrie has 140000 and grows 3% per decade
        //what will it be in 100 years?
        int pop = 140000;
        int growth;

        //column headings
        System.out.format("%s%20s%20s%20s\n", "YEAR", "POPULATION", "GROWTH", "END POPULATION");
        System.out.format("%s%20s%20s%20s\n", "====", "==========", "======", "==============");

        for (int year = 2020; year < 2120; year += 10) {
            System.out.format("%d%18d", year, pop);
            growth = (int) (pop * 0.04);
            pop += growth;
            System.out.format("%21d%17d\n", growth, pop);
        }
        double fee = 99.95;
        System.out.format("That will be $%10.2f\n", fee);
    }

}
