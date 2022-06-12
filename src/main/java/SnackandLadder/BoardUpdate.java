package SnackandLadder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@AllArgsConstructor
@Setter
@Getter
public class BoardUpdate {

   private HashMap<Integer,Integer>SnakeJump;
   private HashMap<Integer,Integer>LadderJump;

   public void update(Player player,int diceValue)
   {
       int expectvalue = player.getPostion()+diceValue;
      // System.out.println();
       if(expectvalue==100)
       {
          player.setWinner(true);
           return;
       }
       else if(expectvalue<100 && SnakeJump.containsKey(expectvalue))
       {
           player.setPostion(SnakeJump.get(expectvalue));

           System.out.println(player.getName() + "is Bitten by Snake at "+ expectvalue + " now moved to " + player.getPostion());
       }
       else if(expectvalue<100 && LadderJump.containsKey(expectvalue))
       {
           player.setPostion(LadderJump.get(expectvalue));

           System.out.println(player.getName() + " is jumped to " + expectvalue);
       }
       else if(expectvalue<100)
           player.setPostion(expectvalue);

       System.out.println(player.getName() + "is at " + player.getPostion());

   }


}
