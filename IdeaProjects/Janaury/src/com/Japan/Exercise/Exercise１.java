package com.Japan.Exercise;

class Game
{
    protected int player;
    protected int gun;
    public Game()
    {
        player = 100;
         gun = 1;
        System.out.println("Created the Game");
    }
}
public class Exercise１
{
    public static void main(String[] args) {

       Game Pubg = new Game();
       Game Pokemon = new Game();

       Game KnivesOut;
       KnivesOut = Pubg;

        boolean b1 = Pubg.equals(KnivesOut);

        boolean b2 = Pubg.equals(Pokemon);

        System.out.println("when compare between Pubg and KnivesOut "+""+b1);

        System.out.println("when compare between Pubg and Pokemon "+""+b2);
    }
}
