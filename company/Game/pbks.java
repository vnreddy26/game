package com.company.Game;

import javax.swing.*;
import java.awt.*;

public class pbks {
    public static void main(String[] args) {
        new Pbks2();

    }
}
class Pbks2 extends JFrame
{
    JLabel j3;
    public Pbks2()
    {
        j3 = new JLabel();
        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\pbks.png");
        Image img = bgi.getImage();
        Image temp_img = img.getScaledInstance(600,600,Image.SCALE_SMOOTH);
        bgi= new ImageIcon(temp_img);
        j3= new JLabel("",bgi,JLabel.CENTER);
        j3.setBounds(0,70,1350,600);
        add(j3);

        setLayout(null);
        setSize(1500,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

