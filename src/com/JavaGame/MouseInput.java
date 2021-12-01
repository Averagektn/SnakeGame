package com.JavaGame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 */
public class MouseInput extends JFrame implements MouseListener {

    /**
     *
     */
    private static final MouseInput instanceMouseInput = new MouseInput();

    /**
     *
     * @param e - unused void
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     *
     * @param e - unused void
     */
    @Override
    public void mousePressed(MouseEvent e) {

        int mx = e.getX();
        int my = e.getY();

        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 125 && my <= 200) {
                GameScreen.State = GameScreen.STATE.GAME;
            }
        }
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 325 && my <= 400) {
                System.exit(1);
            }
        }
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.MENU) {
            if (my >= 225 && my <= 275) {
                GameScreen.State = GameScreen.STATE.HELP;
            }
        }
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200 && GameScreen.State == GameScreen.STATE.HELP) {
            if (my >= 275 && my <= 340) {

                GameScreen.State = GameScreen.STATE.MENU;
            }
        }
        if (mx >= 150 && mx < 200 && GameScreen.State == GameScreen.STATE.GAMEOVER)  {
            if (my >=300 && my <= 320) {
                GameScreen.State = GameScreen.STATE.MENU;
            }
        }
    }

    /**
     *
     * @param e - unused void
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     *
     * @param e - unused void
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     *
     * @param e - unused void
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     *
     * @return MouseInput
     */
    public static MouseInput getInstance() {
        return instanceMouseInput;
    }
}
