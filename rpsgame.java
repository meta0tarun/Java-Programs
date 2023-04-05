import java.util.Scanner;
import java.util.Random;

public class rpsgame {
    public static void main(String[] args) {
        System.out.println("___Rock - Paper - Scissor___\n\n"); // Title of the game
        int pscores = 0; // variable to store player scores
        int cscores = 0; // variable to store computer scores
        int n = 0; // variable to operate while loop

        while (n <= 2) { // loop to play 3 rounds

            System.out.printf("Choose 1 - For rock\nChoose 2 - For paper\nChoose 3 - For scissor \n"); // instruction
                                                                                                       // for player
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt(); // variable to store player's choice
            Random rmd = new Random();
            int rand = rmd.nextInt(3); // generates random no.s 0,1 & 2. Considering 0 as rock, 1 as paper & 2 as
                                       // scissor for computer

            if (choice == 1) { // when player chooses rock
                if (rand == 0) {
                    System.out.println("Computer chose rock. \n Round Draw!");
                } else if (rand == 1) {
                    System.out.println("Computer chose paper. \n Round Lost!");
                    cscores++; // incrementing computer scores by 1
                } else if (rand == 2) {
                    System.out.println("Computer chose scissor. \n Round Won!");
                    pscores++; // incrementing player scores by 1
                }
            }

            else if (choice == 2) { // when player chooses paper
                if (rand == 0) {
                    System.out.println("Computer chose rock. \n Round Won!");
                    pscores++;
                } else if (rand == 1) {
                    System.out.println("Computer chose paper. \n Round Draw!");

                } else if (rand == 2) {
                    System.out.println("Computer chose scissor. \n Round Lost!");
                    cscores++;

                }
            }

            else if (choice == 3) { // when player chooses scissor
                if (rand == 0) {
                    System.out.println("Computer chose rock. \n Round Lost!");
                    cscores++;
                } else if (rand == 1) {
                    System.out.println("Computer chose paper. \n Round Won!");
                    pscores++;
                } else if (rand == 2) {
                    System.out.println("Computer chose scissor. \n Round Draw!");
                }
            } else { // when player enters any invalid value
                System.out.println("Inappropriate Value, Round Wasted!");
            }

            n++;// increments the n variable by 1 for loop

        }

        // Declaring the Match results
        System.out.printf("Player scores are : %d\n", pscores);
        System.out.printf("Computer scores are : %d\n", cscores);

        // Declaring the player's position
        if (cscores == pscores) {
            System.out.println("Match Draw!");
        }
        if (cscores < pscores) {
            System.out.println("Match Won!");
        }
        if (cscores > pscores) {
            System.out.println("Match Lost!");
        }

    }

}
