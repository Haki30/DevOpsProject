import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum range for the random number: ");
        int maxRange = scanner.nextInt();

        int randomNumber = generateRandomNumber(maxRange);

        System.out.println("Random number between 1 and " + maxRange + ": " + randomNumber);

        scanner.close();
    }

    private static int generateRandomNumber(int maxRange) {
        Random random = new Random();
        return random.nextInt(maxRange) + 1; 
    }
}
