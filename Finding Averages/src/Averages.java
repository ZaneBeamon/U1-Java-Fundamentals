package src;

public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */
    public static void main(String[] args) {
        int testscore1 = 12;
        int testscore2 = 13;
        int testscore3 = 14;
        int testscore4 = 15;
        int sumtotal = testscore1 + testscore2 + testscore3 + testscore4;
        double average = sumtotal/4.0;

       System.out.println("the average is " + average);

    }

}
