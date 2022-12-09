import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number that bigger than 3: " );
        int  number = scanner.nextInt();
        int halfSpace;
        while (number < 3 || number%2 ==0) {
            System.out.println("Please ,Enter an odd number that bigger than 3 :  ");
            number = scanner.nextInt();
        }
         for (int numberOfAsterisks =1; numberOfAsterisks <= number; numberOfAsterisks+=2 ) {
             halfSpace = ( number -numberOfAsterisks )/2;
             for (int i =0 ; i < halfSpace; i++)
                 System.out.print(" ");
             for (int j = 0; j < numberOfAsterisks; j++)
                 System.out.print("*");
             System.out.println();

         }  for (int descendingOfAsterisks =number - 2 ; descendingOfAsterisks >= 1; descendingOfAsterisks-=2 ) {
            halfSpace = ( number -descendingOfAsterisks )/2;
            for (int i =0 ; i < halfSpace; i++)
                System.out.print(" ");
            for (int j = 0; j < descendingOfAsterisks; j++)
                System.out.print("*");
            System.out.println();

        }

    }
}