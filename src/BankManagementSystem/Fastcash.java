package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener {

    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    String pin;

    Fastcash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,790,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,790);
        add(image);

        JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setFont(new Font("System",Font.BOLD,23));
        l1.setBounds(450,180,400,40);
        l1.setForeground(Color.white);
        image.add(l1);


        //left Button
        btn1 = new JButton("Rs. 100");
        btn1.setFont(new Font("System",Font.BOLD,13));
        btn1.setBounds(410,258,120,32);
        btn1.setBackground(new Color(65,125,128));
        btn1.addActionListener(this);
        btn1.setForeground(Color.white);
        image.add(btn1);
        btn2 = new JButton("Rs. 1000");
        btn2.setFont(new Font("System",Font.BOLD,13));
        btn2.setBounds(410,303,120,32);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        image.add(btn2);
        btn3 = new JButton("Rs. 5000");
        btn3.setFont(new Font("System",Font.BOLD,13));
        btn3.setBounds(410,348,120,32);
        btn3.setBackground(new Color(65,125,128));
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        image.add(btn3);


        //Right Button
        btn4 = new JButton("Rs. 500");
        btn4.setFont(new Font("System",Font.BOLD,13));
        btn4.setBounds(710,258,140,32);
        btn4.setBackground(new Color(65,125,128));
        btn4.addActionListener(this);
        btn4.setForeground(Color.white);
        image.add(btn4);
        btn5 = new JButton("Rs. 2000");
        btn5.setFont(new Font("System",Font.BOLD,13));
        btn5.setBounds(710,303,140,32);
        btn5.setBackground(new Color(65,125,128));
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        image.add(btn5);
        btn6 = new JButton("Rs. 10000");
        btn6.setFont(new Font("System",Font.BOLD,13));
        btn6.setBounds(710,348,140,32);
        btn6.setBackground(new Color(65,125,128));
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        image.add(btn6);
        btn7 = new JButton("BACK");
        btn7.setFont(new Font("System",Font.BOLD,13));
        btn7.setBounds(710,390,140,32);
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
        if(e.getSource()==btn7) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            con c = new con();
            Date date = new Date();
            try {
                ResultSet rs = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (e.getSource() != btn7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"', 'withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. " + amount + " Debited successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }
     }

    public static void main(String[] args) {
        new Fastcash("");
    }
}
