package assets;
import java.awt.Color;
import java.awt.Dimension;

import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

/** @see http://stackoverflow.com/questions/5654926 */
public class CardPanel extends JPanel {

    private static final Random random = new Random();
    private static  JPanel namePanel;
    private static  JPanel posPanel;
    private static  JPanel salaryPanel;
    private static  JPanel locPanel;

    private String name;
    private String position;
    private String salary;
    private String location;

    public CardPanel(String name, String position, String salary, String location) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.location = location;
        this.setPreferredSize(new Dimension(800, 800));
        this.setBackground(new Color(random.nextInt()));

        namePanel = new JPanel();
        posPanel = new JPanel();
        salaryPanel = new JPanel();
        locPanel = new JPanel();

        namePanel.add(new JLabel("Company name:  " + name));
        namePanel.setBounds(0, 0, 400, 50);
        namePanel.setBackground(Color.WHITE);
        namePanel.setVisible(true);
        // PANEL posPanel
        posPanel.add(new JLabel("Position:  " + position));
        posPanel.setBounds(0, 50, 400, 50);
        posPanel.setBackground(Color.WHITE);
        posPanel.setVisible(true);
        // PANEL salaryPanel
        salaryPanel.add(new JLabel("Income:  " + salary));
        salaryPanel.setBounds(0, 100, 400, 50);
        salaryPanel.setBackground(Color.WHITE);
        salaryPanel.setVisible(true);
        // PANEL locPanel
        locPanel.add(new JLabel("Location:  " + location));
        locPanel.setBounds(0, 150, 400, 50);
        locPanel.setBackground(Color.WHITE);
        locPanel.setVisible(true);

        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(new Color(random.nextInt()));
        this.add(namePanel);
        this.add(posPanel);
        this.add(salaryPanel);
        this.add(locPanel);
        this.setLayout(null);

    }
}
