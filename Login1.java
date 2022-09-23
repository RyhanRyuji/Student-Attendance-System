import java.awt.*;
import javax.swing.*;

public class Login1 extends JFrame {
    
    
    GridBagConstraints gbc = new GridBagConstraints();
    static JButton login,reset;
    static JLabel username, password; 
    static JTextField usernameTxt, passwordTxt;

    Login1()
    {

        setLayout(new GridBagLayout());
        setTitle("Login");
        gbc.insets=new Insets(3,3,3,3);

        username = new JLabel("Username:");
        gbc.gridx=1;
        gbc.gridy=1;
        add(username,gbc);

        usernameTxt=new JTextField();
        usernameTxt.setPreferredSize(new Dimension(200,30));
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=2;
        add(usernameTxt,gbc);

        password = new JLabel("Password:");
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=1;
        add(password,gbc);

        passwordTxt=new JTextField();
        passwordTxt.setPreferredSize(new Dimension(200,30));
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.gridwidth=2;
        add(passwordTxt,gbc);


        login = new JButton("login");
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.gridwidth=1;
        add(login,gbc);

        reset = new JButton("reset");
        gbc.gridx=2;
        gbc.gridy=5;
        gbc.gridwidth=1;
        add(reset,gbc);






    }
    public static void main(String[] args) {
		//this part is used to display the program size, visibility ect...
		Login1 Ex = new Login1();
		Ex.setSize(300,300);
		Ex.setVisible(true);
		Ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
