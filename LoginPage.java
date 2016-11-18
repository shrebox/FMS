import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class LoginPage extends JPanel{
	
	/*JPanel loginPanel,leftPanel,rightPanel;
	JLabel userLabel, passLabel;
	JTextField userF, passF;
	JButton submit, cancel;*/
	
	 	private JLabel labelUsername = new JLabel("Enter username: ");
	    private JLabel labelPassword = new JLabel("Enter password: ");
	    private JTextField textUsername = new JTextField(20);
	    private JPasswordField fieldPassword = new JPasswordField(20);
	    private JButton buttonLogin = new JButton("Login");
	    private JButton cancelLogin = new JButton("Cancel");
	    private JButton resetLogin = new JButton("Reset");
	    
	public LoginPage()
	{
		/*loginPanel = new JPanel();
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.X_AXIS));
		loginPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));  
		
		add(loginPanel);
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setBorder(new EmptyBorder(new Insets(50, 0, 50, 50)));
		loginPanel.add(leftPanel);
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setBorder(new EmptyBorder(new Insets(50, 0, 50, 50)));
		loginPanel.add(rightPanel);
		
		userLabel = new JLabel("Username: ");
		userLabel.setFont(new Font("Sherif",Font.BOLD,14));
		userLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		leftPanel.add(userLabel);
		
		userF = new JTextField(15);
		userF.setAlignmentX(Component.LEFT_ALIGNMENT);
		rightPanel.add(userF);
		
		loginPanel.add(Box.createRigidArea(new Dimension(0, 40)));
		
		passLabel = new JLabel("Password: ");
		passLabel.setFont(new Font("Sherif",Font.BOLD,14));
		passLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		leftPanel.add(passLabel);
		
		passF = new JPasswordField(15);
		passF.setAlignmentX(Component.LEFT_ALIGNMENT);
		rightPanel.add(passF);
		
		loginPanel.add(Box.createRigidArea(new Dimension(0, 40)));
		
		submit = new JButton("Submit");
		submit.setAlignmentX(Component.CENTER_ALIGNMENT);
		leftPanel.add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setAlignmentX(Component.CENTER_ALIGNMENT);
		rightPanel.add(cancel);*/
		
		 JPanel newPanel = new JPanel(new GridBagLayout());
         
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.anchor = GridBagConstraints.WEST;
	        constraints.insets = new Insets(5, 0, 10, 0);
	         
	        // add components to the panel
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
	         
	        // set border for the panel
	        newPanel.setBorder(BorderFactory.createTitledBorder(
	                BorderFactory.createEtchedBorder(), "Login Panel"));
	         
	        // add the panel to this frame
	        add(newPanel);
	         
	       // pack();
	        //setLocationRelativeTo(null);
		
		
	}
}


