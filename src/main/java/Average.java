import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers you'd like to enter?");
        int arrSize = keyboard.nextInt();
        //System.out.println("Enter "+arrSize+" numbers");
        double [] values = new double[arrSize];
        for (int i=1;i<=values.length; i++){
            System.out.println("Enter number "+i);
            values[i-1]=keyboard.nextDouble();
        }
        double sum =0;
        for (int j=0; j<(values.length); j++){
            sum=sum+values[j];
        }
        System.out.println("An average of your numbers: "+sum/arrSize);
    }
}
