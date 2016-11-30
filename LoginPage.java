/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.awt.FlowLayout ;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.IOException;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.JFrame ;
import javax.swing.JLabel ; 
import javax.swing.* ;
import java.util.*;

public class LoginPage extends JPanel{
	
		//int checklogs=0;
	
	 	private JLabel labelUsername = new JLabel("Enter username: ");
	    private JLabel labelPassword = new JLabel("Enter password: ");
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JButton buttonLogin = new JButton("Login");
	    private JButton cancelLogin = new JButton("Cancel");
	    private JButton resetLogin = new JButton("Reset");
	    private JPanel startPanel;
	    
	    String supervisorDept="";
	    
	    login t;
	    
	public LoginPage(login tt) throws IOException
	{
			data object = new data();
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
	        
	       fieldPassword.addActionListener(new AbstractAction(){
	    	   public void actionPerformed(ActionEvent e){
	    		   
	    		    int checklog=checkLogin();
	    			
	    		    if(checklog==1){
	    				GMFr gm = new GMFr();
	    				t.dispose();}
	    			else if(checklog==2){
	    				SupervisorFr sup = new SupervisorFr(supervisorDept);
	    				t.dispose();}
	    			else if(checklog==3){
	    				StaffFr gm = new StaffFr();
	    				t.dispose();}
	    			else{JOptionPane.showMessageDialog(t, "Failed");}}});
	       
	       cancelEvent CE = new cancelEvent();  
		   cancelLogin.addActionListener(CE);
		   
		   resetEvent RE = new resetEvent();  
		   resetLogin.addActionListener(RE);
		   
		   loginEvent logE = new loginEvent();  
		   buttonLogin.addActionListener(logE);
		
		
	}
	
	public class loginEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			int checklog=checkLogin();
			
			if(checklog==1)
			{
				GMFr gm = new GMFr();
				t.dispose();
			}
			
			else if(checklog==2)
			{
				SupervisorFr sup = new SupervisorFr(supervisorDept);
				t.dispose();
			}
			
			else if(checklog==3)
			{
				StaffFr gm = new StaffFr();
				t.dispose();
			}
			
			else
			{
				JOptionPane.showMessageDialog(t, "Failed");
			}
			
			//t.goadminPanel();
			//revalidate();
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
	
	public int checkLogin()
	{
		int index=0;
		int checklogs=0;
		int a1=0,a2=0,s1=0,s2=0,t1=0,t2=0;
		String un = textUsername.getText();
		String pass = String.valueOf(fieldPassword.getPassword());
		//System.out.println(data.admin.size());
		for(int i=0;i<data.admin.size();i++)
		{
			
			if(un.equals(data.admin.get(i).getUsername()))
			{
				
				a1=1;
				if(pass.equals(data.admin.get(i).getPassword()))
				{
					a2=1;
					break;
				}
			}
		}

		for(int i=0;i<data.supervisors.size();i++)
		{
			if(un.equals(data.supervisors.get(i).getUsername()))
			{
				s1=1;
				if(pass.equals(data.supervisors.get(i).getPassword()))
				{
					s2=1;
					index=i;
					break;
				}
			}
		}

		for(int i=0;i<data.staffs.size();i++)
		{
			if(un.equals(data.staffs.get(i).getUsername()))
			{
				t1=1;
				if(pass.equals(data.staffs.get(i).getPassword()))
				{
					t2=1;
					break;
				}
			}
		}

		if(a1==1 && a2==1)
		{
			checklogs=1;
		}
		else if(s1==1 && s2==1)
		{
			supervisorDept = data.supervisors.get(index).getDepartment();
			checklogs=2;
		}
		else if(t1==1 && t2==1)
		{
			checklogs=3;
		}
		else
		{
			checklogs=9;
		}

		return checklogs;

	}
}


