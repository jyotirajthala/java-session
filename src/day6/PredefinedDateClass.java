package day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class PredefinedDateClass {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 1996);
        dateOfBirth.set(Calendar.MONTH, 10); //Month will be -1 on output, For sept(09) we need to put 10 as a month
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 25);
//        System.out.println(dateOfBirth);

        System.out.println("My Birthday is in --> " + Month.of(dateOfBirth.get(Calendar.MONTH)).name() + " " + dateOfBirth.get(Calendar.DATE) + " " + dateOfBirth.get(Calendar.YEAR));


        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss");
        System.out.println("My Birthday is in --> " + sdf.format(dateOfBirth.getTime()));

    }
}
