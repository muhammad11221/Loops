import java.util.Scanner;

public class L5 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner (System.in);
        System.out.println(" Enter the #: ");
        int num;
        num = keyboard.nextInt();

        for (int i= num; i>=1; i--){

            System.out.println(i);
        }
    }
}
