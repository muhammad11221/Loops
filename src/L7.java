import java.util.Scanner;

public class L7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num;
        num = keyboard.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
          sum = sum +i;
          System.out.println(sum);
        }
    }
}