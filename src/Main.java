import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List players = makePlayerList(5);
        game(players ,3);
        System.out.println("The winner is player "+players.get(0));


    }

    private static List makePlayerList(int numOfPlayers) {
        List players = new ArrayList();
        for (int playerNumber = 1; playerNumber < numOfPlayers + 1; playerNumber++) {
            players.add(playerNumber);
        }
        return players;
    }

    public static List game(List players, int knockoutNumber) {
        int startingPoint = 0;
        while (players.size() != 1) {
            ArrayList tinkerTailor = new ArrayList() {};
            while (tinkerTailor.size() < knockoutNumber + startingPoint) {
                for (int player = 0; player < players.size(); player++) {
                    tinkerTailor.add(players.get(player));
                }
            }
            for (int player = 0; player < players.size(); player++) {
                if (players.get(player) == tinkerTailor.get(knockoutNumber + startingPoint - 1)){
                    System.out.println("Player "+players.get(player)+" is knocked out");
                    players.remove(player);
                    startingPoint = player;
                    break;
                }
            }
        }
        return players;
    }
}
