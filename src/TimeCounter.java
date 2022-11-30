import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;

public class TimeCounter {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate startDay = LocalDate.of(2022, Month.FEBRUARY, 24);

        System.out.println(DAYS.between(startDay, today));


    }
}