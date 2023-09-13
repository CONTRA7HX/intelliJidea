package BMS;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener
{
    JTextField nameTextfield,fnameTextfield,emailTextfield,AddressTextfield,cityTextfield,stateTextfield,pincodeTextfield;
    JRadioButton male,female,others,married,unmarried;
    JButton next;
    JDateChooser dateChooser;
    long random;
    Signup()
    {
        setLayout(null);

        Random ran = new Random();
         random = Math.abs(ran.nextLong() % 9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 30));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextfield  = new JTextField();
        nameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextfield.setBounds(300,140,400,30);
        add(nameTextfield);


        JLabel fname = new JLabel("Fathers Name ");
        fname.setFont(new Font("Raleway", Font.BOLD, 30));
        fname.setBounds(100,190,240,30);
        add(fname);

        fnameTextfield  = new JTextField();
        fnameTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextfield.setBounds(300,190,400,30);
        add(fnameTextfield);


        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 30));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105,105));
        add(dateChooser);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 30));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.CYAN);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.CYAN);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway", Font.BOLD, 30));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextfield  = new JTextField();
        emailTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextfield.setBounds(300,340,400,30);
        add(emailTextfield);


        JLabel marital  = new JLabel("Marital Status");
        marital.setFont(new Font("Raleway", Font.BOLD, 30));
        marital.setBounds(100,390,230,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.CYAN);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.CYAN);
        add(unmarried);

        others = new JRadioButton("Others");
        others.setBounds(650,390,120,30);
        others.setBackground(Color.CYAN);
        add(others);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);


        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Raleway", Font.BOLD, 30));
        Address.setBounds(100,440,200,30);
        add(Address);

        AddressTextfield  = new JTextField();
        AddressTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        AddressTextfield.setBounds(300,440,400,30);
        add(AddressTextfield);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 30));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextfield  = new JTextField();
        cityTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextfield.setBounds(300,490,400,30);
        add(cityTextfield);


        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 30));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextfield  = new JTextField();
        stateTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextfield.setBounds(300,540,400,30);
        add(stateTextfield);


        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 30));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeTextfield  = new JTextField();
        pincodeTextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextfield.setBounds(300,590,400,30);
        add(pincodeTextfield);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public  void  actionPerformed(ActionEvent ae) {
        String formno = "" + random; // long
        String name = nameTextfield.getText(); //setText
        String fname = fnameTextfield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextfield.getText();
        String marital = null;
        if (married.isSelected())
        {
            marital = "Married";
        } else if (unmarried.isSelected())
        {
            marital =  "Unmarried";
        }
        else if (others.isSelected())
        {
            marital = "Others";
        }
        String Address = AddressTextfield.getText();
        String city = cityTextfield.getText();
        String  state = stateTextfield.getText();
        String pin = pincodeTextfield.getText();

        try {
            if (name.equals(""))
            {
                JOptionPane.showMessageDialog(null,"name is required");
            }
            else
            {
                Connec c = new Connec();
                String query  = "insert into signup value('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+Address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args)
    {
        new Signup();
    }
}
