package com.company.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gamein {
    public static void main(String[] args) {
        Gamein2 obj = new Gamein2();

    }
}
  class  Gamein2 extends JFrame implements ActionListener
 {
     JLabel lgame2,instruction;
     JButton back1;
     public Gamein2()
     {
         ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\game5.jpg");
         Image ic = bgi.getImage();
         Image temp_ic = ic.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
         bgi = new ImageIcon(temp_ic);
         lgame2 = new JLabel("", bgi, JLabel.CENTER);
         lgame2.setBounds(0, 0, 1500, 1000);
         add(lgame2);

         instruction = new JLabel("welcome to the game WORD REVEALER \n" +
                 "presenting to you by Nikhil");
         instruction.setBounds(300,300,1000,100);
         lgame2.add(instruction);

         back1 = new JButton("Back");
         back1.setBounds(300,500,100,30);
         lgame2.add(back1);
         back1.addActionListener(this);


         setLayout(new FlowLayout());
         setSize(1500,1000);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void actionPerformed(ActionEvent e) {
         if(e.getSource()==back1)
         {
            new Game2();
            dispose();
         }

     }
 }
