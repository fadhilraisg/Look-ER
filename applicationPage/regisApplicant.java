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

import user.applicant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class regisApplicant extends JFrame implements ActionListener{
    // declare frame
    JFrame regisApp = new JFrame();
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
    JTextField emailFill = new JTextField();
    JTextField nameFill = new JTextField();
    // declare password fields
    JPasswordField passFill = new JPasswordField();
    JPasswordField passComFill = new JPasswordField();
    // declare button
    JButton registerButton = new JButton("Register");


    regisApplicant(){
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
        nameFillPanel.add(nameFill);
        nameFillPanel.setBounds(0,130,700,90);
        nameFillPanel.setBackground(new Color(98, 189, 238));
        nameFillPanel.setVisible(true);

        // PANEL email label
        emailTextPanel.add(emailText);
        emailTextPanel.setBounds(0,220,700,30);
        emailTextPanel.setBackground(new Color(98, 189, 238));
        emailTextPanel.setVisible(true);

        // PANEL email fill
        emailFillPanel.add(emailFill);
        emailFillPanel.setBounds(0,250,700,90);
        emailFillPanel.setBackground(new Color(98, 189, 238));
        emailFillPanel.setVisible(true);

        // PANEL password text
        passTextPanel.add(passText);
        passTextPanel.setBounds(0,340,700,30);
        passTextPanel.setBackground(new Color(98, 189, 238));
        passTextPanel.setVisible(true);

        // PANEL password fill
        passFillPanel.add(passFill);
        passFillPanel.setBounds(0,370,700,90);
        passFillPanel.setBackground(new Color(98, 189, 238));
        passFillPanel.setVisible(true);

        // PANEL confirm password text 
        passComTextPanel.add(passComText);
        passComTextPanel.setBounds(0,460,700,30);
        passComTextPanel.setBackground(new Color(98, 189, 238));
        passComTextPanel.setVisible(true);
        
        // PANEL confirm password fill
        passComFillPanel.add(passComFill);
        passComFillPanel.setBounds(0,490,700,90);
        passComFillPanel.setBackground(new Color(98, 189, 238));
        passComFillPanel.setVisible(true);

        // PANEL button
        buttonPanel.add(registerButton, BorderLayout.CENTER);
        buttonPanel.setBounds(0,580,700,120);
        buttonPanel.setBackground(new Color(98, 189, 238));
        buttonPanel.setVisible(true);
        
        // LABEL registerButton
        regisTxt.setText("Register Applicant");
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
        nameFill.setPreferredSize(new Dimension(250,40));

        // TEXT FIELD email
        emailFill.setPreferredSize(new Dimension(250,40));

        // PASSWORD FIELD password
        passFill.setPreferredSize(new Dimension(250,40));
        passFill.setEchoChar('*');

        // PASSWORD FIELD confirm password
        passComFill.setPreferredSize(new Dimension(250,40));
        passComFill.setEchoChar('*');

        // BUTTON
        registerButton.addActionListener(this);

        // main frame
        regisApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regisApp.setSize(700,700);
        regisApp.setLayout(null);
        regisApp.setVisible(true);
        regisApp.add(regisPanel);
        regisApp.add(nameTextPanel);
        regisApp.add(nameFillPanel);
        regisApp.add(emailTextPanel);
        regisApp.add(emailFillPanel);
        regisApp.add(passTextPanel);
        regisApp.add(passFillPanel);
        regisApp.add(passComTextPanel);
        regisApp.add(passComFillPanel);
        regisApp.add(buttonPanel);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource() == registerButton){
            StringBuilder getName = new StringBuilder(); // get user name
            StringBuilder getEmail = new StringBuilder(); // get user email
            StringBuilder getPass = new StringBuilder(); // get user password
            // StringBuilder getComPass = new StringBuilder(); // get user confirm password
       
            try(FileWriter fileWriter = new FileWriter("database/dataUser.txt", true)){

                getName.append(nameFill.getText()).append("#");
                getEmail.append(emailFill.getText()).append("#");
                getPass.append(passFill.getPassword()).append("#A\n");
                // getComPass.append(passComFill.getPassword()).append("\n");

                String p = new String(passComFill.getPassword());
                String p1 = new String(passFill.getPassword());
                String name = new String(nameFill.getText());
                String email = new String(emailFill.getText());
                applicant appli = new applicant(name,email,p,p1);
                boolean confirm = appli.validationPass(appli.getPass(),appli.getPass2());

                if(confirm == true){
                    fileWriter.append(getName.toString());
                    fileWriter.append(getEmail.toString());
                    fileWriter.append(getPass.toString());
                    // fileWriter.append(getComPass.toString());
                    JOptionPane.showMessageDialog(regisApp, "Register Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    // System.out.println("true");
                }
                
                else{
                    JOptionPane.showMessageDialog(regisApp, "Register Failed", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                dispose();
                welcomePage test = new welcomePage();
                fileWriter.close();

            }
            catch(IOException e1){
            
            }


            
        }
    }       

}