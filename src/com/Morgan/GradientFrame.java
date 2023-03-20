package com.Morgan;

import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GradientFrame extends JFrame  {

    JTextField firstNameField;
    JTextField lastNameField;
    JTextField emailField;

    JPasswordField passwordField;
    JTextField phoneField;

    JLabel genderLabel;

    JTextArea interestTextArea;

    JScrollPane interestScrollPane;

    JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;

    ButtonGroup genderButtonGroup;
    JButton submitButton, resetButton;
    public GradientFrame() {
        super("Registration Form");
//        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        add(new GradientPanel());
        setVisible(true);
    }



    class GradientPanel extends JPanel  {

        public GradientPanel() {
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setLayout(new GridBagLayout());

            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.anchor = GridBagConstraints.NORTHWEST;
            constraints.insets = new Insets(5, 5, 5, 5);

            JPanel panel = new JPanel(new GridBagLayout());
            constraints.anchor = GridBagConstraints.WEST;
            constraints.insets = new Insets(10, 10, 10, 10);

            // First Name Label
            JLabel firstNameLabel = new JLabel("First Name:");
            constraints.gridx = 0;
            constraints.gridy = 0;
            panel.add(firstNameLabel, constraints);

            // First Name Field
            firstNameField = new JTextField(20);
            constraints.gridx = 1;
            constraints.gridy = 0;
            panel.add(firstNameField, constraints);

            // Last Name Label
            JLabel lastNameLabel = new JLabel("Last Name:");
            constraints.gridx = 0;
            constraints.gridy = 1;
            panel.add(lastNameLabel, constraints);

            // Last Name Field
            lastNameField = new JTextField(20);
            constraints.gridx = 1;
            constraints.gridy = 1;
            panel.add(lastNameField, constraints);

            // Email Label
            JLabel emailLabel = new JLabel("Email:");
            constraints.gridx = 0;
            constraints.gridy = 2;
            panel.add(emailLabel, constraints);

            // Email Field
            emailField = new JTextField(20);
            constraints.gridx = 1;
            constraints.gridy = 2;
            panel.add(emailField, constraints);

            // Password Label
            JLabel passwordLabel = new JLabel("Password");
            constraints.gridx = 0;
            constraints.gridy =  3;
            panel.add(passwordField,constraints);

            // Password Field
            passwordField = new JPasswordField(20);
            constraints.gridx = 1;
            constraints.gridy = 3;
            panel.add(passwordLabel, constraints);

            // Phone Label
            JLabel phoneLabel = new JLabel("Phone:");
            constraints.gridx = 0;
            constraints.gridy = 4;
            panel.add(phoneLabel, constraints);

            // Phone Field
            phoneField = new JTextField(20);
            constraints.gridx = 1;
            constraints.gridy = 4;
            panel.add(phoneField, constraints);

            genderLabel = new JLabel("Gender");
            constraints.gridx = 0;
            constraints.gridy = 5;
            panel.add(genderLabel,constraints);

            // gender radio buttons
            JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            maleRadioButton = new JRadioButton("Male");
            constraints.gridx = 1;
            constraints.gridy = 5;
            genderPanel.add(maleRadioButton,constraints);

            femaleRadioButton = new JRadioButton("Female");
            constraints.gridx = 2;
            constraints.gridy = 5;
            genderPanel.add(femaleRadioButton,constraints);

            otherRadioButton = new JRadioButton("Other");
            constraints.gridx = 3;
            constraints.gridy = 5;
            genderPanel.add(otherRadioButton,constraints);

            genderButtonGroup = new ButtonGroup();
            genderButtonGroup.add(maleRadioButton);
            genderButtonGroup.add(femaleRadioButton);
            genderButtonGroup.add(otherRadioButton);

            interestTextArea = new JTextArea(5, 20);
            constraints.gridx = 0;
            constraints.gridy = 6;
            constraints.gridwidth = 2;
            constraints.gridheight = 2;
            panel.add(interestTextArea,constraints);

            interestScrollPane = new JScrollPane(interestTextArea);
            constraints.gridx = 2;
            panel.add(interestScrollPane);


            // Submit Button
            submitButton = new JButton("Submit");
            constraints.gridx = 0;
            constraints.gridy = 8;
            constraints.gridwidth = 2;
            add(submitButton,constraints);
            submitButton.addActionListener((ActionListener) this);

            //  Reset Button
            resetButton = new JButton("Reset");
            constraints.gridx = 2;
            constraints.gridy = 8;
            constraints.gridwidth = 2;
            add(resetButton,constraints);
            resetButton.addActionListener((ActionListener) this);

        }








        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int w = getWidth();
            int h = getHeight();
            GradientPaint gp = new GradientPaint(0, 0, Color.BLUE, w, h, Color.RED);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);
        }
    }





    public static void main(String[] args) {
        new GradientFrame();
    }
}
