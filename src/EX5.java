import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int randomNum = scanner.nextInt();
        int num1 = 0, num2 = 1, sumOfNumber;

        boolean isFound = false;
        while (randomNum >= num1) {
            if (randomNum == num1)
                isFound = true;
            sumOfNumber = num1 + num2;
            num1 = num2;
            num2 = sumOfNumber;
        }
        if (isFound == true) {
            System.out.println("the number is exist in fibonacci series");
        } else
            System.out.println("The number is not part of fibonacci series");
    }
}
