package applicationPage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import assets.loginUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.IOException;
import java.util.*;


public class pageForLogin extends JFrame implements ActionListener{
    
        //declare frame
        JFrame loginFrame = new JFrame();
        // declare label
        JLabel logoProject = new JLabel();
        JLabel emailLabel = new JLabel();
        JLabel passLabel = new JLabel();
        // declare panel
        JPanel mainPanel = new JPanel();
        JPanel emailLabelPanel = new JPanel();
        JPanel passLabelPanel = new JPanel();
        JPanel emailPanel = new JPanel();
        JPanel passPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        // declare image
        ImageIcon logo = new ImageIcon("./assets/logo.png");
        // declare textfield
        JTextField txtEmail = new JTextField();
        JPasswordField txtPass = new JPasswordField();
        // declare button
        JButton loginButton = new JButton("Login");

    pageForLogin(){


        //main panel
        mainPanel.add(logoProject);
        mainPanel.setBounds(0,0,700,400);
        mainPanel.setBackground(new Color(98, 189, 238));
        mainPanel.setVisible(true);
        
        //panel for label email
        emailLabelPanel.setBounds(0,400,700,30);
        emailLabelPanel.setBackground(new Color(98, 189, 238));
        emailLabelPanel.setVisible(true);
        emailLabelPanel.add(emailLabel);
        
        //panel for textfield email
        emailPanel.setBounds(0,430,700,50);
        emailPanel.setBackground(new Color(98, 189, 238));
        emailPanel.setVisible(true);
        emailPanel.add(txtEmail);
        
        // panel for label password
        passLabelPanel.setBounds(0,480,700,30);
        passLabelPanel.setBackground(new Color(98, 189, 238));
        passLabelPanel.setVisible(true);
        passLabelPanel.add(passLabel);
        
        
        // panel for txtfield password
        passPanel.setBounds(0,510,700,50);
        passPanel.setBackground(new Color(98, 189, 238));
        passPanel.setVisible(true);
        passPanel.add(txtPass);
        
        
        // panel for login button
        buttonPanel.setBounds(0,560,700,140);
        buttonPanel.setBackground(new Color(98, 189, 238));
        buttonPanel.setVisible(true);
        buttonPanel.add(loginButton, BorderLayout.CENTER);
        
        
        // label for email
        emailLabel.setText("Email : ");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        
        // label for password
        passLabel.setText("Password : ");
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        // login button
        loginButton.setBounds(300,600,100,50);
        loginButton.addActionListener(this);



        //textfield email
        txtEmail.setPreferredSize(new Dimension(250,40));
        //textfield passowrd
        txtPass.setPreferredSize(new Dimension(250,40));
        txtPass.setEchoChar('*');

        //Logo
        logoProject.setIcon(logo);
        logoProject.setHorizontalAlignment(JLabel.CENTER);
        logoProject.setVerticalAlignment(JLabel.TOP);
    
        
        //Login Frame
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(700,700);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
        loginFrame.add(mainPanel);
        loginFrame.add(emailLabelPanel);
        loginFrame.add(emailPanel);
        loginFrame.add(passLabelPanel);
        loginFrame.add(passPanel);
        loginFrame.add(buttonPanel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            try{
                int temp = 0;
                String LoginName = new String(txtEmail.getText());
                String LoginPass = new String(txtPass.getPassword());
                File dataLogin = new File("database/dataUser.txt");
                Scanner reader = new Scanner(dataLogin);
                while(reader.hasNextLine()){
                    String dataRead = reader.nextLine();
                    String[] userA = dataRead.split("#");
                    String nama = userA[0];
                    String email = userA[1];
                    String pass = userA[2];
                    String type = userA[3];


                    loginUser Rn = new loginUser(email, pass, type);
                    if(Rn.getEmail().equals(LoginName) && Rn.getPass().equals(LoginPass)){
                        if(Rn.getType().equals("C")){
                            temp = 1;
                            break;


                        }else if (Rn.getType().equals("A")){
                            temp = 2;
                            break;
                        }
                        
                    }
                }
                if(temp == 0){
                    JOptionPane.showMessageDialog(loginFrame, "Login Failed", "Failed", JOptionPane.ERROR_MESSAGE);
                }
                else if(temp == 1){
                    JOptionPane.showMessageDialog(loginFrame, "Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    mainPageComp test = new mainPageComp();

                }
                if(temp == 2 ){
                    JOptionPane.showMessageDialog(loginFrame, "Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    mainPageApp3 test = new mainPageApp3();

                }

                reader.close();
            }catch(IOException e1){
                
            }
            
        }
        
        
    }
    
}
