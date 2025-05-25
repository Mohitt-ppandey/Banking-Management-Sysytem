package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField field1;
    JPasswordField pass1;
    JButton btn1,btn2,btn3;
    Login(){
        super("Bank management system");

        //add icon 1:
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        //add icon 2:
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        //add label1:
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
         label1.setFont(new Font("Avantgarge",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        //add label2:
        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,450,40);
        add(label2);

        //add Textfield
        field1 = new JTextField(15);
        field1.setBounds(300,190,250,32);
        field1.setFont(new Font("Arial",Font.BOLD,14));
        add(field1);

        //add label3:
        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,450,40);
        add(label3);

        //add password field
        pass1 = new JPasswordField(15);
        pass1.setBounds(300,250,250,32);
        pass1.setFont(new Font("Arial",Font.BOLD,14));
        add(pass1);


        //add Button1:
        btn1 = new JButton("SIGN IN");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setBounds(280,300,100,28);
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.addActionListener(this);
        add(btn1);

        //add Button2:
        btn2 = new JButton("CLEAR");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setBounds(430,300,100,28);
        btn2.setFont(new Font("Arial",Font.BOLD,14));
        btn2.addActionListener(this);
        add(btn2);

        //add Button3:
        btn3 = new JButton("SIGN UP");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setBounds(280,350,250,28);
        btn3.setFont(new Font("Arial",Font.BOLD,14));
        btn3.addActionListener(this);
        add(btn3);



        //add background
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,450,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,450);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==btn1){
                con c =new con();
                String cardNo = field1.getText();
                String pin = pass1.getText();

                String q = "select * from login where card_number = '"+cardNo+"' and pin = '"+pin+"'";
                ResultSet rs = c.statement.executeQuery(q);
                if (rs.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number and Pin");
                }

            }else if (e.getSource()==btn2){
                field1.setText("");
                pass1.setText("");
            }else if (e.getSource()==btn3){
                new Signup();
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
