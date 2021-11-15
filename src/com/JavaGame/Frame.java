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
    private static Frame instance = new Frame();

    private static final long serialVersionUID = 1L; /** Сохраняет текущее состояние окна?**/

    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /** Закрытие окна **/
        setTitle("Game Snake"); /** Название окна **/
        setResizable(false); /** Невозможно изменть размер окна. Почему?**/

        init(); /** Вызов init? **/
    }

    public void init() {
        setLayout(new GridLayout(1, 1, 0, 0)); /** Таблица 1х1. hgap,vgap?**/
        GameScreen Screen = new GameScreen();
        add(Screen);
        pack(); /** Устанавливает минимальный размер, достаточный для всех компонентов **/
        setLocationRelativeTo(null);
        setVisible(true);
        WordsLabel.getInstance().updateText("Snake Game");
    }

    public static void main(String[] args) {

        new Frame();
    }

    public static synchronized Frame getInstance(){
        return instance;
    }
}
