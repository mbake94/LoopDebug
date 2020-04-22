import java.util.Scanner;

public class LoopDebug {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        String userInput = "a";

        while (!userInput.equals("no")) {
            System.out.print("What's up? ");
            userInput = keyboard.nextLine();

            System.out.println(userInput);
            System.out.print("Would you like to enter another input? ");
            userInput = keyboard.nextLine();
        }
    }
}
