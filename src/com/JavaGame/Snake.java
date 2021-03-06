package com.JavaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 */
public class Snake<E> extends ArrayList<BodyPart> {

    /**
     *
     */
    public static final String DOWN = "Down";
    /**
     *
     */
    public static final String TOP = "Up";
    /**
     *
     */
    public static final String LEFT = "Left";
    /**
     *
     */
    public static final String RIGHT = "Right";

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private int tailX;
    /**
     *
     */
    private int tailY;
    /**
     *
     */
    private boolean alive;

    /**
     *
     */
    private static final Snake instance = new Snake();

    /**
     *
     */
    public Snake() {
        setAlive(true);
    }

    /**
     *
     * @return boolean about suicide
     */
    public boolean checkSnakeSuicide() {

        int headX = this.get(this.size() - 1).getxCoor();
        int headY = this.get(this.size() - 1).getyCoor();
        for (int i = 0; i < this.size() - 1; i++) {

            if (this.get(i).getxCoor() == headX
                    && this.get(i).getyCoor() == headY) {
                return true;
            }

        }
        return false;
    }

    /**
     *
     * @param leftLimit - border
     * @param rightLimit - border
     * @param topLimit - border
     * @param downLimit - border
     * @return integers of borders
     */
    public boolean checkCrashWithWall(int leftLimit, int rightLimit,
                                      int topLimit, int downLimit) {

        int headX = this.get(this.size() - 1).getxCoor();
        int headY = this.get(this.size() - 1).getyCoor();
        return headX < leftLimit || headX > rightLimit || headY < topLimit
                || headY > downLimit;
    }

    /**
     *
     * @param g - graphics
     */
    public void draw(Graphics g) {
        Color color = Color.GREEN;
        if(alive == false){
            color = Color.WHITE;
        }

        for (int i = 0; i < this.size(); i++) {
            if (i == this.size() - 1) {
                this.get(i).drawHead(g, color);
            } else {
                this.get(i).draw(g, color);
            }
        }

    }


    /**
     *
     * @param direction - direction of moving
     */
    public void snakeGo(String direction) {
        tailX = this.get(0).getxCoor();
        tailY = this.get(0).getyCoor();

        for (int i = 0; i < this.size() - 1; i++) {

            this.get(i).setxCoor(this.get(i + 1).getxCoor());
            this.get(i).setyCoor(this.get(i + 1).getyCoor());

        }

        goForSnakeHead(direction);

    }

    /**
     *
     * @param xCoor - x coord
     * @param yCoor - y coord
     * @return boolean about snake coords
     */
    public boolean snakeHasCoord(int xCoor, int yCoor) {

        for (int i = 0; i < this.size(); i++) {

            if (this.get(i).getxCoor() == xCoor
                    && this.get(i).getyCoor() == yCoor) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param SIZE_CELL - size of tail
     */
    public void addElementToTail(int SIZE_CELL) {

        this.add(0, new BodyPart(tailX, tailY, SIZE_CELL));

    }


    /**
     *
     * @param direction - direction of snake's head
     */
    private void goForSnakeHead(String direction) {

        BodyPart head = this.get(this.size() - 1);
        if (direction == DOWN) {
            head.setyCoor(head.getyCoor() + 1);

        } else if (direction == TOP) {
            head.setyCoor(head.getyCoor() - 1);

        } else if (direction == RIGHT) {
            head.setxCoor(head.getxCoor() + 1);

        } else if (direction == LEFT) {
            head.setxCoor(head.getxCoor() - 1);

        }

    }

    /**
     *
     * @return - boolean if snake lives yet
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     *
     * @param alive - boolean if snake lives yet
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     *
     * @return snake
     */
    public static Snake getInstanceSnake() {
        return instance;
    }

}

