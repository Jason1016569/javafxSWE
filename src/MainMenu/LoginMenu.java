package MainMenu;

import javax.swing.*;

public class LoginMenu {
    private JPanel login_menu_panel;
    private JLabel Template;
    private JTextField Username;
    private JPasswordField Password;
    private JLabel WelcomeLabel;
    private JLabel PleaseLoginLabel;
    private JButton LoginButton;
    private JButton GuestButton;
    private JLabel UsernameLabel;
    private JLabel PasswordLabel;
    private ImageIcon image1;


    public static void main(String args []){
        JFrame frame = new JFrame();
        frame.setContentPane(new LoginMenu().login_menu_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366,786);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Mom & Pop Pizza!");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Template = new JLabel(new ImageIcon("PizzaProject Info Template_CROPED.png"));
    }
}
