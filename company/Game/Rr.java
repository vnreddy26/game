package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class Rr {
    public static void main(String[] args) {
        new Rr2();
    }
}
class Rr2 extends JFrame
{
    JLabel j2;
    public Rr2()
    {
        j2 = new JLabel();
        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\rr.png");
        Image img = bgi.getImage();
        Image temp_img = img.getScaledInstance(500,500,Image.SCALE_SMOOTH);
        bgi= new ImageIcon(temp_img);
        j2= new JLabel("",bgi,JLabel.CENTER);
        j2.setBounds(0,70,1350,600);
        add(j2);

        setLayout(null);
        setSize(1500,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
