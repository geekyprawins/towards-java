public class TimeConverter {
public static final String Invalid_Value_Message = "Invalid input bruhhhh";
    public static void main(String[] args) {
        String time = getDurationString(121, 30);
        System.out.println(time);
        time = getDurationString(7290);
        System.out.println(time);
        System.out.println(getDurationString(-10));
        System.out.println(getDurationString(9,5));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return Invalid_Value_Message;

        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds;
        String hrsString = hours + "h";
        String minsString = remainingMinutes+ "m";
        String secsString = remainingSeconds  + "s";
        if (hours< 10)
            hrsString = "0" + hrsString;
        if (remainingMinutes< 10)
            minsString = "0" + minsString;
        if (remainingSeconds < 10)
            secsString = "0" + secsString;


        return (hrsString + " " + minsString + " " + secsString);

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return Invalid_Value_Message;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }


}
