import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        double total = 0;

        do {
            double itemPrice = SafeInput.getRangedDouble(sc, "Enter item price", .50, 10.00);
            total += itemPrice;
            done = !SafeInput.getYNConfirm(sc, "Do you have more items?");
        } while (!done);
        System.out.println("Your total is $" + total);
    }
}
