package utilDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class useDate {
    static void main() {

//        Random rand = new Random();
//
//        Date d1 = new Date(Math.abs(rand.nextInt()));
//        Date d2 = new Date(Math.abs(rand.nextInt()));
//
//        if (d1.before(d2)) {
//            IO.println(d1 + " is before " + d2);
//        } else if (d1.after(d2)) {
//            IO.println(d1 + " is after " + d2);
//        } else {
//            IO.println("Same date.");
//        }

        Date date;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse("2000-11-11");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + 10);

        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy年MM月dd日");

        IO.println(outputFormat.format(calendar.getTime()));
    }
}
