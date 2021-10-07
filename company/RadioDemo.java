package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioDemo {
    public static void main(String[] args) {
        RadioEx r = new RadioEx();
    }
}
class RadioEx extends JFrame implements ActionListener{
    JButton b1;
    JLabel l,l2,n1,n2,n3,n4;
    JTextField t1,t2;
    JRadioButton r1,r2;
    JCheckBox c1,c2;
    public RadioEx(){
        b1 = new JButton("OK");
        l = new JLabel("label 1");
        l2 = new JLabel("label 2");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        n1 = new JLabel("First Name");
        n2 = new JLabel("Last Name");
        n3 = new JLabel("Gender");
        n4 = new JLabel("Hobbies");
        c1 = new JCheckBox("Playing");
        c2 = new JCheckBox("Singing");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        add(n1);
        add(t1);
        add(n2);
        add(t2);
        add(n3);
        add(r1);
        add(r2);
        add(n4);
        add(c1);
        add(c2);
        add(l);
        add(l2);
        add(b1);
       // t1.setBounds(10,10,30,30);
        n2.setBounds(10,30,30,30);

        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(300,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        String v= t1.getText();
    l.setText(v);
        String v2= t2.getText();
        l2.setText(v2);
    }
}