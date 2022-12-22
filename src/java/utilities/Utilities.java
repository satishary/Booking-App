package utilities;

public class Utilities {

    static final int totalminutes = 24 * 60;

    private static String pad(int n) {
        if (n < 10) {
            return "0" + n;
        }
        return "" + n;
    }

    public static String toHourAndMinutes(int totalminutes) {
        totalminutes = totalminutes % Utilities.totalminutes;
        int hours = totalminutes / 60;
        int minutes = totalminutes % 60;
        String ampm = "AM";
        if (hours == 12) {
            ampm = "PM";
        } else if (hours > 12) {
            ampm = "PM";
            hours -= 12;
        }

        return String.format("%s:%s %s", pad(hours), pad(minutes), ampm);
    }

    public static int toMinutes(int hour, int minutes) {
        return (hour * 60 + minutes) % totalminutes;
    }

    public static String otp(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int x = (int) (10 * Math.random());
            result.append(x);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        for (int minutes = 0; minutes <= 24 * 60; minutes += 35) {
            System.out.println(toHourAndMinutes(minutes));
        }
    }
}
