package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b;
    JLabel j, j2;

    public Add() {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("calculate");
        j = new JLabel("type here");
        j2 = new JLabel("Result");
        add(j);
        add(t1);
        add(t2);
        add(b);
        add(j2);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
    }


    public void actionPerformed(ActionEvent e) {
        int r1 = Integer.parseInt(t1.getText());
        int r2 = Integer.parseInt(t2.getText());
        int r = r1 + r2;
        j2.setText(r + "");
        System.out.println("action performed");
    }
}
