package com.JavaGame;


/**this class count score, reset it when
 *snake.alive = false and display the score
 * in the left-up corner
 * **/



public class Score {
    /**
     *
     */
    private static int score = 0;
    /**
     *
     */
    private static int lastScore;
    /**
     *
     */
    private static final Score instanceScore = new Score();

    /**
     *
     */
    public static void resetScore() {

        score = 0;
    }

    /**
     *
     * @param inc - increase number
     */
    public static void increaseScore(int inc) {

        score += inc;
    }

    /**
     *
     * @return score number
     */
    public static int getScore() {

        return score;
    }


    /**
     *
     * @return aboba
     */
    public static Score getInstanceScore() {
        return instanceScore;
    }

}


