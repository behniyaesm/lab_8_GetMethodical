import java.util.Scanner;
public class DevTest {
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String value;
        do {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();
        } while (!value.matches(regEx));
        return value;
    }

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String pattern = "[A-Za-z]{3,}";
        String userInput = getRegExString(pipe, "Enter a string that matches the pattern", pattern);
        System.out.println("You entered: " + userInput);
    }


}