package com.JavaGame;



public class Score {
    private static int score = 0;

    public static void resetScore(){
        score = 0;
    }

    public static void increaseScore(int inc){
        score += inc;
    }

    public static int getScore(){
        return score;
    }
}
