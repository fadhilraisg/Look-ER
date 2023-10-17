package applicationPage;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class welcomePage extends JFrame implements ActionListener {

    JButton btnYes = new JButton("Yes");;
    JButton  btnNo = new JButton("No");;
    JLabel logoProject = new JLabel();
    JPanel mainPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    ImageIcon logo = new ImageIcon("./assets/logo.png");
    
    public welcomePage() {
        // main panel
        mainPanel.add(logoProject);
        mainPanel.setBounds(0,0,700,500);
        mainPanel.setBackground(new Color(98, 189, 238));

        // panel for button
        btnPanel.add(btnYes);
        btnPanel.add(btnNo);
        btnPanel.setBackground(new Color(98, 189, 238));
        btnPanel.setBounds(0,500,700,200);

        // button yes
        btnYes.setFocusable(false);
        btnYes.setBounds(10, 16, 20, 4);
        btnYes.addActionListener(this);
        
        // button no
        btnNo.setFocusable(false);
        btnNo.addActionListener(this);
        
        // logo
        logoProject.setIcon(logo);
        logoProject.setHorizontalAlignment(JLabel.CENTER);
        logoProject.setVerticalAlignment(JLabel.TOP);
        logoProject.setText("Do you have an account?");
        logoProject.setHorizontalTextPosition(JLabel.CENTER);
        logoProject.setVerticalTextPosition(JLabel.BOTTOM);
        logoProject.setIconTextGap(-50);
        logoProject.setFont(new Font("Roboto", Font.BOLD, 20));
        logoProject.setForeground(Color.white);
        
        // main frame
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(700, 700);
        this.setTitle("Look - Er");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mainPanel);
        this.add(btnPanel);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnYes){
            dispose();
            pageForLogin login = new pageForLogin();
        }
        else if(e.getSource() == btnNo){
            dispose();
            selectProfile select = new selectProfile();
        }

    }

}
