import java.util.Scanner;

public class EX7 {

    public static boolean isNarcissistNumber(int number) {
        int numberReplica = number, sumOfNumberDigits = 0, numberOfDigits = 0;
        numberOfDigits = getNumberOfDigits(number);
        while (number > 0) {
            sumOfNumberDigits += Math.pow((number % 10), numberOfDigits);
            number /= 10;
        }
        if (numberReplica == sumOfNumberDigits)
            return true;
        else
            return false;
    }

    public static int getNumberOfDigits(int number) {
        int numberOfDigits = 0;
        while (number > 0) {
            number /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;

    }

    public static void main(String[] args) {
        int numberRun = 1;
        while (numberRun < 1000) {
            if (isNarcissistNumber(numberRun) == true) {
                System.out.print(numberRun + " ");
            }
            numberRun++;
        }

    }
}














