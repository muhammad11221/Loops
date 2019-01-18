import java.util.Random;
import java.util.Scanner;

public class L9 {
public static void main(String[] args){
        int guess = 0;
        int x = -1;


        Random ty= new Random();
        x = 1 + ty.nextInt(10);



        System.out.println("I have a number between 1 and 10. Take a guess!");

        Scanner keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();


        while(guess!=x){
        System.out.println("Your guess: " + guess);
        System.out.println("That is incorrect. Guess again.");
        guess = keyboard.nextInt();
        }
        System.out.println("Your guess: " + guess);
        System.out.println("That is correct! You guessed my number.");
        }
        }
