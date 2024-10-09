import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String Bad = "";
        String PlayerA = "";
        String PlayerB = "";
        String Input;
        boolean valid = false;
        do {
            System.out.println("PlayerA please enter your move. [R/P/S]");
            Input = input.next();
            if (Input.equalsIgnoreCase("R")) {
                PlayerA = input.nextLine();
                System.out.println("PlayerA you have chosen Rock");
                valid = true;

            } else if (Input.equalsIgnoreCase("P")) {
                PlayerA = input.nextLine();
                System.out.println("PlayerA you have chosen Paper");
                valid = true;
            } else if (Input.equalsIgnoreCase("S")) {
                PlayerA = input.nextLine();
                System.out.println("PlayerA you have chosen Scissors");
                valid = true;
            } else {
                Bad = Input;
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid move.");
            }
        } while (!valid);
        valid = false;
        Input = "";
        do {
            System.out.println("PlayerB please enter your move. [R/P/S]");
            Input = input.next();
            if (Input.equalsIgnoreCase("R")) {
                PlayerB = input.nextLine();
                System.out.println("PlayerB you have chosen Rock");
                valid = true;

            } else if (Input.equalsIgnoreCase("P")) {
                PlayerB = input.nextLine();
                System.out.println("PlayerB you have chosen Paper");
                valid = true;
            } else if (Input.equalsIgnoreCase("S")) {
                PlayerB = input.nextLine();
                System.out.println("PlayerB you have chosen Scissors");
                valid = true;
            } else {
                Bad = Input;
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid move.");
            }

        } while (!valid);
    }
}