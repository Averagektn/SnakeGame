package com.company;

import javax.swing.*;
import java.awt.*;
//import java.net.PortUnreachableException;

public class Menu extends JFrame {

    public Rectangle playButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 125, 100, 50);
    public Rectangle editorsButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 225, 100, 50);
    public Rectangle quitButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 325, 100, 50);
    public Rectangle backToMenuButton = new Rectangle(GameScreen.WIDTH / 7 + 100, 275, 120, 40);

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

    public void gameOverWord (Graphics g) {
        Graphics2D g3d = (Graphics2D) g;
        Font fnt2 = new Font("arial", Font.BOLD, 60);
        g.setFont(fnt2);
        g.setColor(Color.WHITE);
        g.drawString("Game Over", GameScreen.WIDTH / 7, 175);

        Font fnt3 = new Font("arial", Font.BOLD, 30);
        g.setFont(fnt3);
        g3d.draw(backToMenuButton);
        g.drawString("Menu", backToMenuButton.x + 20, backToMenuButton.y + 30);
     }
}
