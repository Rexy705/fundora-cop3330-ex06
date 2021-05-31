import java.util.Calendar;
import java.util.Date;

public class DateGetYear {
    public static void main (String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        int dateYear = calendar.get(Calendar.YEAR);
        System.out.println(dateYear);
    }
}