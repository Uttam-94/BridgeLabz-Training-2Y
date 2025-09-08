import java.util.Scanner;

public class Question10 {

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers) {
        if (deck.length % numPlayers != 0) {
            System.out.println("Cannot distribute cards evenly. Please choose a different number of players.");
            return null;
        }
        int cardsPerPlayer = deck.length / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        for (int i = 0; i < deck.length; i++) {
            players[i % numPlayers][i / numPlayers] = deck[i];
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " has:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.close();

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);
        String[][] players = distributeCards(deck, numPlayers);
        printPlayersCards(players);
    }
}