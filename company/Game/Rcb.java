package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class Rcb {
    public static void main(String[] args) {
        new Rcb2();
    }
}
class Rcb2 extends JFrame
{
    JLabel j;
    public Rcb2()
    {
        j = new JLabel();
        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\rcb2.png");
        Image img = bgi.getImage();
        Image temp_img = img.getScaledInstance(600,600,Image.SCALE_SMOOTH);
        bgi= new ImageIcon(temp_img);
        j= new JLabel("",bgi,JLabel.CENTER);
        j.setBounds(0,0,1350,600);
        add(j);

        setLayout(null);
        setSize(1500,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
