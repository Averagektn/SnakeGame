package com.JavaGame;


/**this class count score, reset it when
 *snake.alive = false and display the score
 * in the left-up corner
 * **/



public class Score {
    private static int score = 0;
    private static int lastScore;
    //private static boolean alive = true;

    public static void resetScore() {
        score = 0;
    }

    public static void increaseScore(int inc) {
        score += inc;
    }

    public static int getScore() {
        return score;
    }

    /**public static void saveScore(int score) {
        lastScore = score;
    }**/
}

