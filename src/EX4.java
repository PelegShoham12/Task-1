import java.util.Scanner;

public class EX4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of prime numbers : ");
        int amount = scanner.nextInt();
        int count = 0;
        int currentNumber = 2;
        while (count < amount){
            boolean isNotPrime = false;
            int half = currentNumber/2;
            for (int j=2 ; j<=half ; j++){
                if(currentNumber % j == 0 ){
                    isNotPrime=true;
                    break;
                }
            }
            if (isNotPrime == false){
                System.out.print(currentNumber + ",");
                count++;
            }
            currentNumber++;

        }



        }

    }

