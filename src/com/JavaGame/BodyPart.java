package com.JavaGame;

import java.awt.Color;
import java.awt.Graphics;

/**
 * part of snake
 */
public class BodyPart {

    /**
     *
     */
    private int xCoor, yCoor, width, height;
    /**
     *
     * @param xCoor - x coord
     * @param yCoor - y coord
     * @param tileSize - size of tile
     */
    public BodyPart(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }

    /**
     *
     * @param g - graphics
     * @param color - color of body
     */
    public void draw(Graphics g, Color color) {

        g.setColor(Color.BLACK);
        g.fillRect(GameScreen.OFFSET + xCoor * width, GameScreen.OFFSET + yCoor * height, width, height);
        g.setColor(color);
        g.fillRect(GameScreen.OFFSET + xCoor * width + 2, GameScreen.OFFSET + yCoor * height + 2, width - 4, height - 4);

    }

    /**
     *
     * @param g - graphics
     * @param color - color of body
     */
    public void drawHead(Graphics g, Color color) {

        g.setColor(Color.BLACK);
        g.fillRect(GameScreen.OFFSET + xCoor * width, GameScreen.OFFSET + yCoor
                * height, width, height);
        g.setColor(color);
        g.fillRect(GameScreen.OFFSET + xCoor * width + 1, GameScreen.OFFSET
                + yCoor * height + 1, width - 2, height - 2);

    }

    /**
     *
     * @return coor
     */
    public int getxCoor() {
        return xCoor;
    }

    /**
     *
     * @param xCoor - x coor
     */
    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    /**
     *
     * @return coor
     */
    public int getyCoor() {
        return yCoor;
    }

    /**
     *
     * @param yCoor - y coor
     */
    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

}

