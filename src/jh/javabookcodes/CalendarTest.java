package jh.javabookcodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar myCalendar = Calendar.getInstance();

        myCalendar.set(Calendar.YEAR, 2000);
        myCalendar.set(Calendar.MONTH, 9);
        myCalendar.set(Calendar.DAY_OF_MONTH, 30);
        myCalendar.set(Calendar.HOUR_OF_DAY, 11);
        myCalendar.set(Calendar.MINUTE, 2);
        myCalendar.set(Calendar.SECOND, 3);

        //출력 형식 생성

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:DD HH:mm:ss");
        DateFormat df = DateFormat.getDateTimeInstance();
        Date date = myCalendar.getTime();

        //날짜 출력
        System.out.println(sdf.format(date));
        System.out.println(df.format(date));
    }
}
