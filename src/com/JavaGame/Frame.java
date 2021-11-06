package com.company;

import javax.swing.JFrame;
import java.awt.*;

/**THE PROJECT WAS MADE BY BSUIR STUDENTS
 * IVAN LYSIAKOFF
 * KORNEY AFANASENKA
 * NIKITA GLUSHACHENKO
 * FOR C.T.S., DOCENT NESTERENKOV S.N.
 **/

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game Snake");
        setResizable(false);

        init();
    }

    public void init() {
        setLayout(new GridLayout(1, 1, 0, 0));
        GameScreen s = new GameScreen();
        add(s);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }

}
