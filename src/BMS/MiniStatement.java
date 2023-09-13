package BMS;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame
{
    MiniStatement(String pinno)
    {
        setTitle("MINI STATEMENT");
        setLayout(null);

        JLabel mini = new JLabel();
        add(mini);

        JLabel bank = new JLabel("INDIAN BANK");
        bank.setBounds(20,80,300,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);

        try
        {
            Connec conn = new Connec();

            int bal = 0;            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinno+"'");
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber".substring(12)));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try {
                Connec conn = new Connec();
                int bal = 0;
                ResultSet rs = conn.s.executeQuery("select * from bank where pin ='"+pinno+"'");
                while (rs.next())
                {
                    mini.setText(mini.getText() + "<html>" +rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+"<br><br><html>");
                    if (rs.getString("type").equals("deposit"))
                    {
                        bal += Integer.parseInt(rs.getString("amount")); //string to integer
                    }
                    else {
                        bal -= Integer.parseInt(rs.getString("amount"));
                    }

                }
                balance.setText("Your current balance account is Rs " +bal);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);

        setSize(400,600);
        setLocation(230,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new MiniStatement("");
    }
}
