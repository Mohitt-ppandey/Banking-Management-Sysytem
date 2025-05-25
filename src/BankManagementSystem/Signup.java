package BankManagementSystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField field4,field5,field8,field10,field11,field12,field13;

    JRadioButton radio6,radio7,radio9,radio10,radio11;
    JDateChooser dateChooser;
    JButton btn;
    Random ran = new Random();

    long fst = (ran.nextLong() % 8000L) + 2000L;
    String first = " " + Math.abs(fst);

    Signup(){
        super("APPLICATION FORM");

        //add imageIcon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //add Label1
        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first );
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        label1.setBounds(160,20,800,40);
        add(label1);

        //add label2
        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);


        //add label3
        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290,100,600,40);
        label3.setFont(new Font("Raleway",Font.BOLD,24));
        add(label3);

        //add label4
        JLabel label4 = new JLabel("Name :");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(100,220,100,30);
        add(label4);

        //add field for name
        field4 = new JTextField();
        field4.setFont(new Font("Raleway",Font.BOLD,14));
        field4.setBounds(300,220,400,30);
        add(field4);

        //add label5
        JLabel label5 = new JLabel("Father's Name :");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,270,200,25);
        add(label5);

        //add field for label5
        field5 = new JTextField();
        field5.setFont(new Font("Raleway",Font.BOLD,14));
        field5.setBounds(300,270,400,30);
        add(field5);

        //add label6
        JLabel label6 = new JLabel("Gender :");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(100,310,100,25);
        add(label6);

        //add Radio button
        radio6 = new JRadioButton("Male");
        radio6.setFont(new Font("Raleway",Font.BOLD,14));
        radio6.setBounds(300,310,60,25);
        radio6.setBackground(new Color(222,255,228));
        add(radio6);

        radio7 = new JRadioButton("Female");
        radio7.setFont(new Font("Raleway",Font.BOLD,14));
        radio7.setBounds(450,310,100,25);
        radio7.setBackground(new Color(222,255,228));
        add(radio7);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radio6);
        bg.add(radio7);

        //add label7
        JLabel label7 = new JLabel("Date of Birth :");
        label7.setFont(new Font("Raleway",Font.BOLD,20));
        label7.setBounds(100,350,200,25);
        add(label7);




        //add Date Chooser
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setFont(new Font("Fareway",Font.BOLD,14));
        dateChooser.setBounds(300,350,400,30);
        add(dateChooser);

        //add label8
        JLabel label8 = new JLabel("Email Address :");
        label8.setFont(new Font("Raleway",Font.BOLD,20));
        label8.setBounds(100,390,200,25);
        add(label8);

        //add field for Email
        field8 = new JTextField();
        field8.setFont(new Font("Raleway",Font.BOLD,14));
        field8.setBounds(300,390,400,30);
        add(field8);

        //add label9
        JLabel label9 = new JLabel("Marital Status :");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,430,200,25);
        add(label9);

        //add Radio button
        radio9 = new JRadioButton("Married");
        radio9.setFont(new Font("Raleway",Font.BOLD,14));
        radio9.setBounds(300,430,90,25);
        radio9.setBackground(new Color(222,255,228));
        add(radio9);

        radio10 = new JRadioButton("Unmarried");
        radio10.setFont(new Font("Raleway",Font.BOLD,14));
        radio10.setBounds(450,430,100,25);
        radio10.setBackground(new Color(222,255,228));
        add(radio10);

        radio11 = new JRadioButton("Other");
        radio11.setFont(new Font("Raleway",Font.BOLD,14));
        radio11.setBounds(600,430,100,25);
        radio11.setBackground(new Color(222,255,228));
        add(radio11);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radio9);
        bg1.add(radio10);
        bg1.add(radio11);

        //add label10
        JLabel label10 = new JLabel("Address :");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,470,100,25);
        add(label10);

        field10 = new JTextField();
        field10.setFont(new Font("Raleway",Font.BOLD,14));
        field10.setBounds(300,470,400,30);
        add(field10);

        //add label11
        JLabel label11= new JLabel("City :");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,510,50,25);
        add(label11);

        field11 = new JTextField();
        field11.setFont(new Font("Raleway",Font.BOLD,14));
        field11.setBounds(300,510,400,30);
        add(field11);

        //add label12
        JLabel label12 = new JLabel("State :");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(100,550,100,25);
        add(label12);

        field12 = new JTextField();
        field12.setFont(new Font("Raleway",Font.BOLD,14));
        field12.setBounds(300,550,400,30);
        add(field12);

        //add label13
        JLabel label13 = new JLabel("Pin Code :");
        label13.setFont(new Font("Raleway",Font.BOLD,20));
        label13.setBounds(100,590,100,25);
        add(label13);

        field13 = new JTextField();
        field13.setFont(new Font("Raleway",Font.BOLD,14));
        field13.setBounds(300,590,400,30);
        add(field13);

        btn = new JButton("Next");
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.BLACK);
        btn.setFont(new Font("Raleway",Font.BOLD,14));
        btn.setBounds(600,660,100,30);
        btn.addActionListener(this);
        add(btn);





        getContentPane().setBackground(new Color(222,250,225));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNumber = first;
        String name = field4.getText();
        String fName = field5.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radio6.isSelected()){
            gender = "Male";
        }else  if (radio7.isSelected()){
            gender = "Female";
        }
        String email = field8.getText();
        String marrage = null;
        if (radio9.isSelected()){
            marrage = "Married";
        }else if (radio10.isSelected()){
            marrage = "Unmarried";
        } else if (radio11.isSelected()) {
            marrage = "Other";
        }
        String address = field10.getText();
        String city = field11.getText();
        String state = field12.getText();
        String pin = field13.getText();

        try {

            if (field4.getText().equals("")){
                JOptionPane.showMessageDialog(null , "Fill all the related document");
            }else {
                con con1 = new con();
                String q = "Insert into signup values ('"+formNumber+"','"+name+"','"+fName+"','"+dob+"','"+gender+"','"+email+"','"+marrage+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
