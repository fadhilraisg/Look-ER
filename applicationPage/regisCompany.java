package applicationPage;
// import library that need
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import user.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class regisCompany extends JFrame implements ActionListener{
    // declare frame
    JFrame regisComp = new JFrame();
    // declare label
    JLabel regisTxt = new JLabel();
    JLabel nameText = new JLabel();
    JLabel emailText = new JLabel();
    JLabel passText = new JLabel();
    JLabel passComText = new JLabel();
    // declare panel
    JPanel regisPanel = new JPanel();
    JPanel nameTextPanel = new JPanel();
    JPanel nameFillPanel = new JPanel();
    JPanel emailTextPanel = new JPanel();
    JPanel emailFillPanel = new JPanel();
    JPanel passTextPanel = new JPanel();
    JPanel passFillPanel = new JPanel();
    JPanel passComTextPanel = new JPanel();
    JPanel passComFillPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    // declare text fields
    JTextField emailCompFill = new JTextField();
    JTextField nameCompFill = new JTextField();
    // declare password fields
    JPasswordField passCompFill = new JPasswordField();
    JPasswordField passCompCheckFill = new JPasswordField();
    // declare button
    JButton registerButton = new JButton("Register");


    regisCompany(){
        // PANEL registerButton
        regisPanel.add(regisTxt);
        regisPanel.setBounds(0,0,700,100);
        regisPanel.setBackground(new Color(98, 189, 238));
        regisPanel.setVisible(true);

        // PANEL name text
        nameTextPanel.add(nameText);
        nameTextPanel.setBounds(0,100,700,30);
        nameTextPanel.setBackground(new Color(98, 189, 238));
        nameTextPanel.setVisible(true);

        // PANEL name fill
        nameFillPanel.add(nameCompFill);
        nameFillPanel.setBounds(0,130,700,90);
        nameFillPanel.setBackground(new Color(98, 189, 238));
        nameFillPanel.setVisible(true);

        // PANEL email label
        emailTextPanel.add(emailText);
        emailTextPanel.setBounds(0,220,700,30);
        emailTextPanel.setBackground(new Color(98, 189, 238));
        emailTextPanel.setVisible(true);

        // PANEL email fill
        emailFillPanel.add(emailCompFill);
        emailFillPanel.setBounds(0,250,700,90);
        emailFillPanel.setBackground(new Color(98, 189, 238));
        emailFillPanel.setVisible(true);

        // PANEL password text
        passTextPanel.add(passText);
        passTextPanel.setBounds(0,340,700,30);
        passTextPanel.setBackground(new Color(98, 189, 238));
        passTextPanel.setVisible(true);

        // PANEL password fill
        passFillPanel.add(passCompFill);
        passFillPanel.setBounds(0,370,700,90);
        passFillPanel.setBackground(new Color(98, 189, 238));
        passFillPanel.setVisible(true);

        // PANEL confirm password text 
        passComTextPanel.add(passComText);
        passComTextPanel.setBounds(0,460,700,30);
        passComTextPanel.setBackground(new Color(98, 189, 238));
        passComTextPanel.setVisible(true);
        
        // PANEL confirm password fill
        passComFillPanel.add(passCompCheckFill);
        passComFillPanel.setBounds(0,490,700,90);
        passComFillPanel.setBackground(new Color(98, 189, 238));
        passComFillPanel.setVisible(true);

        // PANEL button
        buttonPanel.add(registerButton, BorderLayout.CENTER);
        buttonPanel.setBounds(0,580,700,120);
        buttonPanel.setBackground(new Color(98, 189, 238));
        buttonPanel.setVisible(true);
        
        // LABEL registerButton
        regisTxt.setText("Register Company");
        regisTxt.setVerticalAlignment(JLabel.CENTER);
        regisTxt.setForeground(Color.WHITE);
        regisTxt.setFont(new Font("Roboto", Font.BOLD, 30));
        regisTxt.setVerticalTextPosition(JLabel.TOP);

        // LABEL name text
        nameText.setText("Name : ");
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL email text
        emailText.setText("Email :");
        emailText.setForeground(Color.WHITE);
        emailText.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL password text
        passText.setText("Password :  ");
        passText.setForeground(Color.WHITE);
        passText.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL password comfirm text
        passComText.setText("Confirm Password : ");
        passComText.setForeground(Color.WHITE);
        passComText.setFont(new Font("Roboto", Font.BOLD, 20));

        // TEXT FIELD name
        nameCompFill.setPreferredSize(new Dimension(250,40));

        // TEXT FIELD email
        emailCompFill.setPreferredSize(new Dimension(250,40));

        // PASSWORD FIELD password
        passCompFill.setPreferredSize(new Dimension(250,40));
        passCompFill.setEchoChar('*');

        // PASSWORD FIELD confirm password
        passCompCheckFill.setPreferredSize(new Dimension(250,40));
        passCompCheckFill.setEchoChar('*');

        // BUTTON
        registerButton.addActionListener(this);

        // main frame
        regisComp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regisComp.setSize(700,700);
        regisComp.setLayout(null);
        regisComp.setVisible(true);
        regisComp.setResizable(false);
        regisComp.add(regisPanel);
        regisComp.add(nameTextPanel);
        regisComp.add(nameFillPanel);
        regisComp.add(emailTextPanel);
        regisComp.add(emailFillPanel);
        regisComp.add(passTextPanel);
        regisComp.add(passFillPanel);
        regisComp.add(passComTextPanel);
        regisComp.add(passComFillPanel);
        regisComp.add(buttonPanel);


    }

    


    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource() == registerButton){
            StringBuilder getCompName = new StringBuilder(); // get user name
            StringBuilder getCompEmail = new StringBuilder(); // get user email
            StringBuilder getCompPass = new StringBuilder(); // get user password
            // StringBuilder getComPass = new StringBuilder(); // get user confirm password
       
            try(FileWriter fileWriter = new FileWriter("database/dataUser.txt", true)){

                getCompName.append(nameCompFill.getText()).append("#");
                getCompEmail.append(emailCompFill.getText()).append("#");
                getCompPass.append(passCompFill.getPassword()).append("#C\n");
                // getComPass.append(passCompCheckFill.getPassword()).append("\n");

                String p = new String(passCompCheckFill.getPassword());
                String p1 = new String(passCompFill.getPassword());
                String name = new String(nameCompFill.getText());
                String email = new String(emailCompFill.getText());
                company compan = new company(name,email,p,p1);
                boolean confirm = compan.validationPass(compan.getPass(),compan.getPass2());

                if(confirm == true){
                    fileWriter.append(getCompName.toString());
                    fileWriter.append(getCompEmail.toString());
                    fileWriter.append(getCompPass.toString());
                    // fileWriter.append(getComPass.toString());
                    JOptionPane.showMessageDialog(regisComp, "Register Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    // System.out.println("true");
                    dispose();
                    welcomePage test = new welcomePage();
                }
                else{
                    JOptionPane.showMessageDialog(regisComp, "Register Failed", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                fileWriter.close();

            }
            catch(IOException e1){
            
            }


            
        }
    }       

}
