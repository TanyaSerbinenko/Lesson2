import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        double sum = Double.parseDouble(args[0]);
        int percent = Integer.parseInt(args[1]);
        int durationInYears = Integer.parseInt(args[2]);

        double result = 0;
        for (int i=1; i<=durationInYears; i++) {
            result = Math.pow(1 + (percent / 1200.0), i * 12) * sum;
            System.out.println(String.format("%(.2f", result));
        }
    }
}
