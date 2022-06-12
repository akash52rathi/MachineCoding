package SnackandLadder;

public class Dice {

    int rollDice()
    {
       double a = Math.random()* 6;
       return (int)(a+1);
    }
}
