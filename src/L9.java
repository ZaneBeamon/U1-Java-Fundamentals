import javax.swing.JOptionPane;

    public class L9 {
    public static void main(String[] args) {
        String  firstname;
        String Lastname;
        firstname =JOptionPane.showInputDialog("what is your first name? ");
        Lastname = JOptionPane.showInputDialog(" what is your last name? ");

        // all inputs are counted as string data

        JOptionPane.showMessageDialog(null, "hello" + firstname + " " + Lastname + "!!");

        int MPH, Minutes;
        double Hours, Distance;

        //Separate  like data-type variables on one line with a " , "

        MPH = Integer.parseInt(JOptionPane.showInputDialog("what is your speed? "));
        Minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, in minutes, did you travel? "));

        Hours = Minutes/ 60.0;
        Distance = Hours * MPH;

        JOptionPane.showMessageDialog(null, "you travelled " + Distance + "Miles. ");

        System.exit(0);



        System.exit(0);



    }

}
