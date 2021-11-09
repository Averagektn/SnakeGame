package com.JavaGame;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput extends JFrame implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        int mx = e.getX();
        int my = e.getY();

        // Play button
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 125 && my <= 200) {
                //Pressed Play Button
                GameScreen.State = GameScreen.STATE.GAME;
            }
        }

        //Quit button
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 325 && my <= 400) {
                //Pressed Quit Button
                System.exit(1);
            }
        }
        //Help button
        //WARNING -- This button shows name of creators of the project
        //!!!EDIT AND FIX
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 225 && my <= 275) {
                //Pressed Help Button
                GameScreen.State = GameScreen.STATE.HELP;
            }
        }

        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200) {
            if (my >= 275 && my <= 340) {

                GameScreen.State = GameScreen.STATE.MENU;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
