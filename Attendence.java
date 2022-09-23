import javax.swing.*;

public class Attendence extends JPanel{
	private JTextField text;
	private JLabel label;
	private JButton button;
	
	Attendence(){
		label=new JLabel("Testing");
		add(label);
		text=new JTextField(5);
		add(text);
		button=new JButton("Test");
		add(button);
		
	}
}
