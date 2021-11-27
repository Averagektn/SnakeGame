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

    private static final long serialVersionUID = 1L;

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game Snake");
        setResizable(false);

        init();
    }
