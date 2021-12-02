/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Melnikov
 */
public class MyGui extends JFrame{
    private JLabel jLabelTitle;
    private JTextField jTextFieldSetText;
    private JButton jButtonChangeTextToTitle;
    public MyGui() {
        initComponent();
    }

    private void initComponent() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(400,250));
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400,250));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        jLabelTitle = new JLabel("Привет, JKTV20!");
        jLabelTitle.setHorizontalAlignment(jLabelTitle.CENTER);
        jLabelTitle.setVerticalAlignment(jLabelTitle.CENTER);
        jTextFieldSetText = new JTextField();
        jTextFieldSetText.setText("");
        jTextFieldSetText.setHorizontalAlignment(JTextField.CENTER);
        jTextFieldSetText.setMaximumSize(new Dimension(300,27));
        jButtonChangeTextToTitle = new JButton("Нажми меня");
        jButtonChangeTextToTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonChangeTextToTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jLabelTitle.setText(jTextFieldSetText.getText());
            }
        });
        this.getContentPane().add(jLabelTitle);
        this.getContentPane().add(jTextFieldSetText);
        this.getContentPane().add(jButtonChangeTextToTitle);
        
        pack();
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyGui().setVisible(true);
            }
        });
    }
    
    
}
