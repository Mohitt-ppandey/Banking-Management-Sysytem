package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    String pin;


    main_Class(String pin){

        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,790,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,790);
        add(image);

        JLabel l1 = new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("System",Font.BOLD,26));
        l1.setBounds(430,180,400,40);
        l1.setForeground(Color.white);
        image.add(l1);


        //left Button
        btn1 = new JButton("DEPOSIT");
        btn1.setFont(new Font("System",Font.BOLD,12));
        btn1.setBounds(410,258,120,32);
        btn1.setBackground(new Color(65,125,128));
        btn1.addActionListener(this);
        btn1.setForeground(Color.white);
        image.add(btn1);
        btn2 = new JButton("FAST CASH");
        btn2.setFont(new Font("System",Font.BOLD,12));
        btn2.setBounds(410,303,120,32);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        image.add(btn2);
        btn3 = new JButton("PIN CHANGE");
        btn3.setFont(new Font("System",Font.BOLD,12));
        btn3.setBounds(410,348,120,32);
        btn3.setBackground(new Color(65,125,128));
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        image.add(btn3);


        //Right Button
        btn4 = new JButton("CASH WITHDRAWL");
        btn4.setFont(new Font("System",Font.BOLD,12));
        btn4.setBounds(690,258,160,32);
        btn4.setBackground(new Color(65,125,128));
        btn4.addActionListener(this);
        btn4.setForeground(Color.white);
        image.add(btn4);
        btn5 = new JButton("MINI STATEMENT");
        btn5.setFont(new Font("System",Font.BOLD,12));
        btn5.setBounds(690,303,160,32);
        btn5.setBackground(new Color(65,125,128));
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        image.add(btn5);
        btn6 = new JButton("BALANCE ENQUIRY");
        btn6.setFont(new Font("System",Font.BOLD,12));
        btn6.setBounds(690,348,160,32);
        btn6.setBackground(new Color(65,125,128));
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        image.add(btn6);
        btn7 = new JButton("EXIT");
        btn7.setFont(new Font("System",Font.BOLD,12));
        btn7.setBounds(690,390,160,32);
        btn7.setBackground(new Color(65,125,128));
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        image.add(btn7);





        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==btn7) {
            System.exit(0);
        } else if (e.getSource()==btn4) {
            new withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==btn6) {
            new balenceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==btn2) {
            new Fastcash(pin);
            setVisible(false);
        } else if (e.getSource()==btn3) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==btn5) {
            new mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
