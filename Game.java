import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int a = 1;
        int b = 100;
        int scrtNumber = random.nextInt(b- a+ 1) + a;
        int c = 0;
        while (true) {
            System.out.print("Welcome to the number game \n enter the guess number between 1 to 100"+"=");
            int userGuess = sc.nextInt();
            c++;

            if (userGuess < a || userGuess > b) {
                System.out.println("Please guess a number within the specified range Thank you ");
            } else if (userGuess < scrtNumber) {
                System.out.println("Try greater number.");
            } else if (userGuess > scrtNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("congratulation the number on  " + c + " attempts");
                break;
            }
        }

        sc.close();
    }
}
