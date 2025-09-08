import java.util.Random;
import java.util.Scanner;

public class Question9 {
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);
        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String getWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Tie";
        } else if (
            (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
            (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
            (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static void displayStats(int totalGames, int playerWins, int computerWins, int ties) {
        double playerWinPercentage = (double) playerWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

        System.out.println("-------------------------------------");
        System.out.println("Final Game Stats");
        System.out.println("-------------------------------------");
        System.out.println("Total Games: " + totalGames);
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);
        System.out.println("-------------------------------------");
        System.out.printf("Player Win Percentage: %.2f%%\n", playerWinPercentage);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercentage);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int i = 1; i <= totalGames; i++) {
            System.out.println("\nGame " + i + ":");
            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String playerChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();

            System.out.println("Player chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);

            String winner = getWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) {
                System.out.println("You win!");
                playerWins++;
            } else if (winner.equals("Computer")) {
                System.out.println("Computer wins!");
                computerWins++;
            } else {
                System.out.println("It's a tie!");
                ties++;
            }
        }
        scanner.close();
        displayStats(totalGames, playerWins, computerWins, ties);
    }
}
