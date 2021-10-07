package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardEvents {
    public static void main(String[] args) {
        Keys k = new Keys();

    }

}
class Keys extends JFrame implements KeyListener
{
    JLabel l;
    //TextArea ta;
    public Keys()
    {
        l = new JLabel("keyboard events");
      //  ta= new TextArea();
        //ta.setBounds(20,200,400,400);
        add(l);
        //add(ta);
        addKeyListener(this);
        setLayout(null);
        setVisible(true);
        setSize(2000,2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void keyTyped(KeyEvent e) {
        l.setText("key typed");

    }

    public void keyPressed(KeyEvent e) {
        l.setText("key pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("key released");
    }
}