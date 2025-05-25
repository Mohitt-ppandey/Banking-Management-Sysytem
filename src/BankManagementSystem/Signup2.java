package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    String formNo;

    JTextField field1,field2,field3;
    JRadioButton r1,r2,r3,r4;
    JButton btn;

    Signup2(String first){

        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(160,5,100,100);
        add(image);

        this.formNo = first;

        //add label1
        JLabel label1 = new JLabel("Form No." + formNo);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Falaway",Font.BOLD,14));
        label1.setBounds(680,0,100,40);
        add(label1);

        //add label2
        JLabel label2 = new JLabel("Page 2 :-");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Falaway",Font.BOLD,20));
        label2.setBounds(340,10,100,100);
        add(label2);

        //add label3
        JLabel label3 = new JLabel("Additional Details:-");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Falaway",Font.BOLD,20));
        label3.setBounds(340,40,400,100);
        add(label3);

        //add label4
        JLabel label4 = new JLabel("Religion :");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Falaway",Font.BOLD,16));
        label4.setBounds(120,120,100,30);
        add(label4);

        String[] religion = {"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHERS"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(105,185,105));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,120,320,30);
        add(comboBox1);


        //add label5
        JLabel label5 = new JLabel("Category :");
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("Falaway",Font.BOLD,16));
        label5.setBounds(120,170,100,30);
        add(label5);

        String[] category = {"General","OBC","SC","ST","OTHERS"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(105,185,105));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);


        //add label6
        JLabel label6 = new JLabel("Income :");
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("Falaway",Font.BOLD,16));
        label6.setBounds(120,220,100,30);
        add(label6);

        String[] incone = {"Less than 1 lakh","Less than 5 lakhs","Less than 9 lakh","Above"};
        comboBox3 = new JComboBox(incone);
        comboBox3.setBackground(new Color(105,185,105));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        //add label7
        JLabel label7 = new JLabel("Educational :" );
        label7.setForeground(Color.BLACK);
        label7.setFont(new Font("Falaway",Font.BOLD,16));
        label7.setBounds(120,270,100,30);
        add(label7);

        String[] educational = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","OTHERS"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(105,185,105));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);


        //add label8
        JLabel label8 = new JLabel("Occupation :" );
        label8.setForeground(Color.BLACK);
        label8.setFont(new Font("Falaway",Font.BOLD,16));
        label8.setBounds(120,320,100,30);
        add(label8);

        String[] occupation = {"Student","Salaried","Self-Employed","Busness","Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(105,185,105));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);




        //add label9
        JLabel label9 = new JLabel("PAN Number :" );
        label9.setForeground(Color.BLACK);
        label9.setFont(new Font("Falaway",Font.BOLD,16));
        label9.setBounds(120,370,200,30);
        add(label9);

        //add field
        field1 = new JTextField();
        field1.setBackground(new Color(105,175,105));
        field1.setFont(new Font("Raleway",Font.BOLD,14));
        field1.setBounds(350,370,320,30);
        add(field1);


        //add label10
        JLabel label10 = new JLabel("Aadhar Number :" );
        label10.setForeground(Color.BLACK);
        label10.setFont(new Font("Falaway",Font.BOLD,16));
        label10.setBounds(120,420,200,30);
        add(label10);

        //add field
        field2 = new JTextField();
        field2.setBackground(new Color(105,175,105));
        field2.setFont(new Font("Raleway",Font.BOLD,14));
        field2.setBounds(350,420,320,30);
        add(field2);


        //add label11
        JLabel label11 = new JLabel("Senior Citizen :" );
        label11.setForeground(Color.BLACK);
        label11.setFont(new Font("Falaway",Font.BOLD,16));
        label11.setBounds(120,470,200,30);
        add(label11);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(105,185,105));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(105,185,105));
        r2.setBounds(450,470,100,30);
        add(r2);

        ButtonGroup bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //add label12
        JLabel label12 = new JLabel("Existing Account :" );
        label12.setForeground(Color.BLACK);
        label12.setFont(new Font("Falaway",Font.BOLD,16));
        label12.setBounds(120,520,200,30);
        add(label12);

        r3 = new JRadioButton("Yes");
        r3.setBackground(new Color(105,185,105));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBackground(new Color(105,185,105));
        r4.setBounds(450,520,100,30);
        add(r4);

        ButtonGroup bg1 =new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);


        btn = new JButton("Next");
        btn.setForeground(Color.BLACK);
        btn.setBackground(Color.WHITE);
        btn.setFont(new Font("Raleway",Font.BOLD,14));
        btn.setBounds(570,600,100,30);
        btn.addActionListener(this);
        add(btn);





        setLayout(null);
       setSize(850,750);
       setLocation(400,40);
       getContentPane().setBackground(new Color(105,185,104));
       setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String form = formNo;
        String rel = (String)comboBox1.getSelectedItem();
        String categ = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = field1.getText();
        String aadhar = field2.getText();

        String sCitizen = null;
        if (r1.isSelected()){
            sCitizen = "Yes";
        } else if (r2.isSelected()) {
            sCitizen = "No";
        }

        String exAccount = null;
        if (r3.isSelected()){
            exAccount = "Yes";
        } else if (r4.isSelected()) {
            exAccount = "No";
        }

        try {
            if (field1.getText().equals("") || field2.getText().equals("")){
                JOptionPane.showConfirmDialog(null,"ill all the related document");
            }else {
                con c1 = new con();
                String r = "Insert into signuptwo values ('"+form+"','"+rel+"','"+categ+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+sCitizen+"','"+exAccount+"')";
                c1.statement.executeUpdate(r);
                new Signup3(form);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
