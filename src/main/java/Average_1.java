import java.util.Scanner;

public class Average_1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Input number 1");
        int number1 = numbers.nextInt();
        System.out.println("Input number 2");
        int number2 = numbers.nextInt();
        System.out.println("An average of your numbers: "+(number2+number1)/2);
    }
}
