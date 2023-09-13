package BMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


public class Withdrawl extends JFrame implements ActionListener
{
    JTextField amount;
    JButton back,withdrawl;
    String pinno;



    Withdrawl(String pinno)
    {
        this.pinno =pinno;
        setLayout(null);


        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdrawl");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);

        withdrawl= new JButton("Withdraw");
        withdrawl.setBounds(355,485,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("Back");
        back.setBounds(355,518,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(100,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == withdrawl)
        {
            String number = amount.getText();
            Date date = new Date();
            if (number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT IF YOU WANT DEPOSIT" );
            }else {
                try {

                    Connec conn = new Connec();
                    String query = "insert into bank values ('" + pinno + "','" + date + "', 'Withdrawl','" + number + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + number + " Withdrawl Successfully");
                    setVisible(false);
                    new Transactions(pinno).setVisible(true);
                }catch (Exception e)
                {
                    System.out.println(e);
                }


            }
        }

        else if (ae.getSource() == back)
        {
            new Transactions(pinno).setVisible(true);
        }
    }

    public static void main(String[] args)
    {
        new Deposit("");
    }
}
