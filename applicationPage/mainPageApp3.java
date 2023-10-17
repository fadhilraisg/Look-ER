package applicationPage;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import assets.*;


public class mainPageApp3 extends JPanel{
    private static final Random random = new Random();
    private static JPanel cards = new JPanel(new CardLayout());

    mainPageApp3() {
        ArrayList<job> arrayPanel = new ArrayList<>();
        try {
            File dataJob = new File("database/jobData.txt");
            Scanner reader = new Scanner(dataJob);
            while (reader.hasNextLine()) {
                String dataRead = reader.nextLine();
                String[] userA = dataRead.split("#");
                String Cnama = userA[0];
                String position = userA[1];
                String salary = userA[2];
                String location = userA[3];

                job Rn = new job(Cnama, position, salary, location);
                arrayPanel.add(Rn);
            }
            reader.close();
        } catch (IOException e1) {

        }

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (job Jpanel : arrayPanel) {
            CardPanel p = new CardPanel(Jpanel.Cname, Jpanel.position, Jpanel.salary, Jpanel.location);
            cards.add(p);
        }

        JPanel control = new JPanel();
        control.add(new JButton(new AbstractAction("\u22b2Prev") {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cards.getLayout();
                cl.previous(cards);
            }
        }));
        control.add(new JButton(new AbstractAction("apply") {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Apply Succes", "Success", JOptionPane.INFORMATION_MESSAGE);
                CardLayout cl = (CardLayout) cards.getLayout();
            }
        }));
        control.add(new JButton(new AbstractAction("Next\u22b3") {

            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cards.getLayout();
                cl.next(cards);
            }
        }));
        f.setResizable(false);
        f.add(cards, BorderLayout.CENTER);
        f.add(control, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
