package com.demo.login;

import com.demo.main.Application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;



public class Login extends JPanel implements ActionListener{

        private final String strTitle = "Carrel's Real Property Leasing";
        private final String strDescription = "Please sign in to access the system";
        private JPanel panel;


    public Login(){
        init();
    }
    private void init(){
        setLayout(new MigLayout("fill, insets 20","[center]","[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        cmdLogin = new JButton("Login");
        panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE,"" +
                "arc:20;" +
                "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%)");
        
        txtUsername.putClientProperty(FlatClientProperties.STYLE,"" +
                "showClearButton:true");
        txtPassword.putClientProperty(FlatClientProperties.STYLE,"" +
                "showRevealButton:true");

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        JLabel lbTitle = new JLabel(strTitle);
        JLabel lbDescription = new JLabel(strDescription);
        
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
        "font:bold +7");
        lbDescription.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        
        
        panel.add(lbTitle);
        panel.add(lbDescription);
        panel.add(new JLabel("Username"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(cmdLogin, "gapy 10");
        cmdLogin.addActionListener(this);
        add(panel);

    }

    
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton cmdLogin;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdLogin){
                String userName = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                if (userName.equals("admin")  && password.equals("admin")) {
                        JOptionPane.showMessageDialog(this, "Change Panel to MainPanel");
                }
                else{
                        JOptionPane.showMessageDialog(this, "Login Fail");
                }
        }
    }
}
