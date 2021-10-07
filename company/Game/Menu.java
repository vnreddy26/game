package com.company.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        Menu1 obj33 = new Menu1();
    }
}
class Menu1 extends JFrame implements ActionListener
{
    JButton jb1,jb2,jb3;
    JLabel lgame3;
    public Menu1()
    {
        jb1 = new JButton("IPL");
        add(jb1);
        jb1.setBounds(650,100,100,30);
        jb1.addActionListener(this);

        jb2 = new JButton("Marvel");
        add(jb2);
        jb2.setBounds(650,150,100,30);
        jb2.addActionListener(this);

        jb3 = new JButton("Food");
        add(jb3);
        jb3.setBounds(650,200,100,30);
        jb3.addActionListener(this);



        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\game5.jpg");
        Image ic = bgi.getImage();
        Image temp_ic = ic.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
        bgi = new ImageIcon(temp_ic);
        lgame3 = new JLabel("", bgi, JLabel.CENTER);
        lgame3.setBounds(0, 0, 1500, 1000);
        add(lgame3);

        setLayout(null);
        setSize(1500,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
        {
            new Ipl2();

        }
        /*
        if(e.getSource()==jb2)
        {

        }
        if(e.getSource()==jb3)
        {

        }*/




    }
}
