public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the subtotal, taxtoal, and total cost with tax.
     */
    public static void main(String[] args) {

      int quantity = 6;
      double price = 9.99;
      final double TAX = 7.0; //0.07
      final double TAXRATE = TAX/100.0;

      double subtotal = price * quantity;

      /* FORMULA : AMOUNT * (1 +/- Rate)
         COST INCREASE USE +
         COST DECREASE USE -
       */
      double tax = subtotal * TAXRATE;
      double totalcost = subtotal * (1 + TAXRATE);

      System.out.println("you boughht" + quantity + "shirt at" + price + "a piece");
      System.out.println("subtotal :" + subtotal);
      System.out.println("tax :" + tax);
      System.out.println("total :" + totalcost);
    }


}
