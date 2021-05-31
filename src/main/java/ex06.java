import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ex06 {

    public static void main (String[] args) {
        Scanner input1 = new Scanner(System.in),
                input2 = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String s1 = input1.next();
        System.out.print("At what age would you like to retire? ");
        String s2 = input2.next();

        int age = Integer.parseInt(s1);
        int retire = Integer.parseInt(s2);

        // Accessing system time.
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dateYear = calendar.get(Calendar.YEAR);

        System.out.println("You have " + (retire - age) + " years left until you can retire.");
        System.out.println("It's " + dateYear + ", so you can retire in " +
                           ((retire - age) + dateYear) + ".");
    }
}


