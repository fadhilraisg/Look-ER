package applicationPage;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectProfile extends JFrame implements ActionListener {
    JFrame selectProfile = new JFrame();
    JLabel logoProject = new JLabel();
    JPanel mainPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    ImageIcon logo = new ImageIcon("./assets/logo.png");
    JButton btnApplicant = new JButton("Applicant");
    JButton btnCompany = new JButton("Company");
    JPanel panelApplicant = new JPanel();
    JPanel panelCompany = new JPanel();

    selectProfile(){
        // main panel
        mainPanel.add(logoProject);
        mainPanel.setBounds(0,0,700,500);
        mainPanel.setBackground(new Color(98, 189, 238));

        // button for Applicant
        btnApplicant.setFocusable(false);
        btnApplicant.setBounds(10, 16, 20, 40);
        btnApplicant.addActionListener(this);

        // button for Company
        btnCompany.setFocusable(false);
        btnCompany.addActionListener(this);

        // button panel for Applicant
        panelApplicant.add(btnApplicant);
        panelApplicant.setBackground(new Color(98, 189, 238));
        panelApplicant.setBounds(0, 500,700,40);

        // button panel for Company
        panelCompany.add(btnCompany);
        panelCompany.setBackground(new Color(98, 189, 238));
        panelCompany.setBounds(0,540,700,160);

        // select profile frame
        selectProfile.setLayout(null);
        selectProfile.setVisible(true);
        selectProfile.setSize(700, 700);
        selectProfile.setTitle("Look - Er");
        selectProfile.setResizable(false);
        selectProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectProfile.add(mainPanel);
        selectProfile.add(panelApplicant);
        selectProfile.add(panelCompany);

        // label for logo project
        logoProject.setIcon(logo);
        logoProject.setHorizontalAlignment(JLabel.CENTER);
        logoProject.setVerticalAlignment(JLabel.TOP);
        logoProject.setText("Register As : ");
        logoProject.setHorizontalTextPosition(JLabel.CENTER);
        logoProject.setVerticalTextPosition(JLabel.BOTTOM);
        logoProject.setIconTextGap(-50);
        logoProject.setFont(new Font("Roboto", Font.BOLD, 20));
        logoProject.setForeground(Color.white);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnApplicant){
            dispose();
            regisApplicant newApplicant = new regisApplicant();
        }
        else if(e.getSource() == btnCompany){
            
            regisCompany newCompany = new regisCompany();

        }
        dispose();
        
    }
    
}

