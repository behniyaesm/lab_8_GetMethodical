import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = SafeInput.getRangedInt(sc,"Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(sc,"Enter your birth month", 1, 12);
        int day = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = SafeInput.getRangedInt(sc,"Enter your birth day", 1, 31);
                break;
            case 2: //if the user inputs 2 for month (February)
                day = SafeInput.getRangedInt(sc,"Enter your birth day", 1, 29);
                break;
            case 4: case 6: case 9: case 11:
                day = SafeInput.getRangedInt(sc,"Enter your birth day", 1, 30);
                break;
        }
        int hour = SafeInput.getRangedInt(sc,"Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(sc,"Enter your birth minute", 1, 59);

        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);


    }
}
