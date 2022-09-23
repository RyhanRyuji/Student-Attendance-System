import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Login extends JFrame 
{
	Login() 
	{
		
		setSize(1200,700);
		setLayout(null);
		//JPanel provide an area for organisation of components
		JPanel Align = new JPanel(new GridLayout(2,3,100,10));
		//ImageIcon img = new ImageIcon("image/blackboard.png");
		//JLabel background = new JLabel("",img,JLabel.CENTER);
		//background.setBounds(0,0,1200,700);
		//Align.add(background);
		
		Color color=new Color(0,80,120);
		//Align.setBackground(color);
		//setVisible(true);
		//3 Jbuttons
		JLabel Adminlb,Studentlb, Facultylb;
		JButton admin ;
		JButton student;
		JButton faculty;

		
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 300));	
		Align.setBackground(color);
//3 Icons
		//ImageIcon a = new ImageIcon(getClass().getResource("image/admin.png"));
		//ImageIcon s = new ImageIcon(getClass().getResource("image/student.png"));
		//ImageIcon f = new ImageIcon(getClass().getResource("image/faculty.png"));
		
//creating our 3 JButtons
		 admin = new JButton("admin",new ImageIcon(((new ImageIcon("image/Admin.png")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH)));
		 admin.setAlignmentY(TOP_ALIGNMENT);
		 admin.setAlignmentX(LEFT_ALIGNMENT);
		 //admin.setBounds(5,0,100,100);
		 
		 student = new JButton("student",new ImageIcon(((new ImageIcon("image/Admin.png")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH)));
		 student.setAlignmentY(TOP_ALIGNMENT);
		 student.setAlignmentX(CENTER_ALIGNMENT);
		 
		 faculty = new JButton("faculty",new ImageIcon(((new ImageIcon("image/Admin.png")).getImage()).getScaledInstance(75, 60, java.awt.Image.SCALE_SMOOTH)));
		 faculty.setAlignmentY(TOP_ALIGNMENT);
		 faculty.setAlignmentX(RIGHT_ALIGNMENT);
		 
//organizing labels
		 Adminlb = new JLabel("Admin");
		 Adminlb.setAlignmentX(LEFT_ALIGNMENT);
		 
		 Studentlb = new JLabel("Student");
		 Studentlb.setAlignmentX(CENTER_ALIGNMENT);
		 
		 Facultylb = new JLabel("Faculty");
		 Facultylb.setAlignmentX(RIGHT_ALIGNMENT);
		
//Organising components on JPanel
		Align.setBorder(BorderFactory.createTitledBorder("Choose your account:"));
		
		Align.add(admin);
		Align.add(student);
		Align.add(faculty);
		Align.add(Adminlb);
		Align.add(Studentlb);
		Align.add(Facultylb);
		
		//add the JPanel in our JFrame
		add(Align);
		SaveHandler SaveHandler = new SaveHandler();
		admin.addActionListener(SaveHandler);
		faculty.addActionListener(SaveHandler);
		student.addActionListener(SaveHandler);
	}
	
//action listener	
	
public class SaveHandler implements ActionListener
{	
	public void actionPerformed(ActionEvent ae) 
	{
		
		String action = ae.getActionCommand();
		
			
//perform action on button 'admin'			
			if (action.equals("admin")) 
			{
				AdminPanel admin = new AdminPanel();
				admin.setSize(180,300);
				admin.setVisible(true);
				admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
			}
			if (action.equals("Faculty")) 
			{
				AdminPanel faculty = new AdminPanel();
				faculty.setSize(180,300);
				faculty.setVisible(true);
				faculty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
			}
			if (action.equals("Student")) 
			{
				AdminPanel student = new AdminPanel();
				student.setSize(180,300);
				student.setVisible(true);
				student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
			}
			
	}
}
	//main method
	public static void main(String[] args)
	{
		//this part is used to display the program size, visibility ect...
		Login Ex = new Login();
		Ex.setSize(180,300);
		Ex.setVisible(true);
		Ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
	
	