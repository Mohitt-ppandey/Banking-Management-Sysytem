package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balenceEnquiry extends JFrame implements ActionListener {

    JLabel l2;
    JButton btn1;
    String pin;

    balenceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,790,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,790);
        add(image);

        JLabel l1 = new JLabel("Your Current Balance is Rs. ");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(440,180,400,40);
        l1.setForeground(Color.white);
        image.add(l1);

        l2 = new JLabel("");
        l2.setFont(new Font("System",Font.BOLD,14));
        l2.setBounds(440,240,400,40);
        l2.setForeground(Color.white);
        image.add(l2);

        btn1 = new JButton("BACK");
        btn1.setFont(new Font("System",Font.BOLD,14));
        btn1.setBounds(730,390,120,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        image.add(btn1);

        int balance = 0;
        try {
            con c = new con();
            ResultSet rs = c.statement.executeQuery("select * from bank where pin = '"+pin+"'" );

            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        l2.setText(""+balance);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new main_Class(pin);
    }

    public static void main(String[] args) {
        new balenceEnquiry("");
    }
}
