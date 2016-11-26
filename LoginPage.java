import java.awt.FlowLayout ;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.JFrame ;
import javax.swing.JLabel ; 
import javax.swing.* ;
import java.util.*;

public class LoginPage extends JPanel{
	
	 	private JLabel labelUsername = new JLabel("Enter username: ");
	    private JLabel labelPassword = new JLabel("Enter password: ");
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JButton buttonLogin = new JButton("Login");
	    private JButton cancelLogin = new JButton("Cancel");
	    private JButton resetLogin = new JButton("Reset");
	    private JPanel startPanel;
	    
	    login t;
	    
	public LoginPage(login tt)
	{
		t = tt;
		 JPanel newPanel = new JPanel(new GridBagLayout());
         
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.anchor = GridBagConstraints.WEST;
	        constraints.insets = new Insets(5, 0, 10, 0);
	      
	        constraints.gridx = 0;
	        constraints.gridy = 0;     
	        newPanel.add(labelUsername, constraints);
	 
	        constraints.gridx = 1;
	        newPanel.add(textUsername, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 1;     
	        newPanel.add(labelPassword, constraints);
	         
	        constraints.gridx = 1;
	        newPanel.add(fieldPassword, constraints);
	        
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.WEST;
	        newPanel.add(resetLogin, constraints);
	         
	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.CENTER;
	        newPanel.add(buttonLogin, constraints);
	        
	        constraints.gridx = 1;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        constraints.anchor = GridBagConstraints.EAST;
	       
	        newPanel.add(cancelLogin, constraints);	
	       
	        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
	        
	        add(newPanel);
	        
	       cancelEvent CE = new cancelEvent();  
		   cancelLogin.addActionListener(CE);
		   
		   resetEvent RE = new resetEvent();  
		   resetLogin.addActionListener(RE);
		   
		   regEvent regE = new regEvent();  
		   buttonLogin.addActionListener(regE);
		
		
	}
	
	public class regEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			t.goStart();
			revalidate();
		}
		
	}
	
	public class cancelEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			textUsername.setText("");
			fieldPassword.setText("");
			t.goStart();
			revalidate();
		}
		
	}
	
	public class resetEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			textUsername.setText("");
			fieldPassword.setText("");
		}
		
	}
}


