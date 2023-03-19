package com.Morgan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JLabel nameLabel, emailLabel, passwordLabel, interestLabel,genderLabel;
    JTextField nameTextField, emailTextField;
    JPasswordField passwordField;
    JTextArea interestTextArea;
    JScrollPane interestScrollPane;

    JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;
    ButtonGroup genderButtonGroup;
    JButton submitButton, resetButton;

    public RegistrationForm() {
        // Set up the frame
        super("Registration Form");
//        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the labels
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        interestLabel = new JLabel("Interests:");
        genderLabel = new JLabel("Gender");
        // Create the text fields
        nameTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // Create the interest list
        interestTextArea = new JTextArea(5, 20);
        interestScrollPane = new JScrollPane(interestTextArea);

        // Create the gender radio buttons
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        otherRadioButton = new JRadioButton("Other");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        genderButtonGroup.add(otherRadioButton);

        // Create the submit and reset buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Set up the layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add the components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;                           // name label
        panel.add(nameLabel, constraints);

        constraints.gridx = 1;
        panel.add(nameTextField, constraints);           // name field

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(emailLabel, constraints);            // email label

        constraints.gridx = 1;
        panel.add(emailTextField, constraints);         // email text field

        constraints.gridx = 0;
        constraints.gridy = 2;                          // password label
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;                           // password text field
        panel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(interestLabel, constraints);           // interest label

        constraints.gridx = 1;
        panel.add(interestScrollPane, constraints);        // interest scroll pane

        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(genderLabel, constraints);
        constraints.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderPanel.add(otherRadioButton);
        panel.add(genderPanel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(submitButton, constraints);              // submit button

        constraints.gridx = 1;
        panel.add(resetButton, constraints);              // reset button

        // Add the panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Handle the submit button click
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String password = new String(passwordField.getPassword());
            String interests = interestTextArea.getText();
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("Interests: " + interests);
        } else if (e.getSource() == resetButton) {
            // Handle the reset button click
            nameTextField.setText("");
            emailTextField.setText("");
            passwordField.setText("");
            interestTextArea.setText("");
        }
    }

    public static void main(String[] args) {

        new RegistrationForm();
    }

}

// 2aqcp5m  class cde

