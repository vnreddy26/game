package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEve {
    public static void main(String[] args) {
        Mouse m = new Mouse();
    }
}
 class Mouse extends JFrame implements MouseListener{
    JLabel l;
    public Mouse()
    {
        l = new JLabel("event ");
        add(l);
        addMouseListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     public void mouseClicked(MouseEvent e) {
      l.setText("mouse clicked");
     }
     public void mousePressed(MouseEvent e) {
         l.setText("mouse pressed");
     }
     public void mouseReleased(MouseEvent e) {
         l.setText("mouse released ");
     }
     public void mouseExited(MouseEvent e) {
         l.setText("mouse exited");
     }
     public void mouseEntered(MouseEvent e) {
         l.setText("mouse Entered");
     }
 }