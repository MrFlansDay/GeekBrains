package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowView extends JFrame implements Views {
    private JPanel namePanel = new JPanel();
    private JLabel nameLabel = new JLabel("Enter full name: ");
    private JTextField nameField = new JTextField(20);

    private JPanel birthdayPanel = new JPanel();
    private JLabel birthdayLabel = new JLabel("Enter date of birth: ");
    private JTextField birthdayField = new JTextField(10);

    private JPanel phonePanel = new JPanel();
    private JLabel phoneLabel = new JLabel("Enter phone number: ");
    private JTextField phoneField = new JTextField(11);

    private JPanel genderPanel = new JPanel();
    private JLabel genderLabel = new JLabel("Choose your gender: ");
    private JRadioButton genderRadio1 = new JRadioButton("m");
    private JRadioButton genderRadio2 = new JRadioButton("f");

    private JButton saveButton = new JButton("Save data");


    public WindowView() {
        super("Main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 1));

        namePanel.add(nameLabel);
        namePanel.add(nameField);
        container.add(namePanel);

        birthdayPanel.add(birthdayLabel);
        birthdayPanel.add(birthdayField);
        container.add(birthdayPanel);

        phonePanel.add(phoneLabel);
        phonePanel.add(phoneField);
        container.add(phonePanel);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(genderRadio1);
        buttonGroup.add(genderRadio2);
        genderRadio1.setSelected(true);
        genderPanel.add(genderLabel);
        genderPanel.add(genderRadio1);
        genderPanel.add(genderRadio2);
        container.add(genderPanel);

        saveButton.addActionListener(new ButtonListener());
        container.add(saveButton);

        this.setVisible(true);
    }




    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "aa", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
