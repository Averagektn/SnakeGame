package com.JavaGame;

import javax.print.DocFlavor;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class AppleManager<E> extends ArrayList<Apple> {
    private Random random;
    private int fieldSize;
    private int sizeCell;

    public int SCORE = 0;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AppleManager(int fieldSizeParam, int sizeCellParam) {
        fieldSize = fieldSizeParam;
        sizeCell = sizeCellParam;

        random = new Random();

    }



    public void addAppleIfNot(Snake snake) {

        if (this.size() == 0) {

            int xCoor = random.nextInt(fieldSize);
            int yCoor = random.nextInt(fieldSize);

            while (snake.snakeHasCoord(xCoor, yCoor)) {
                xCoor = random.nextInt(fieldSize);
                yCoor = random.nextInt(fieldSize);

            }

            this.add(new Apple(xCoor, yCoor, sizeCell));
        }

    }

    public void draw(Graphics g) {

        for (int i = 0; i < this.size(); i++) {
            this.get(i).draw(g);
        }

    }

    public boolean isCoordHasFoodAndEat(int x, int y) {
        for (int i = 0; i < this.size(); i++) {

            if (this.get(i).getxCoor() == x && this.get(i).getyCoor() == y) {
                increaseScore();
                this.remove(i);
                return true;

            }

        }
        return false;
    }
    public void increaseScore() {
        SCORE += 1;
        System.out.println(SCORE);

    }


}
