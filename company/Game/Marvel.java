package com.company.Game;


        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Marvel {
    public static void main(String[] args) {
        Marvel2 obj44 = new Marvel2();

    }
}
class Marvel2 extends JFrame implements ActionListener {
    JLabel lgame4, il1, il2, il3, il4, il5, il6, il7, il8, il9, il10, il11;
    JTextField it1;
    JRadioButton c1,c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    JButton reveal;


    public Marvel2() {
        Font f1 = new Font(Font.SERIF, Font.BOLD, 20);
        Font f2 = new Font("Arial", Font.ROMAN_BASELINE, 20);

        String text = "<html><p>STEP1:<br> Select any team from the Right hand side column and you remember the  selected team.<br><br>STEP2:<br> Now if the above selected team is present in below given column then choose the option as 'YES' otherwise 'NO'.<br><br>STEP3:<br> At last after the selection of options click the button 'REVEAL' this shows you , your selected team.<br></p></html>";
        il9 = new JLabel(text);
        il9.setBounds(420, 20, 800, 250);
        add(il9);
        il9.setFont(f2);




        il6 = new JLabel("<html><p>Captain America<br>Iron Man<br>Thor<br>Spider Man<br>Black Widow <br>Black Panther<br>Hulk<br>Ant Man</p></html>");
        il6.setBounds(180, 40, 500, 210);
        il6.setForeground(Color.BLACK);
        add(il6);
        il6.setFont(f1);

        il1 = new JLabel("<html><p>Captain America<br>Iron Man<br>Spider Man<br>Black Widow<br>Black Panther<br>Ant Man<br></p></html>");
        il1.setBounds(30, 330, 300, 210);
        il1.setForeground(Color.BLACK);
        add(il1);
        il1.setFont(f1);

        il2 = new JLabel("<html><p>Captain America<br>Iron Man<br>Thor<br>Black Widow<br>Hulk<br>Ant Man<br></p></html>");
        il2.setBounds(300, 330, 300, 210);
        il2.setForeground(Color.BLACK);
        add(il2);
        il2.setFont(f1);

        il3 = new JLabel("<html><p>Captain America<br>Iron Man<br>Thor<br>Spider Man<br>Black Panther<br>Ant Man<br></p></html>");
        il3.setBounds(570, 330, 300, 210);
        il3.setForeground(Color.BLACK);
        add(il3);
        il3.setFont(f1);

        il4 = new JLabel("<html><p>Captain America<br>Thor<br>Spider Man<br>Black Widow<br>Hulk<br>Ant Man<br></p></html>");
        il4.setBounds(840, 330, 300, 210);
        il4.setForeground(Color.BLACK);
        add(il4);
        il4.setFont(f1);

        il5 = new JLabel("<html><p>Captain America<br>Iron Man<br>Thor<br>Spider Man<br>Black Widow<br>Black Panther<br></p></html>");
        il5.setBounds(1120, 330, 300, 210);
        il5.setForeground(Color.BLACK);
        add(il5);
        il5.setFont(f1);


        JPanel h = new JPanel();
        h.setBackground(new Color(2, 2, 2, 60));
        h.setBounds(150, 20, 250, 300);
        add(h);

        JPanel h2 = new JPanel();
        h2.setBackground(new Color(2, 2, 2, 60));
        h2.setBounds(420, 20, 800, 300);
        add(h2);

        JPanel heading = new JPanel();
        heading.setBackground(new Color(2, 2, 2, 60));
        heading.setBounds(10, 350, 250, 300);
        add(heading);

        JPanel heading2 = new JPanel();
        heading2.setBackground(new Color(2, 2, 2, 60));
        heading2.setBounds(285, 350, 250, 300);
        add(heading2);

        JPanel heading3 = new JPanel();
        heading3.setBackground(new Color(2, 2, 2, 60));
        heading3.setBounds(560, 350, 250, 300);
        add(heading3);

        JPanel heading4 = new JPanel();
        heading4.setBackground(new Color(2, 2, 2, 60));
        heading4.setBounds(835, 350, 250, 300);
        add(heading4);

        JPanel heading5 = new JPanel();
        heading5.setBackground(new Color(2, 2, 2, 60));
        heading5.setBounds(1105, 350, 250, 300);
        add(heading5);

        ImageIcon bgi = new ImageIcon("C:\\Users\\NIKKI\\Downloads\\marvel.jpg");
        Image ic = bgi.getImage();
        Image temp_ic = ic.getScaledInstance(1400, 800, Image.SCALE_SMOOTH);
        bgi = new ImageIcon(temp_ic);
        lgame4 = new JLabel("", bgi, JLabel.CENTER);
        lgame4.setBounds(0, 0, 1400, 800);
        add(lgame4);

        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        ButtonGroup bg3 = new ButtonGroup();
        ButtonGroup bg4 = new ButtonGroup();
        ButtonGroup bg5 = new ButtonGroup();

        c1 = new JRadioButton("YES");
        c1.setBounds(30, 600, 50, 20);
        bg1.add(c1);
        lgame4.add(c1);
        c1.addActionListener(this);

        c2 = new JRadioButton("NO");
        c2.setBounds(100, 600, 50, 20);
        bg1.add(c2);
        lgame4.add(c2);
        c2.addActionListener(this);

        c3 = new JRadioButton("YES");
        c3.setBounds(320, 600,50, 20);
        bg2.add(c3);
        lgame4.add(c3);
        c3.addActionListener(this);

        c4 = new JRadioButton("NO");
        c4.setBounds(390, 600, 50, 20);
        bg2.add(c4);
        lgame4.add(c4);
        c4.addActionListener(this);

        c5 = new JRadioButton("YES");
        c5.setBounds(600, 600, 50, 20);
        bg3.add(c5);
        lgame4.add(c5);
        c5.addActionListener(this);

        c6 = new JRadioButton("NO");
        c6.setBounds(670, 600, 50, 20);
        bg3.add(c6);
        lgame4.add(c6);
        c6.addActionListener(this);

        c7 = new JRadioButton("YES");
        c7.setBounds(880, 600, 50, 20);
        bg4.add(c7);
        lgame4.add(c7);
        c7.addActionListener(this);

        c8 = new JRadioButton("NO");
        c8.setBounds(950, 600, 50, 20);
        bg4.add(c8);
        lgame4.add(c8);
        c8.addActionListener(this);

        c9 = new JRadioButton("YES");
        c9.setBounds(1130, 600, 50, 20);
        bg5.add(c9);
        lgame4.add(c9);
        c9.addActionListener(this);

        c10 = new JRadioButton("NO");
        c10.setBounds(1200, 600, 50, 20);
        bg5.add(c10);
        lgame4.add(c10);
        c10.addActionListener(this);


        reveal = new JButton("REVEAL");
        lgame4.add(reveal);
        reveal.setBounds(700,270,100,30);
        reveal.addActionListener(this);

        setLayout(null);
        setSize(1400, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "";
        if (c1.isSelected()) {
            msg += String.valueOf(1);
        }
        if (c2.isSelected()) {
            msg += String.valueOf(0);
        }
        if (c3.isSelected()) {
            msg += String.valueOf(2);
        }
        if (c4.isSelected()) {
            msg += String.valueOf(0);
        }
        if (c5.isSelected()) {
            msg += String.valueOf(3);
        }
        if (c6.isSelected()) {
            msg += String.valueOf(0);
        }
        if (c7.isSelected()) {
            msg += String.valueOf(4);
        }
        if (c8.isSelected()) {
            msg += String.valueOf(0);
        }
        if (c9.isSelected()) {
            msg += String.valueOf(5);
        }
        if (c10.isSelected()) {
            msg += String.valueOf(0);
        }
        System.out.println(msg);

        if (e.getSource()==reveal){


            String r1 = "12345";
            String r2 = "12305";
            String r3 = "02345";
            String r4 = "10345";
            String r5 = "12045";
            String r6 = "10305";
            String r7 = "02040";
            String r8 = "12340";


            if (msg.equals(r1)) {
                new Rcb2();
            }
            else if (msg.equals(r2)) {
                new Srh2();
            }
            else if (msg.equals(r3)) {
                new Pbks2();
            }
            else if (msg.equals(r4)) {
                new Csk2();
            }
            else if (msg.equals(r5)) {
                new Rr2();
            }
            else if (msg.equals(r6)) {
                new Kkr2();
            }
            else if (msg.equals(r7)) {
                new Mi2();
            }
            else if (msg.equals(r8)) {
                new Dc2();
            }
            else {
                new Invalid2();
            }


        }


    }
}
