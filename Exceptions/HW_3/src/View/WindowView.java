package View;
import Model.Gender;
import Presenter.Presenter;

import javax.swing.*;
import java.awt.*;

public class WindowView extends JFrame implements Views {
    Presenter presenter;

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

    ButtonListener buttonListener;


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

        buttonListener = new ButtonListener();
        buttonListener.setWindowView(this);
        saveButton.addActionListener(buttonListener);
        container.add(saveButton);
    }

    public void start() {
        this.setVisible(true);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void check() {
        try {
            presenter.check(nameField.getText(), birthdayField.getText(), phoneField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fail", JOptionPane.PLAIN_MESSAGE);
        }
        try {
            save(nameField.getText(), birthdayField.getText(), phoneField.getText(),
                    genderRadio1.isSelected() ? Gender.MALE : Gender.FEMALE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace(), "Fail", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void save(String name, String birthDate, String phone, Gender gender) throws Exception {
        String text = presenter.save(name, birthDate, phone, gender);
        try {
            JOptionPane.showMessageDialog(null, text, "Success", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, text, "Fail", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
