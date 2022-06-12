package SnackandLadder;

import java.util.HashMap;

public class PlaySnakeandLadder {

    public static void main(String[] args) {

        Player First = new Player("Albert",1,0,false);
        Player Second = new Player("Mike",2,0,false);
        Dice dice = new Dice();

        System.out.println(dice.rollDice());

        HashMap<Integer,Integer>snakeJump = new HashMap<>();
        HashMap<Integer,Integer>LadderJump = new HashMap<>();
        snakeJump.put(25,8);
        snakeJump.put(51,15);
        snakeJump.put(97,23);
        snakeJump.put(63,5);
        LadderJump.put(7,42);
        LadderJump.put(29,65);
        LadderJump.put(57,82);
        LadderJump.put(21,53);
        LadderJump.put(77,91);

        BoardUpdate board = new BoardUpdate(snakeJump,LadderJump);
        Player Winner = new Player();

        Boolean firstturn = true;
        int startFirst=0;
        int startSecond=0;
        boolean winner = false;

        while(!winner)
        {
            int dicvalue= dice.rollDice();

           System.out.println(dicvalue);

            if(firstturn) {
                board.update(First,dicvalue);
                if(First.isWinner())
                {
                    Winner = First;
                    break;
                }
                else if(dicvalue!=6)
                    firstturn= false;
            }

            else if(!firstturn) {
                board.update(Second,dicvalue);
                if(Second.isWinner())
                {
                    Winner = Second;
                    break;
                }
                else if(dicvalue!=6)
                    firstturn= true;
            }


        }

        String ans = Winner.getName();
        System.out.println("Winner is" + ans);




    }

}
