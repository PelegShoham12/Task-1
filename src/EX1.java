import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameter a: ");
        double a = scanner.nextInt();
        System.out.println("Enter parameter b: ");
        double b = scanner.nextInt();
        System.out.println("Enter parameter c: ");
        double c = scanner.nextInt();

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No found solution for this discriminant: ");
        } else if (discriminant == 0) {
            System.out.println("A unique solution is found for this discriminant : " + -b / (2*a));
        } else {
            System.out.println("2 solution were found for this discriminant:  ");
            System.out.println((-b - Math.sqrt(discriminant))/(2 *a)  );
            System.out.println((-b + Math.sqrt(discriminant))/(2 *a)  );

        }


    }
}

