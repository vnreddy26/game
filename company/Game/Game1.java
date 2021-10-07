package com.company.Game;

import com.company.Add;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game1 {
    public static void main(String[] args) {
        Game2 z = new Game2();
    }
}
class Game2 extends JFrame implements ActionListener {
    JButton z1,z2;
    JLabel lgame1;
    public Game2()
    {
        z1 = new JButton("Menu");
        add(z1);
        z1.setBounds(700,350,100,25);
        z1.addActionListener(this);

        z2 = new JButton("Game Instructions");
        add(z2);
        z2.setBounds(690,500,150,25);
        z2.addActionListener(this);

        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\game5.jpg");
        Image ic = bgi.getImage();
        Image temp_ic = ic.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        bgi = new ImageIcon(temp_ic);
        lgame1 = new JLabel("", bgi, JLabel.CENTER);
        lgame1.setBounds(0, 0, 1500, 1000);
        add(lgame1);

        setLayout(null);
        setSize(1500,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==z1)
        {
            new Add();
            dispose();
        }
        if(e.getSource()==z2)
        {
            new Gamein2();
            dispose();
        }


    }
}
