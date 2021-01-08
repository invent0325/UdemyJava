import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dogBarking {

    public static void main(String[] args) {
        shouldWakeUp(false);
    }

    public static void shouldWakeUp(boolean barking) {
        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        int hourOfDay = Calendar.HOUR_OF_DAY;

        if(barking) {
            System.out.println("Dog Barking");
        } else {
            System.out.println("Dog Sleeping");
        }
            System.out.println("Its " + hourOfDay + " o'clock");
    }
}
