package applicationPage;

// import library that need
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPageComp extends JFrame implements ActionListener{
    // FRAME declare
    JFrame mainPageComp = new JFrame();
    // PANEL declare
    JPanel labelPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    // LABEL declare
    JLabel titleLabel = new JLabel();
    // BUTTON declare
    JButton butList = new JButton("List");
    JButton butAdd = new JButton("Add");
    ImageIcon logo = new ImageIcon("./assets/logo.png");
    
    mainPageComp(){
        // PANEL labelPanel
        labelPanel.add(titleLabel);
        labelPanel.setBounds(0,0,700,500);
        labelPanel.setBackground(new Color(98, 189, 238));


        // PANEL buttonPanel
        buttonPanel.add(butList);
        buttonPanel.add(butAdd);
        buttonPanel.setBounds(0,500,700,200);
        buttonPanel.setBackground(new Color(98, 189, 238));


        // LABEL titleLabel
        titleLabel.setIcon(logo);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setText("Main Page Company");
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        titleLabel.setVerticalTextPosition(JLabel.TOP);
        titleLabel.setIconTextGap(-50);
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        titleLabel.setForeground(Color.white);

        // BUTTON butlist
        butList.addActionListener(this);

        // BUTTON butAdd
        butAdd.addActionListener(this);

        // FRAME
        mainPageComp.setVisible(true);
        mainPageComp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPageComp.setSize(700,700);
        mainPageComp.setResizable(false);
        mainPageComp.add(buttonPanel);
        mainPageComp.add(labelPanel);
    }


    @Override
    public void actionPerformed(ActionEvent source) {
        if(source.getSource() == butList){
            dispose(); 
        }
        else if(source.getSource() == butAdd){
            addJobFrame add = new addJobFrame();
            dispose();
        }
        
    }
    
}

