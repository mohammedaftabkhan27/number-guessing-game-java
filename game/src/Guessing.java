import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxAttempt = 0;

        System.out.println("Welcome To The Guessing Game !");

        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        while (true) {

            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: maxAttempt = 10;
                break;
                case 2: maxAttempt = 5;
                break;
                case 3: maxAttempt = 3;
                break;
                default:System.out.println("Invalid Choice !");
                continue;
            }
            break;
        }
        Random random = new Random();
        int secretnumber = random.nextInt(100)+1;
        boolean won = false;

        for(int attempt = 1;attempt<=maxAttempt;attempt++){
            System.out.print("Enter Your Guess :");
            int guess = sc.nextInt();

            if(guess==secretnumber){
                System.out.println("Congratulations ! You have guessed the correct number in "+ attempt + " attempts");
                won = true;
                break;
            } else if (guess < secretnumber) {
                System.out.println("Incorrect Number is greater than "+ guess+".");
            }else {
                System.out.println("Incorrect Number is less than "+ guess+".");
            }
        }

        if(!won){
            System.out.println("Sorry you have used all attempts. The correct Number is "+secretnumber + ".");
        }
    }
}