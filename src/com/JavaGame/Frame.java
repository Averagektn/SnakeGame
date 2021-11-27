package com.JavaGame;

import javax.swing.JFrame;
import java.awt.*;


/**THE PROJECT WAS MADE BY BSUIR STUDENTS
 * IVAN LYSIAKOFF
 * KORNEY AFANASENKA
 * NIKITA GLUSHACHENKO
 * FOR C.T.S., DOCENT NESTERENKOV S.N.
 **/

public class Frame extends JFrame {
    private static Frame instanceFrame = new Frame();

    private static final long serialVersionUID = 1L;/**Delete**/

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game Snake");
        setResizable(false);

        init();
    }

    public void init() {
        setLayout(new GridLayout(1, 1, 0, 0));/**Delete**/
        GameScreen Screen = new GameScreen();
        add(Screen);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        //WordsLabel.getInstance().updateText("Snake Game");
    }

    public static void main(String[] args) {

        new Frame();/**Delete**/
    }
    public static Frame getInstance() { return instanceFrame; }

}
