package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton btn1,btn2;
    JPasswordField pass1,pass2;
    String pin;

    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,790,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,790);
        add(image);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(440,180,400,40);
        l1.setForeground(Color.white);
        image.add(l1);
        JLabel l2 = new JLabel("New PIN :");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(440,220,400,40);
        l2.setForeground(Color.white);
        image.add(l2);
        pass1 = new JPasswordField();
        pass1.setFont(new Font("System",Font.BOLD,12));
        pass1.setBounds(600,225,200,25);
        pass1.setBackground(new Color(65,125,128));
        add(pass1);

        JLabel l3 = new JLabel("Re-Enter New PIN :");
        l3.setFont(new Font("System",Font.BOLD,16));
        l3.setBounds(440,260,400,40);
        l3.setForeground(Color.white);
        image.add(l3);
        pass2 = new JPasswordField();
        pass2.setFont(new Font("System",Font.BOLD,12));
        pass2.setBounds(600,265,200,25);
        pass2.setBackground(new Color(65,125,128));
        add(pass2);


        btn1 = new JButton("Change");
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

        try {

            String p1 = pass1.getText();
            String p2 = pass1.getText();

            if (!p1.equals(p2)){
                JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match");
                return;
            }

            if (e.getSource()==btn1){
                if (pass1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (pass2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                con c = new con();
                String q1 = "update bank set pin = '"+p1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+p1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+p1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new main_Class(pin);

            }else if (e.getSource()==btn2){
                setVisible(false);
                new main_Class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Pin("");
    }
}
