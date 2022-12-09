import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum of the sum number that you need:  ");
        int perfectNumber = scanner.nextInt();
        int sum = 0, digit;
        while (perfectNumber > 0) {
            digit = perfectNumber % 10;
            sum = sum + digit;
            perfectNumber = perfectNumber/10;
            }
        System.out.println(sum);

        }
    }

