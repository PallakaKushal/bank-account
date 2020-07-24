package bank;


import javax.swing.*;
import java.awt.*;

class DisplayAccountUI extends JFrame {
    static JButton get1;
    JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;
    static JLabel l5;
    static JTextField f1;
    static JTextField f2;
    static JTextField f3;

    DisplayAccountUI(){
        this.setName("Account finder");
        this.setSize(500,300);
        this.setLayout(null);
        get1= new JButton("GET ");
        get1.setBounds(65,100,80,50);
        get1.setFont(new Font("Courier",Font.PLAIN,25));
       get1.addActionListener(new GetButtonLogic(this));
        l1 = new JLabel("Account Number:");
        l1.setBounds(50,50,200,50);
        l1.setFont(new Font("Courier",Font.PLAIN,15));
        l2 = new JLabel("Name:");
        l2.setBounds(50,150,200,50);
        l2.setFont(new Font("Courier",Font.PLAIN,20));
        l2.setVisible(false);
        l3 = new JLabel("Amount:");
        l3.setBounds(50,212,200,50);
        l3.setFont(new Font("Courier",Font.PLAIN,20));
        l3.setVisible(false);
        l4 = new JLabel("     ");
        l4.setBounds(125,150,200,50);
        l4.setFont(new Font("Courier",Font.PLAIN,20));
        //l4.setVisible(false);
        l5 = new JLabel("     ");
        l5.setBounds(135,212,200,50);
        l5.setFont(new Font("Courier",Font.PLAIN,20));
        //l5.setVisible(false);
        f1 = new JTextField();
        f1.setBounds(200,50,200,50);

        this.add(get1);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(f1);


    }
}


