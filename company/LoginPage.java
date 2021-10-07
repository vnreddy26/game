package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        Login lo =new Login();
    }
}
class Login extends JFrame implements ActionListener {
    JLabel s,bgl,l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    public Login(){
        //User Login Label

        l3 = new JLabel("User Login");
        add(l3);
        Font f2 = new Font("Arial",Font.BOLD,25);
        l3.setFont(f2);
        l3.setBounds(440,250,150,40);

        //adding button
        ImageIcon ic = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\jp2.jpg");
        Image ic2 = ic.getImage();
        Image temp_ic = ic2.getScaledInstance(130,40,Image.SCALE_SMOOTH);
        b1 = new JButton(new ImageIcon(temp_ic));
        add(b1);
        b1.setBounds(330,527,135,38);
        Font f3 = new Font("Monospaced plain",Font.BOLD,30);
        b1.setFont(f3);
        s = new JLabel("LOGIN STATUS");
        s.setBounds(20,20,400,400);
        Font  f5 = new Font("Arial",Font.BOLD,40);
        s.setFont(f5);
        s.setForeground(Color.white);
        b1.addActionListener(this);
        add(s);

        //header
        JPanel heading = new JPanel();
        heading.setBackground(new Color(2,2,2,60));
        heading.setBounds(300,250,400,400);
        Label l1 = new Label("USER ID");
        add(l1);
        l1.setBounds(330,270,200,100);
        l2 = new JLabel("PASSWORD");
        add(l2);
        l2.setBounds(330,370,300,100);
        //font of Label
        Font f = new Font("serif",Font.BOLD,30);
        l1.setFont(f);
        l2.setFont(f);
        //color of label
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        //text field
        t1 = new JTextField();
        t2 = new JPasswordField();
        add(t1);
       t1.setBackground(new Color(224,224,224));
        t1.setBounds(330,350,230,35);
        add(t2);
        Font  f4 = new Font("serif",Font.CENTER_BASELINE,20);
        t1.setFont(f4);
        t2.setFont(f4);
        t2.setBackground(new Color(224,224,224));
        t2.setBounds(330,450,230,35);



        //background
        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\jp1.jpg");
        Image img = bgi.getImage();
        Image temp_img = img.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
        bgi = new ImageIcon(temp_img);
        bgl = new JLabel("",bgi,JLabel.CENTER);
        bgl.setBounds(0,0,1000,1000);
        bgl.add(heading);
        add(bgl);

        //SET
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String ui = t1.getText();
       String pw = String.valueOf(t2.getPassword());
        if((ui.equals("vnr")) && (pw.equals("vnr")))
        {
            s.setForeground(Color.GREEN);
            s.setText("LOGGED IN AS VNR");
        }
        else if((ui.equals("vk")) && (pw.equals("vk")))
        {
            s.setForeground(Color.GREEN);
            s.setText("LOGGED IN AS VK");
        }
        else if((ui.equals("var")) && (pw.equals("var")))
        {
            s.setForeground(Color.GREEN);
            s.setText("LOGGED IN AS VAR");
        }
        else if((ui.equals("vvr")) && (pw.equals("vvr")))
        {
            s.setForeground(Color.GREEN);
            s.setText("LOGGED IN AS VVR");
        }
        else
        {
            s.setForeground(Color.RED);
            s.setText("LOGIN FAILED");
        }

    }
}



