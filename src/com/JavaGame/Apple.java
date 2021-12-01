package com.JavaGame;

import java.awt.Color;
//import com.company.GameScreen;

import java.awt.*;

/**
 * class apple
 */
public class Apple {

    /**
     *
     */
    private final int xCoor;
    /**
     *
     */
    private final int yCoor;
    /**
     *
     */
    private final int width;
    /**
     *
     */
    private final int height;

    /**
     *
     * @param xCoor - coor x
     * @param yCoor - coor y
     * @param tileSize - size of the tile
     */
    public Apple(int xCoor, int yCoor, int tileSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }

    /**
     *
     * @param g - apple with color
     */
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(GameScreen.OFFSET+xCoor * width, GameScreen.OFFSET+yCoor * height, width, height);
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
     * @return y coord
     */
    public int getyCoor() {
        return yCoor;
    }

}

