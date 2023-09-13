package BMS;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LogIN extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pintextfeild;

    LogIN() {
        setTitle("Automated TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osword", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card NO");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("Pin No");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 400, 40);
        add(pin);

        pintextfeild = new JPasswordField();
        pintextfeild.setBounds(300, 220, 230, 30);
        add(pintextfeild);

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pintextfeild.setText("");

        } else if (ae.getSource() == login) {
            Connec conn = new Connec();
            String cardnumber = cardTextField.getText();
            String pinno = pintextfeild.getText();
            String query = "Select * from login where cardnumber = '" + cardnumber + "'and pin = '" + pinno + "'";
            try {

                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transactions(pinno).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card Number or pin");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == signup) {
                setVisible(false);
                new Signup().setVisible(true);
            }
        }

    public static void main(String[] args) {
        new LogIN();
    }
}


