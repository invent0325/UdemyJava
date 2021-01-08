public class durationString {
    public static void main(String[] args) {
        getDurationStrings(125, 30);

    }

    public static void getDurationStrings(int minutes, int seconds) {
        if(minutes >= 0) {
            if(seconds >= 0) {
               int totalSeconds = (minutes * 60) + seconds;
               int myHours = (totalSeconds/3600);
               int myMinutes = (totalSeconds-(myHours*3600))/60;
               int mySeconds = (totalSeconds-(myHours*3600) - (myMinutes * 60));

                System.out.println("Hours : " + myHours + " Minutes : " + myMinutes + " Seconds : " + mySeconds);
            } else {
                System.out.println("Incorrect seconds value");
            }
        }
        else {
            System.out.println("Incorrect minutes value");
        }
    }
}
