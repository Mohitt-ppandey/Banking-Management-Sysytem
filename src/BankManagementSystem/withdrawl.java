package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    JTextField field1;
    JButton btn1,btn2;

    String pin;
    withdrawl(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,790,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,790);
        add(image);

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWL IS RS. 10,000");
        l1.setFont(new Font("System",Font.BOLD,14));
        l1.setBounds(440,150,400,40);
        l1.setForeground(Color.white);
        image.add(l1);

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System",Font.BOLD,14));
        l2.setBounds(440,180,400,40);
        l2.setForeground(Color.white);
        image.add(l2);

        field1 = new JTextField();
        field1.setFont(new Font("Raleway",Font.BOLD,14));
        field1.setBounds(440,220,350,30);
        field1.setBackground(new Color(65,125,128));
        field1.setForeground(Color.white);
        image.add(field1);

        btn1 = new JButton("WITHDRAWL");
        btn1.setFont(new Font("System",Font.BOLD,12));
        btn1.setBounds(730,346,120,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.addActionListener(this);
        btn1.setForeground(Color.white);
        image.add(btn1);
        btn2 = new JButton("BACK");
        btn2.setFont(new Font("System",Font.BOLD,14));
        btn2.setBounds(730,390,120,30);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        image.add(btn2);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==btn1) {
           try {
               String amount = field1.getText();
               Date date = new Date();
               if (field1.getText().equals("")) {
                   JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdrawl");
               } else {
                   con c = new con();
                   ResultSet rs = c.statement.executeQuery("Select * from bank where pin = '" + pin + "'");
                   int balence = 0;
                   while (rs.next()) {
                       if (rs.getString("type").equals("Deposit")) {
                           balence += Integer.parseInt(rs.getString("amount"));
                       } else {
                           balence -= Integer.parseInt(rs.getString("amount"));
                       }
                   }
                   if (balence < Integer.parseInt(amount)) {
                       JOptionPane.showMessageDialog(null, "Insufficient balence");
                       return;
                   }


                   c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawl','" + amount + "')");
                   JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited successfully");
                   setVisible(false);
                   new main_Class(pin);
               }

           } catch (Exception E) {

           }
       } else if (e.getSource()==btn2) {
           setVisible(false);
           new main_Class(pin);
       }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
