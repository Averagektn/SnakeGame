package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput extends JFrame implements MouseListener {
    // public void ShowMessage() {
    // JOptionPane.showMessageDialog( this, "Ivan_Dzerzhinsky, Korney_Afanasenka, Nikita_Glushachenko","Creators", JOptionPane.INFORMATION_MESSAGE);



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        int mx = e.getX();
        int my = e.getY();

        // Play button
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200) {
            if (my >= 125 && my <= 200) {
                //Pressed Play Button
                GameScreen.State = GameScreen.STATE.GAME;
            }
        }

        //Quit button
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200) {
            if (my >= 325 && my <= 400) {
                //Pressed Quit Button
                System.exit(1);
            }
        }
        //Help button
        //WARNING -- This button shows name of creators of the project
        //!!!EDIT AND FIX
        if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200) {
            if (my >= 225 && my <= 275) {
                //Pressed Help Button
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(this, "Ivan Dzerzhinsky", "Creators", 2);
            }
        }

        /**if (mx >= GameScreen.WIDTH / 7 + 100 && mx < GameScreen.WIDTH / 7 + 200) {
            if (my >= 275 && my <= 340) {
                //Pressed Play Button
                GameScreen.State = GameScreen.STATE.GAME;
            }
        }**/
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
