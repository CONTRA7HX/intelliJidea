package BMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends  JFrame implements ActionListener
{
    JRadioButton r1,r2,r3,r4;
    JCheckBox a1,a2,a3,a4,a5,a6,a7;

    JButton submit,cancel;
    String formno;


    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("page 3: Account Details");
        l1.setFont(new Font("raleway", Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("page 3: Account Type");
        type.setFont(new Font("raleway", Font.BOLD,22));
        type.setBounds(100,140,250,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway,",Font.BOLD,16));
        r1.setBackground(Color.CYAN);
        r1.setBounds(100,180,150,20);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway,",Font.BOLD,16));
        r2.setBackground(Color.CYAN);
        r2.setBounds(350,180,150,20);
        add(r2);

        r3 = new JRadioButton("Fixed deposit Account");
        r3.setFont(new Font("Raleway,",Font.BOLD,16));
        r3.setBackground(Color.CYAN);
        r3.setBounds(100,220,200,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway,",Font.BOLD,16));
        r4.setBackground(Color.CYAN);
        r4.setBounds(350,220,250,20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card no");
        card.setFont(new Font("raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway",Font.BOLD,22));
        number.setBounds(330,300,280,30);
        add(number);

        JLabel details = new JLabel("Your 16 Digit Card No");
        details.setFont(new Font("raleway",Font.BOLD,12));
        details.setBounds(100,320,300,30);
        add(details);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,350,200,30);
        add(pin);


        JLabel pnumber = new JLabel("XX44");
        pnumber.setFont(new Font("raleway",Font.BOLD,22));
        pnumber.setBounds(330,350,280,30);
        add(pnumber);

        JLabel pno = new JLabel("your 4 Digit Pin");
        pno.setFont(new Font("raleway",Font.BOLD,12));
        pno.setBounds(100,370,280,30);
        add(pno);

        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("raleway",Font.BOLD,22));
        services.setBounds(100,400,250,30);
        add(services);
        a1 = new JCheckBox("Atm Card");
        a1.setBackground(Color.CYAN);
        a1.setFont(new Font("Raleway",Font.BOLD,16));
        a1.setBounds(100,450,150,30);
        add(a1);

        a2 = new JCheckBox("CHEQUE-BOOK");
        a2.setBackground(Color.CYAN);
        a2.setFont(new Font("Raleway",Font.BOLD,16));
        a2.setBounds(100,500,150,30);
        add(a2);


        a3 = new JCheckBox("INTERNET BANKING");
        a3.setBackground(Color.CYAN);
        a3.setFont(new Font("Raleway",Font.BOLD,16));
        a3.setBounds(100,550,185,30);
        add(a3);

        a4 = new JCheckBox("MOBILE BANKING");
        a4.setBackground(Color.CYAN);
        a4.setFont(new Font("Raleway",Font.BOLD,16));
        a4.setBounds(300,450,180,30);
        add(a4);

        a5 = new JCheckBox("SMS-ALERT");
        a5.setBackground(Color.CYAN);
        a5.setFont(new Font("Raleway",Font.BOLD,16));
        a5.setBounds(300,500,150,30);
        add(a5);

        a6 = new JCheckBox("E STATEMENT");
        a6.setBackground(Color.CYAN);
        a6.setFont(new Font("Raleway",Font.BOLD,16));
        a6.setBounds(300,550,150,30);
        add(a6);

        a7 = new JCheckBox("i here by declare that the above entered details are correct to the best of my knowledge ");
        a7.setBackground(Color.LIGHT_GRAY);
        a7.setFont(new Font("Raleway",Font.BOLD,16));
        a7.setBounds(100,650,500,30);
        a7.addActionListener(this);
        add(a7);

        submit = new JButton("Submit");
        submit.setBackground(Color.CYAN);
        submit.setForeground(Color.black);
        submit.setFont(new Font ("Raleway",Font.BOLD,14));
        submit.setBounds(420,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.CYAN);
        cancel.setForeground(Color.black);
        cancel.setFont(new Font ("Raleway",Font.BOLD,14));
        cancel.setBounds(300,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);



        setSize(850,820);
        setLocation(350,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == submit)
        {
            String accounttype = null;
            if (r1.isSelected())
            {
                accounttype ="Saving Account";
            } else if (r2.isSelected())
            {
                accounttype = "Current Account";
            }
            else if (r3.isSelected())
            {
               accounttype = "Fixed Deposit Account";
            }
            else if (r4.isSelected())
            {
                accounttype = "Recurring Deposit Account";
            }

            Random random = new Random();
            String cardnumber ="" + Math.abs ((random.nextLong() %90000000L) + 5040936000000000L);

            String pinno = "" + Math.abs ((random.nextLong() %9000L) + 1000L);

            String facility = "";
            if (a1.isSelected())
            {
                facility = facility + "Atm Card";
            } else if (a2.isSelected())
            {
                facility = facility + "CHEQUE-BOOK ";
            } else if (a3.isSelected())
            {
                facility = facility +"INTERNET BANKING";
            } else if (a4.isSelected())
            {
                facility = facility + "MOBILE BANKING";
            } else if (a5.isSelected())
            {
                facility = facility + "SMS - ALERT";
            } else if (a6.isSelected())
            {
                facility = facility +"E STATEMENT";
            }
            try {
                if (accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else {
                    Connec conn = new Connec();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinno+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinno+"')";


                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"card number: " + cardnumber +  "\n pin: " + pinno);

                }
            }catch (Exception e)
            {
                System.out.println(e);
            }

        }
        else if (ae.getSource() == cancel)
        {

        }
    }

    public static void main(String[] args)
    {
        new SignupThree("");

    }
}
