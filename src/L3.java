public class L3 {

    //add the main method header below.
    /*literal Value is a value written directly into code
    an Expression is a value written using variables or operators
   */

    public static void main(String[] args) {

        int literalValue = 5;
        int literalValue2 = 6;
        int expression = 5 + 6;
        int expression2 =literalValue = 6;
        int expression3 = literalValue = literalValue2;
        //examples of literal Values
        double literalExample1 = 3.4;
        boolean literalExample = true;
        String literalExample3 = "APPLE";
        //Examples of expressions
        double expressionExample = 5 + 6;
        boolean expressionExample2 = 5 > 6;

        //Bad EX
        //int badExample = 5.4 + 9;

        //A String expression is called String Concatenation. you cna combine String using the +.
        String expressionExample3 = "A fruit people eat is an" + literalExample3;

        //EXAMPLE PROGRAMMER
        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);
    }
}
