import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(sc,"Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$"); // 3 nums - 2 nums - 4 nums
        String mNum = SafeInput.getRegExString(sc,"Enter your M number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(sc,"Enter menu choice", "^[OoSsVvQq]$");

        System.out.println("Your Social Security Number is: " + ssn);
        System.out.println("Your UC M Number is: " + mNum);
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
