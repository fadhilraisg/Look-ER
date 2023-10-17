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
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class addJobFrame extends JFrame implements ActionListener {
    // declare frame
    JFrame addJob = new JFrame();
    // declare label
    JLabel addTxt = new JLabel();
    JLabel cNameTxt = new JLabel();
    JLabel positionTxt = new JLabel();
    JLabel salaryTxt = new JLabel();
    JLabel cityTxt = new JLabel();
    // declare panel
    JPanel addJobPanel = new JPanel();
    JPanel cNameTxtPanel = new JPanel();
    JPanel cNameFillPanel = new JPanel();
    JPanel positionTxtPanel = new JPanel();
    JPanel positionFillPanel = new JPanel();
    JPanel salaryTxtPanel = new JPanel();
    JPanel salaryFillPanel = new JPanel();
    JPanel cityTxtPanel = new JPanel();
    JPanel cityFillPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    // declare text fields
    JTextField positionFill = new JTextField();
    JTextField cNameFill = new JTextField();
    JTextField salaryFill = new JTextField();
    JTextField cityFill = new JTextField();
    // declare button
    JButton addButton = new JButton("Post");

    addJobFrame() {
        // PANEL addJobPanel
        addJobPanel.add(addTxt);
        addJobPanel.setBounds(0, 0, 700, 100);
        addJobPanel.setBackground(new Color(98, 189, 238));
        addJobPanel.setVisible(true);

        // PANEL company name text
        cNameTxtPanel.add(cNameTxt);
        cNameTxtPanel.setBounds(0, 100, 700, 30);
        cNameTxtPanel.setBackground(new Color(98, 189, 238));
        cNameTxtPanel.setVisible(true);

        // PANEL company name textfield
        cNameFillPanel.add(cNameFill);
        cNameFillPanel.setBounds(0, 130, 700, 90);
        cNameFillPanel.setBackground(new Color(98, 189, 238));
        cNameFillPanel.setVisible(true);

        // PANEL position text
        positionTxtPanel.add(positionTxt);
        positionTxtPanel.setBounds(0, 220, 700, 30);
        positionTxtPanel.setBackground(new Color(98, 189, 238));
        positionTxtPanel.setVisible(true);

        // PANEL position textfields
        positionFillPanel.add(positionFill);
        positionFillPanel.setBounds(0, 250, 700, 90);
        positionFillPanel.setBackground(new Color(98, 189, 238));
        positionFillPanel.setVisible(true);

        // PANEL salary text
        salaryTxtPanel.add(salaryTxt);
        salaryTxtPanel.setBounds(0, 340, 700, 30);
        salaryTxtPanel.setBackground(new Color(98, 189, 238));
        salaryTxtPanel.setVisible(true);

        // PANEL salary textfields
        salaryFillPanel.add(salaryFill);
        salaryFillPanel.setBounds(0, 370, 700, 90);
        salaryFillPanel.setBackground(new Color(98, 189, 238));
        salaryFillPanel.setVisible(true);

        // PANEL confirm password text
        cityTxtPanel.add(cityTxt);
        cityTxtPanel.setBounds(0, 460, 700, 30);
        cityTxtPanel.setBackground(new Color(98, 189, 238));
        cityTxtPanel.setVisible(true);

        // PANEL confirm password fill
        cityFillPanel.add(cityFill);
        cityFillPanel.setBounds(0, 490, 700, 90);
        cityFillPanel.setBackground(new Color(98, 189, 238));
        cityFillPanel.setVisible(true);

        // PANEL button
        buttonPanel.add(addButton, BorderLayout.CENTER);
        buttonPanel.setBounds(0, 580, 700, 120);
        buttonPanel.setBackground(new Color(98, 189, 238));
        buttonPanel.setVisible(true);

        // LABEL addButton
        addTxt.setText("Post A Job");
        addTxt.setVerticalAlignment(JLabel.CENTER);
        addTxt.setForeground(Color.WHITE);
        addTxt.setFont(new Font("Roboto", Font.BOLD, 30));
        addTxt.setVerticalTextPosition(JLabel.TOP);

        // LABEL name text
        cNameTxt.setText("Company Name : ");
        cNameTxt.setForeground(Color.WHITE);
        cNameTxt.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL email text
        positionTxt.setText("Position : ");
        positionTxt.setForeground(Color.WHITE);
        positionTxt.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL password text
        salaryTxt.setText("Salary : ");
        salaryTxt.setForeground(Color.WHITE);
        salaryTxt.setFont(new Font("Roboto", Font.BOLD, 20));

        // LABEL password comfirm text
        cityTxt.setText("City : ");
        cityTxt.setForeground(Color.WHITE);
        cityTxt.setFont(new Font("Roboto", Font.BOLD, 20));

        // TEXT FIELD name
        cNameFill.setPreferredSize(new Dimension(250, 40));

        // TEXT FIELD email
        positionFill.setPreferredSize(new Dimension(250, 40));

        // PASSWORD FIELD password
        salaryFill.setPreferredSize(new Dimension(250, 40));

        // PASSWORD FIELD confirm password
        cityFill.setPreferredSize(new Dimension(250, 40));

        // BUTTON
        addButton.addActionListener(this);

        // main frame
        addJob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addJob.setSize(700, 700);
        addJob.setLayout(null);
        addJob.setVisible(true);
        addJob.add(addJobPanel);
        addJob.add(cNameTxtPanel);
        addJob.add(cNameFillPanel);
        addJob.add(positionTxtPanel);
        addJob.add(positionFillPanel);
        addJob.add(salaryTxtPanel);
        addJob.add(salaryFillPanel);
        addJob.add(cityTxtPanel);
        addJob.add(cityFillPanel);
        addJob.add(buttonPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // String compName = new String(cNameFill.getText());
        if(e.getSource() == addButton){
            StringBuilder getCName = new StringBuilder();
            StringBuilder getPosition = new StringBuilder();
            StringBuilder getSalary = new StringBuilder();
            StringBuilder getCity = new StringBuilder();
            try (FileWriter fileWriter = new FileWriter("database/jobData.txt", true)){
                getCName.append(cNameFill.getText()).append("#");
                getPosition.append(positionFill.getText()).append("#");
                getSalary.append(salaryFill.getText()).append("#");
                getCity.append(cityFill.getText()).append("\n");

                fileWriter.append(getCName.toString());
                fileWriter.append(getPosition.toString());
                fileWriter.append(getSalary.toString());
                fileWriter.append(getCity.toString());
                JOptionPane.showMessageDialog(addJob, "Post Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                mainPageComp newMainPage = new mainPageComp();
                
            } catch (IOException e1) {
                // TODO: handle exception
            }
        }

    }
}

