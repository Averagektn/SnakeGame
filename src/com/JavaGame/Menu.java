package com.JavaGame;

import javax.swing.*;
import java.awt.*;

//import java.net.PortUnreachableException;

public class Menu extends JFrame{

    public Rectangle playButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 125, 100, 50);
    public Rectangle editorsButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 225, 100, 50);
    public Rectangle quitButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 325, 100, 50);
    public Rectangle backToMenuButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 275, 100, 50);

    //AppleManager getScore;

    public void render (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Font fnt0 = new Font("arial", Font.BOLD, 50);
        g.setFont(fnt0);
        g.setColor(Color.WHITE);
        g.drawString("Game Snake", GameScreen.WIDTH / 7, 100);

        Font fnt1 = new Font("arial", Font.BOLD, 30);
        g.setFont(fnt1);
        g2d.draw(playButton);
        g.drawString("Play", playButton.x + 20, playButton.y + 35);
        g2d.draw(editorsButton);
        g.drawString("Info", editorsButton.x + 20, editorsButton.y + 35);
        g2d.draw(quitButton);
        g.drawString("Quit", quitButton.x + 20, quitButton.y + 35);

    }


    public void scoreCounter (Graphics g) {
        Font scF = new Font("arial", Font.BOLD, 20);
        g.setFont(scF);
        //scF -- Font for score
        g.setColor(Color.RED);
        //int Score = getScore.SCORE;
        g.drawString("Score: "  , 20, 18);
    }

    public void gameOverWord (Graphics g) {

        Font fnt2 = new Font("arial", Font.BOLD, 60);
        g.setFont(fnt2);
        g.setColor(Color.WHITE);
        g.drawString("Game Over", GameScreen.WIDTH / 8, 175);

        /**Font fnt3 = new Font("arial", Font.BOLD, 30);
        g.setFont(fnt3);
        g3d.draw(backToMenuButton);
        g.drawString("Menu", backToMenuButton.x + 20, backToMenuButton.y + 30);
         **/
     }
    public void creatorListAndRules (Graphics g) {
        Font fnt4 = new Font("arial", Font.ITALIC, 20); //Font for creators/rule menu
        Graphics2D g4d = (Graphics2D) g;
        g.setFont(fnt4);
        g4d.draw(backToMenuButton);
        g.setColor(Color.WHITE);
        //g.drawString("Menu", GameScreen.WIDTH / 7, 275);
        g.drawString("Game over when: ", 20, 40);
        g.drawString("- Snake crash with wall", 20, 80);
        g.drawString("- Snake crash with itself", 20, 120);
    }
}
