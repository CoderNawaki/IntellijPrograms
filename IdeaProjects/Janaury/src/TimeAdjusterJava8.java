import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeAdjusterJava8 {
    public static void main(String[] args) {
        TimeAdjusterJava8 timeAdjusterJava8 = new TimeAdjusterJava8();
        timeAdjusterJava8.testAdjusters();
    }
    public void testAdjusters(){
        //Get the current date;
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date:"+date1);
        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next tuesday on:"+nextTuesday);

        //get the second saturday of next month;
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(),1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second saturday on :"+secondSaturday);
    }
}
