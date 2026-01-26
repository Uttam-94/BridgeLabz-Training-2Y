package level4;

import java.util.Random;
import java.util.Scanner;

public class Q9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        int games = sc.nextInt(); // number of games

        for (int i = 1; i <= games; i++) {
            int playerChoice = sc.nextInt(); // 1=Rock, 2=Paper, 3=Scissors
            int computerChoice = rand.nextInt(3) + 1;

            if (playerChoice == computerChoice) {
                draws++;
            } else if (
                    (playerChoice == 1 && computerChoice == 3) ||
                    (playerChoice == 2 && computerChoice == 1) ||
                    (playerChoice == 3 && computerChoice == 2)
            ) {
                playerWins++;
            } else {
                computerWins++;
            }
        }

        double playerWinPercent = (playerWins * 100.0) / games;
        double computerWinPercent = (computerWins * 100.0) / games;

        System.out.println("Result Table");
        System.out.println("-----------------------");
        System.out.println("Player Wins   : " + playerWins);
        System.out.println("Computer Wins : " + computerWins);
        System.out.println("Draws         : " + draws);
        System.out.println("-----------------------");
        System.out.println("Player Win %   : " + playerWinPercent);
        System.out.println("Computer Win % : " + computerWinPercent);

        sc.close();
    }
}
