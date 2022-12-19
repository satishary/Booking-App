package utilities;

public class Utilities {

    public static String otp(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int x = (int) (10 * Math.random());
            result.append( x);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String x = otp(6);
        System.out.println(x);
    }
}
