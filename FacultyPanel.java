import javax.swing.*; 

public class FacultyPanel extends JFrame{
	
		FacultyPanel(){
		
		JPanel p=new JPanel();
	    Attendence p2=new Attendence();  
	    JPanel p3=new JPanel();  
	    JTabbedPane FP=new JTabbedPane();
	    
		JLabel lb=new JLabel("Faculty Panel");
		
	
	    FP.setBounds(100,100,400,400); 
	    FP.add("Attendence",p2);   
	    FP.add("View Student",p3);  
	    p.add(lb);
	    
	    add(p);
	    add(FP);
	    setSize(400,400);  
	    setLayout(null);  
	    setVisible(true); 
	    
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FacultyPanel();
	}

}
