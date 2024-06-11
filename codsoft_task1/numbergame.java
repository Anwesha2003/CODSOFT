import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1; 
        int userGuess;
        int numofAttempts = 0;
        int maxattempts=5;
        System.out.println("Welcome to the number guessing game!");

        do {
            System.out.println("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            numofAttempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the  correct number in " + numofAttempts + " attempts.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Please Try again.");
            } else {
                System.out.println("Your guess is too low. Please Try again.");
            }
            if (numofAttempts == maxattempts) {
               System.out.println("The maximum number of attempts  has been reached. The correct number was "+ randomNumber); 
               break;
            }
        } while (userGuess != randomNumber);

        System.out.println("Well played.");
        
        scanner.close();
    }
}
