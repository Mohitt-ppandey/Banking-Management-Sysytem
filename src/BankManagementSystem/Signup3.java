package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    JButton sub,can;
    String formNo;

    Signup3(String fornNo){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,10,100,100);
        add(image);

        this.formNo = fornNo;


        JLabel lb = new JLabel("Page No:" + fornNo);
        lb.setFont(new Font("Faleway",Font.BOLD,14));
        lb.setBounds(700,10,100,30);
        add(lb);

        JLabel l1 = new JLabel("Page 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details :");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,80,400,40);
        add(l2);


        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(80,150,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(215,252,255));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(80,180,200,30);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(215,252,255));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(300,180,600,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(215,252,255));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(80,220,200,30);
        add(r3);
        r4 = new JRadioButton("Reurring Deposit Account");
        r4.setBackground(new Color(215,252,255));
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(300,220,600,30);
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(80,280,200,30);
        add(l4);
        JLabel l5 = new JLabel("(Your 16-digits card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(80,300,200,30);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(300,280,250,30);
        add(l6);

        JLabel l7 = new JLabel("It would appear on ATM Card/cheque Book 0r Statements");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(300,300,350,30);
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(80,340,100,30);
        add(l8);
        JLabel l9 = new JLabel("(4-digits password)");
        l9.setFont(new Font("Raleway",Font.BOLD,12));
        l9.setBounds(80,360,200,30);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(300,340,100,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(80,410,200,30);
        add(l11);

        cb1 = new JCheckBox("ATM CARD");
        cb1.setBackground(new Color(215,252,255));
        cb1.setFont(new Font("Faleway",Font.BOLD,14));
        cb1.setBounds(80,440,150,40);
        add(cb1);
        cb2 = new JCheckBox("Internet Banking");
        cb2.setBackground(new Color(215,252,255));
        cb2.setFont(new Font("Faleway",Font.BOLD,14));
        cb2.setBounds(300,440,200,40);
        add(cb2);

        cb3 = new JCheckBox("Mobile Banking");
        cb3.setBackground(new Color(215,252,255));
        cb3.setFont(new Font("Faleway",Font.BOLD,14));
        cb3.setBounds(80,480,150,40);
        add(cb3);
        cb4 = new JCheckBox("EMAIL Alerts");
        cb4.setBackground(new Color(215,252,255));
        cb4.setFont(new Font("Faleway",Font.BOLD,14));
        cb4.setBounds(300,480,200,40);
        add(cb4);

        cb5 = new JCheckBox("Cheque Book");
        cb5.setBackground(new Color(215,252,255));
        cb5.setFont(new Font("Faleway",Font.BOLD,14));
        cb5.setBounds(80,520,150,40);
        add(cb5);
        cb6 = new JCheckBox("E-Statement");
        cb6.setBackground(new Color(215,252,255));
        cb6.setFont(new Font("Faleway",Font.BOLD,14));
        cb6.setBounds(300,520,200,40);
        add(cb6);

        JCheckBox cb = new JCheckBox("I hereby declares that the above entered details on the best of my knoledge.");
        cb.setBackground(new Color(215,252,255));
        cb.setFont(new Font("Faleway",Font.BOLD,12));
        cb.setBounds(80,580,600,40);
        add(cb);

        sub = new JButton("Submit");
        sub.setForeground(Color.white);
        sub.setBackground(Color.BLACK);
        sub.setFont(new Font("Faleway",Font.BOLD,12));
        sub.setBounds(220,650,100,30);
        sub.addActionListener(this);
        add(sub);
        can = new JButton("Cancel");
        can.setForeground(Color.white);
        can.setBackground(Color.BLACK);
        can.setFont(new Font("Faleway",Font.BOLD,12));
        can.setBounds(400,650,100,30);
        can.addActionListener(this);
        add(can);




        getContentPane().setBackground(new Color(215,252,255));
        setLayout(null);;
        setSize(850,800);
        setLocation(350,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType = null;
        if (r1.isSelected()){
            aType = "Saving Account";
        } else if (r2.isSelected()) {
            aType = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            aType = "Current Account";
        } else if (r4.isSelected()) {
            aType = "Reurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 900000000L ) + 1409963000000000L;
        String cardNo = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pinNo = "" + Math.abs(first3);

        String serReq = "";
        if (cb1.isSelected()){
            serReq =serReq + "ATM CARD";
        } else if (cb2.isSelected()) {
            serReq = serReq + "Internet Banking";
        }else if (cb3.isSelected()) {
            serReq = serReq + "Mobile Banking";
        }else if (cb4.isSelected()) {
            serReq = serReq + "EMAIL Alerts";
        }else if (cb5.isSelected()) {
            serReq = serReq + "Cheque Book";
        }else if (cb6.isSelected()) {
            serReq = serReq + "E-Statement";
        }

      try {
          if (e.getSource()==sub){
              if (aType.equals("")){
                  JOptionPane.showMessageDialog(null,"ll all the related document");
              }else {
                  con c1 = new con();
                  String p1 = "insert into signupthree values('"+formNo+"','"+aType+"','"+cardNo+"','"+pinNo+"','"+serReq+"')";
                  String p2 = "insert into login values('"+formNo+"','"+cardNo+"','"+pinNo+"')";
                  c1.statement.executeUpdate(p1);
                  c1.statement.executeUpdate(p2);
                  JOptionPane.showMessageDialog(null,"Card Number : " + cardNo + "\nPIN : " + pinNo);
                  new Deposit(pinNo);
                  setVisible(false);
              }
          } else if (e.getSource()==can) {
              System.exit(0);
          }
      }catch (Exception E){
          E.printStackTrace();
      }


    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
