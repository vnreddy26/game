package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class Dc {
    public static void main(String[] args) {
        new Dc2();
    }
}
class Dc2 extends JFrame
{
    JLabel j2;
    public Dc2()
    {
        j2 = new JLabel();
        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\dc.png");
        Image img = bgi.getImage();
        Image temp_img = img.getScaledInstance(400,400,Image.SCALE_SMOOTH);
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
