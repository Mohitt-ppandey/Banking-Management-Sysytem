package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton btn;
    mini(String pin){

        this.pin = pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2 = new JLabel("StateBank M.P");
        label2.setFont(new Font("System", Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            con c = new con();
            ResultSet rs = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (rs.next()){
                label3.setText("Card Number:  "+ rs.getString("card_number").substring(0,4) + "XXXXXXXX"+ rs.getString("card_number").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            con c = new con();
            ResultSet rs = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (rs.next()){
                label1.setText(label1.getText() + "<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+ "<br><br><html>");
                if (rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        btn = new JButton("Exit");
        btn.setBounds(20,500,100,25);
        btn.addActionListener(this);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        add(btn);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
