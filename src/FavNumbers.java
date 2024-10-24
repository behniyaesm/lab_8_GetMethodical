import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(sc,"Enter your favorite integer");
        favDouble = SafeInput.getDouble(sc,"Enter your favorite double");
        System.out.println("Your favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }
}
