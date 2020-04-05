import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Java8DateTimeChronoUnitEnum {
    public static void main(String[] args) {
        Java8DateTimeChronoUnitEnum java8DateTimeChronoUnitEnum = new Java8DateTimeChronoUnitEnum();
        java8DateTimeChronoUnitEnum.testChromoUnits();
    }
    public void testChromoUnits(){
        //get the current date
        LocalDate today= LocalDate.now();
        System.out.println("current date:"+today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week:"+nextWeek);
        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1,ChronoUnit.MONTHS);
        System.out.println("next Month"+nextMonth);

        //add 1 year to the current date
        LocalDate nextYear=today.plus(1,ChronoUnit.YEARS);
        System.out.println("next year:"+nextYear);
        //add 10 year to the current date
        LocalDate nextDecade = today.plus(1,ChronoUnit.DECADES);
        System.out.println("date after ten year:"+nextDecade);
    }
}
