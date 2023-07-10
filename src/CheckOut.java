import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double priceOfCheckout  = 0.0;
        boolean continueYN = false;
        do
        {
            double price = SafeInput.getRangedDouble(in, "What is the price of you item?",.5,10.0);
            priceOfCheckout = priceOfCheckout + price;
            continueYN = SafeInput.getYNConfirm(in,"Would you like to continue?");
            System.out.println("\nThe total of your order is : " + priceOfCheckout);
        }while(continueYN);

        //priceOfCheckout = Math.round(priceOfCheckout * 100) / 100.0;
        System.out.printf("%s%.2f","\nThe grand total is : " , priceOfCheckout);
    }
}
