import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class AdminPanel extends JFrame implements ActionListener {
    //define all button needed
    static JButton AdminHome,AddAdmin,AddClass,AddStudent,AddFaculty,ViewClass,ViewStudent,ViewFaculty,Attendence,Logout;
    //for testing displayJpanel
    static JLabel addAdmin;
    static JTextField addTAdmin;

    
    AdminPanel(){
        //Create Frame
        JFrame Admin= new JFrame("Admin Panel");  
        //Create Jpanel for all button  
        JPanel ButtonPanel=new JPanel(new GridLayout());
        //create Jpanel to display the correct button click
        JPanel DisplayPanel=new JPanel();

        // ButtonPanel.setBounds(0, 0, 1375, 75);
        // DisplayPanel.setBounds(0, 500, 500, 500);
        // DisplayPanel.setLayout(new BorderLayout());
        // DisplayPanel.setAlignment(Component.);
        // DisplayPanel.setPreferredSize(new Dimension(200, 100));
        // DisplayPanel.setMaximumSize(new Dimension(200, 100));
        

        //set the displayPanel background red for testing
        DisplayPanel.setBackground(Color.white);

        //global font for the button text
        Font font1 = new Font("SansSerif", Font.BOLD, 17);
            


        // Image AdminImage=AdminIcon.getImage();
        // Image ModifiedImage=AdminImage.getScaledInstance(75, 75,java.awt.Image.SCALE_SMOOTH );
        // ImageIcon AdminIcon = new ImageIcon("image\\Admin.png");

    //Customise Button
        //button admin to display admin info
        AdminHome= new JButton("A",new ImageIcon(((new ImageIcon("image\\Admin.png")).getImage()).getScaledInstance(75, 50, java.awt.Image.SCALE_SMOOTH)));
        AdminHome.setBackground(Color.blue); 
        AdminHome.setFocusPainted(false);
        AdminHome.setForeground(Color.blue);

        //button to add an admin
        AddAdmin=new JButton("Add Admin");
        AddAdmin.setBackground(Color.blue); 
        AddAdmin.setFont(font1);
        AddAdmin.setForeground(Color.white);
        AddAdmin.setFocusPainted(false);
        AddAdmin.setBorder(new LineBorder(Color.white));

        //button to add a class
        AddClass=new JButton("Add Class");
        AddClass.setBackground(Color.blue); 
        AddClass.setFont(font1);
        AddClass.setForeground(Color.white);
        AddClass.setFocusPainted(false);
        AddClass.setBorder(new LineBorder(Color.white));

        //button to add a faculty
        AddFaculty=new JButton("Add Faculty");
        AddFaculty.setBackground(Color.blue); 
        AddFaculty.setFont(font1);
        AddFaculty.setForeground(Color.white);
        AddFaculty.setFocusPainted(false);
        AddFaculty.setBorder(new LineBorder(Color.white));

        //button to add a student
        AddStudent=new JButton("Add student");
        AddStudent.setBackground(Color.blue); 
        AddStudent.setFont(font1);
        AddStudent.setForeground(Color.white);
        AddStudent.setFocusPainted(false);
        AddStudent.setBorder(new LineBorder(Color.white));

        //button to view class
        ViewClass=new JButton("View Class");
        ViewClass.setBackground(Color.blue); 
        ViewClass.setFont(font1);
        ViewClass.setForeground(Color.white);
        ViewClass.setFocusPainted(false);
        ViewClass.setBorder(new LineBorder(Color.white));

        //button to view Faculty
        ViewFaculty=new JButton("View Faculty");
        ViewFaculty.setBackground(Color.blue); 
        ViewFaculty.setFont(font1);
        ViewFaculty.setForeground(Color.white);
        ViewFaculty.setFocusPainted(false);
        ViewFaculty.setBorder(new LineBorder(Color.white));

        //button to view Student
        ViewStudent=new JButton("View Student");
        ViewStudent.setBackground(Color.blue);
        ViewStudent.setFont(font1);
        ViewStudent.setForeground(Color.white);
        ViewStudent.setFocusPainted(false);
        ViewStudent.setBorder(new LineBorder(Color.white)); 

        //button for Attendence
        Attendence=new JButton("Attendence");
        Attendence.setBackground(Color.blue); 
        Attendence.setFont(font1);
        Attendence.setForeground(Color.white);
        Attendence.setFocusPainted(false);
        Attendence.setBorder(new LineBorder(Color.white));


        //button for Logout
        Logout=new JButton("Logout");
        Logout.setBackground(Color.blue);
        Logout.setFont(font1);
        Logout.setForeground(Color.white);
        Logout.setFocusPainted(false);
        Logout.setBorder(new LineBorder(Color.white)); 

    //add all button in Button Panel
        ButtonPanel.add(AdminHome);
        ButtonPanel.add(AddAdmin);
        ButtonPanel.add(AddClass);
        ButtonPanel.add(AddFaculty);
        ButtonPanel.add(AddStudent);
        ButtonPanel.add(ViewClass);
        ButtonPanel.add(ViewFaculty);
        ButtonPanel.add(ViewStudent);
        ButtonPanel.add(Attendence);
        ButtonPanel.add(Logout);
//******************************************************************* */
        // create add admin component
        addAdmin=new JLabel("Adding admin");
        addTAdmin=new JTextField(15);
        
        // // add admin jpanel
        // DisplayPanel.setBorder(BorderFactory.createTitledBorder("Admin INFO"));
        // DisplayPanel.add(addAdmin);
        // DisplayPanel.add(addTAdmin);

    //****************************************************************** */    

        //add The panels to the frame
        Admin.add(ButtonPanel,BorderLayout.NORTH);
        // Admin.add(DisplayPanel,BorderLayout.CENTER);

        Admin.setSize(1000,300);
		Admin.setVisible(true);
		Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }



    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if(s.equals("A")){
            JPanel DisplayPanel=new JPanel();
            addAdmin=new JLabel("Adding admin");
            addTAdmin=new JTextField(15);
            DisplayPanel.setBorder(BorderFactory.createTitledBorder("Admin INFO"));
            DisplayPanel.add(addAdmin);
            DisplayPanel.add(addTAdmin);
            add(DisplayPanel,BorderLayout.CENTER);



         
        }
        if(s.equals("Add Admin")){
            JPanel DisplayPanel=new JPanel();
            addAdmin=new JLabel("Adding admin");
            addTAdmin=new JTextField(15);
            DisplayPanel.setBorder(BorderFactory.createTitledBorder("Admin INFO"));
            DisplayPanel.add(addAdmin);
            DisplayPanel.add(addTAdmin);
            add(DisplayPanel,BorderLayout.CENTER);
        }
    }
    public static void main(String[] args) {
        new AdminPanel();
    
    }
}
