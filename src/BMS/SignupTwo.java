package BMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener
{
    JTextField panno,adhar;
    JRadioButton syes , exis , sno,esyes,esno;
    JComboBox religion,cat,inc,edu,occup;
    String formno;

    JButton next;
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION - PAGE 2 ");


        JLabel additionalDetails = new JLabel("Page 1: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 30));
        name.setBounds(100,140,150,30);
        add(name);

        String valReligion[] = {"Hindu", "Muslim" , "Cristian" , "Sikh","Others"};
          religion = new JComboBox(valReligion);
        religion.setBounds(300,140,100,30);
        religion.setBackground(Color.CYAN);
        add(religion);


        JLabel category = new JLabel("Category ");
        category.setFont(new Font("Raleway", Font.BOLD, 30));
        category.setBounds(100,190,240,30);
        add(category);

        String valcategory[] = {"General", "OBC" , " St", "Sc", "Others"};
         cat = new JComboBox(valcategory);
        cat.setBounds(300,190,100,30);
        cat.setBackground(Color.CYAN);
        add(cat);


        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 30));
        income.setBounds(100,240,200,30);
        add(income);

        String valincome[] = {"Null", "<150000" , "<2,50000", "500000", "UPTO 1000000"};
         inc = new JComboBox(valincome);
        inc.setBounds(300,240,100,30);
        inc.setBackground(Color.CYAN);
        add(inc);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 30));
        education.setBounds(100,290,200,30);
        add(education);


        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 30));
        qualification.setBounds(100,330,200,30);
        add(qualification);

        String educationValues[] = {"Non Graduation", "10th pass" , " 12th pass", "UG", "PG", "PHD","Others"};
         edu = new JComboBox(educationValues);
        edu.setBounds(300,330,100,30);
        edu.setBackground(Color.CYAN);
        add(edu);


        JLabel occupation  = new JLabel("Occupation");
        occupation.setFont(new Font("Raleway", Font.BOLD, 30));
        occupation.setBounds(100,390,230,30);
        add(occupation);

        String valoccup[] = {"self salaried", "businesssman" , " govt employee", "pensioner", "Others"};
         occup = new JComboBox(valoccup);
        occup.setBounds(300,390,100,30);
        occup.setBackground(Color.CYAN);
        add(occup);


        JLabel pan = new JLabel("Pan No:");
        pan.setFont(new Font("Raleway", Font.BOLD, 30));
        pan.setBounds(100,440,200,30);
        add(pan);

         panno = new JTextField();
        panno.setFont(new  Font("raleway", Font.BOLD,14));
        panno.setBounds(300,440,200,30);
        add(panno);


        JLabel senior = new JLabel("Senior citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 30));
        senior.setBounds(100,490,250,30);
        add(senior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,490,50,30);
        syes.setBackground(Color.CYAN);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400,490,50,30);
        sno.setBackground(Color.CYAN);
        add(sno);

        ButtonGroup ses = new ButtonGroup();
        ses.add(syes);
        ses.add(sno);



        JLabel Existing = new JLabel("Existing Account:");
        Existing.setFont(new Font("Raleway", Font.BOLD, 30));
        Existing.setBounds(100,540,250,30);
        add(Existing);

        esyes = new JRadioButton("Yes");
        esyes.setBounds(300,540,50,30);
        esyes.setBackground(Color.CYAN);
        add(esyes);

        esno = new JRadioButton("No");
        esno.setBounds(400,540,50,30);
        esno.setBackground(Color.CYAN);
        add(esno);

        ButtonGroup eses = new ButtonGroup();
        eses.add(esyes);
        eses.add(esno);

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
        String sreligion = (String) religion.getSelectedItem(); //setText
        String scat =  (String) cat.getSelectedItem();
        String sincome  = (String) inc.getSelectedItem();
        String sedu  = (String) edu.getSelectedItem();
        String soccup = (String) occup.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existing = null;
        if (esyes.isSelected())
        {
            existing = "Yes";
        } else if (esno.isSelected())
        {
            existing =  "No";
        }

        String spanno = panno.getText();


        try {

                Connec c = new Connec();
                String query  = "insert into signuptwo value('"+formno+"', '"+sreligion+"', '"+scat+"', '"+sincome+"', '"+sedu+"', '"+soccup+"', '"+spanno+"', '"+seniorcitizen+"', '"+existing+"')";
                c.s.executeUpdate(query);

                //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args)
    {
        new SignupTwo("");
    }
}
