package store.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {
        getContentPane().setBackground(Color.ORANGE);

        setBounds(500, 200, 600, 300);
        setLayout(null);

        JLabel user = new JLabel("Username");
        user.setBounds(50, 20, 100, 30);
        add(user);

        JTextField username = new JTextField();
        username.setBounds( 150, 20, 150, 30);
        add(username);

        JLabel pw = new JLabel("Password");
        pw.setBounds(50, 80, 100, 30);
        add(pw);

        JTextField password = new JTextField();
        password.setBounds( 150, 80, 150, 30);
        add(password);

        JButton login = new JButton("Login");
        login.setBounds(50, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("dialog", Font.BOLD, 20));
        add(login);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(180, 150, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("dialog", Font.BOLD, 20));
        add(cancel);

        ImageIcon login_auth = new ImageIcon(ClassLoader.getSystemResource("icons/login_authentication.png"));
        Image login_auth1 = login_auth.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon login_auth2 = new ImageIcon(login_auth1);
        JLabel image = new JLabel(login_auth2);
        image.setBounds(350, 10, 200, 200);
        add(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

}
