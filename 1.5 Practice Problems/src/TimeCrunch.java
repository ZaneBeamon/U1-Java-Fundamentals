public class TimeCrunch {
    public static void main(String[] args) {
        double clockChange  = 15325;

        double Clock = (int) (clockChange * 0.3600 );

        double  numHours = Clock / 1.0 ;
        Clock = Clock % 1;

        double numMinutes = Clock / 15.0;
        Clock = Clock % 15;

        double numSeconds = Clock / 60.0;
        Clock = Clock % 60;

        System.out.println("Time needed to make" + clockChange);
        System.out.println("hours" + numHours);
        System.out.println("minutes" + numMinutes);
        System.out.println("Seconds" + numSeconds);



    }

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
}
