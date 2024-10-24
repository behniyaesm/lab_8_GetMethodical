public class CtoFTableDisplay
{
    public static void main(String[] args) {
        System.out.printf("%-10s %s%n", "Celsius", "Fahrenheit");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = SafeInput.CtoF(celsius);
            System.out.printf("%-10d %.2f%n", celsius, fahrenheit);
        }
    }
}
