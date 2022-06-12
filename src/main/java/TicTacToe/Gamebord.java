package TicTacToe;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Gamebord {

    char [ ][] board;
    boolean firstplayer;
    boolean gameover;


    Scanner input;
    public Gamebord() {
        board = new char[][]{{'.','.','.'},
                {'.','.','.'},
                {'.','.','.'}
        };
        firstplayer =true;
        gameover = false;
        input = new Scanner(System.in);
    }

    public void start(Queue<Player> listPlayer)
    {

        while (!gameover)
        {
            print();
           Player current= listPlayer.peek();
            System.out.println(current.getName() + " Turn.  Enter Input");
            int x = input.nextInt();
            if(chechValid(x))
            {
                update(x,current);
                if(!gameover)
                {
                    listPlayer.remove();
                    listPlayer.add(current);
                }
                else
                {
                    System.out.println(current.getName() + " is winner");
                    print();
                    break;
                }
            }
            else {
                System.out.println("Move is invalid. Try Again");
            }

        }

    }

    public  boolean chechValid(int x)
    {
        int row = (x-1)/3;
        int col=(x-1)%3;
        if(x<=9 && board[row][col]=='.')
            return  true;
        else  return  false;
    }

    public void update(int x,Player player)
    {
        char sym = player.getSym();

        int row = (x-1)/3;
        int col=(x-1)%3;
        board[row][col]=sym;

        if(checkifWinner(sym))
        {
            gameover=true;
        }

    }

    public boolean checkifWinner(char sym)
    {
        boolean ans = true;
        boolean returnans= false;
        int i;
        for(i=0;i<3;i++)
        {
            if(board[0][i]!=sym)
            {ans= false;break;
            }
        }
        if(i==3)
            return  true;


        for( i=0;i<3;i++)
        {
            if(board[1][i]!=sym)
            {ans= false;break;
            }
        }
        if(i==3)
            return  true;

        for( i=0;i<3;i++)
        {
            if(board[2][i]!=sym)
            {ans= false;break;
            }
        }
        if(i==3)
            return  true;

        for( i=0;i<3;i++)
        {
            if(board[i][0]!=sym)
            {ans= false;break;
            }
        }
        if(i==3)
            return  true;


        for( i=0;i<3;i++)
        {
            if(board[i][1]!=sym)
            {ans= false;break;
            }
        }

        if(i==3)
            return  true;


        for( i=0;i<3;i++)
        {
            if(board[i][2]!=sym)
            {ans= false;break;
            }
        }
        if(i==3)
            return  true;

         i=0;
        for( int j=0;i<3;i++,j++)
        {
            if(board[i][j]!=sym)
            {
                ans = false;
                break;
            }

        }

        if(i==3)
            return  true;

          i=0;
        for(int j=2;i<3;i++,j--)
        {
            if(board[i][j]!=sym)
            {
                ans = false;
                break;
            }

        }

        if(i==3)
            return  true;



        return  ans;
    }

    public  void print()
    {
        //System.out.println(board.toString());

        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
        System.out.println("\n");

    }


}
