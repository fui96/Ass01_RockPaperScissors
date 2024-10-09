import java.util.Locale;
import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String Bad = "";
        String PlayerA = "";
        String PlayerB = "";
        String Input;
        boolean valid = false;
        boolean Cont = true;

        do {
            //PlayerA Input Check
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
            //PlayerB Input Check
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

            Boolean Winner = false;
            //Winner Determination
            do {
                int MoveA = 0;
                int MoveB = 0;
                int MoveSum;
                //PlayerA Value Assignment
                if (PlayerA.equalsIgnoreCase("R")) {
                    MoveA = 7;
                } else if (PlayerA.equalsIgnoreCase("P")) {
                    MoveA = 4;
                } else if (PlayerB.equalsIgnoreCase("S")) {
                    MoveA = 2;
                }
                //PlayerB Value Assignment
                if (PlayerB.equalsIgnoreCase("R")) {
                    MoveB = -7;
                } else if (PlayerB.equalsIgnoreCase("P")) {
                    MoveB = -4;
                } else if (PlayerA.equalsIgnoreCase("S")) {
                    MoveA = -2;
                }
                MoveSum = MoveA + MoveB;
                //Tie Game Cases
                if (MoveA == 7 && MoveB == -7) {
                    System.out.println("Rock Vs Rock, Its a tie game!");
                    Winner = true;
                } else if (MoveA == 4 && MoveB == -4) {
                    System.out.println("Paper Vs Paper, Its a tie game!");
                    Winner = true;
                } else if (MoveA == 2 && MoveB == -2) {
                    System.out.println("Scissors Vs Scissors, Its a tie game!");
                    Winner = true;
                }
                //Other Cases
                if (MoveSum == 5) {
                    System.out.println("Rock Beats Scissors, Congratulations PlayerB!");
                    Winner = true;
                } else if (MoveSum == 3) {
                    System.out.println("Paper beats Rock, Congratulations PlayerB!");
                    Winner = true;
                } else if (MoveSum == 2) {
                    System.out.println("Scissors beats Paper, Congratulations PlayerB!");
                    Winner = true;
                } else if (MoveSum == -2) {
                    System.out.println("Scissors beats Paper, Congratulations PlayerA!");
                    Winner = true;
                } else if (MoveSum == -3) {
                    System.out.println("Paper beats Rock, Congratulations PlayerA!");
                    Winner = true;
                } else if (MoveSum == -5) {
                    System.out.println("Rock beats Scissors, Congratulations PlayerA!");
                    Winner = true;
                }
            }while (!Winner);
            //Restart Loop
            System.out.println("Would you like to play again? [y/n]");
            if(input.nextLine().equalsIgnoreCase("y")) {
                Cont = true;
            }
            else{
                Cont = false;
            }


        }while(Cont);
    }

}