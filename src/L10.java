import java.util.Scanner;

public class L10 {

    public static void main(String[]args){
       int userinput = 0;
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter factorial # :");
        userinput = keyboard.nextInt();
        //calculation
        int sum = 1;
        for(int i=1; i<=userinput; i++){
            sum = sum *i;

            System.out.println(sum);

        }


}

}


