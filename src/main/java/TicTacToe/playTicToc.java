package TicTacToe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class playTicToc {

    public static void main(String[] args) {

        Player p1 = new Player("ALbert",1,'X');
        Player p2= new Player("Mike",2,'O');
        Queue<Player> listPlayer = new LinkedList<>();
        listPlayer.add(p1);
        listPlayer.add(p2);
        Gamebord gb = new Gamebord();
        gb.start(listPlayer);

    }
}
