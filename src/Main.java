import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List players = new ArrayList();
        for (int playerNumber = 1; playerNumber < 6; playerNumber++) {
            players.add(playerNumber);
        }
        game(players);
        System.out.println("The winner is player "+players.get(0));


    }

    public static List game(List players) {
        int startingPoint = 0;
        while (players.size() != 1) {
            ArrayList tinkerTailor = new ArrayList() {};
            while (tinkerTailor.size() < 8 + startingPoint) {
                for (int player = 0; player < players.size(); player++) {
                    tinkerTailor.add(players.get(player));
                }
            }
            for (int player = 0; player < players.size(); player++) {
                if (players.get(player) == tinkerTailor.get(7 + startingPoint)){
                    System.out.println("Player "+players.get(player)+" is knocked out");
                    players.remove(player);
                    startingPoint = 7 - player;
                    break;
                }
            }
        }
        return players;
    }
}
