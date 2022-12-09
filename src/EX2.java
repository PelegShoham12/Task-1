import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, amountOfSeriesNumbers, diffNumber;
        System.out.println("Enter the first Number:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the dif between the numbers:");
        diffNumber = scanner.nextInt();
        System.out.println("Enter the amount of numbers in the series:");
        amountOfSeriesNumbers = scanner.nextInt();

        for (int i = 1; i <= amountOfSeriesNumbers; i++) {
            System.out.print((firstNumber + (i - 1) * diffNumber) + ", ");
        }
        if (amountOfSeriesNumbers < 0) {
            System.out.println("invalid series numbers");
        }
    }
}