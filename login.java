import java.awt.FlowLayout ;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.JFrame ;
import javax.swing.JLabel ; 
import javax.swing.* ;
import java.util.*;

public class login extends JFrame{

	JPanel startPanel;
	JLabel title,name;
	JButton login, googlelogin, register;

	public login()
	{
		startPanel = new JPanel();
		startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.Y_AXIS));
		startPanel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

		title = new JLabel("Facility Management Service!");
		title.setFont(new Font("Sherif",Font.BOLD,22));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(title);
		
		startPanel.add(Box.createRigidArea(new Dimension(0, 80)));

		login = new JButton("Login with username/passord");
		login.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(login);
		
		startPanel.add(Box.createRigidArea(new Dimension(0, 40)));

		
		googlelogin = new JButton("Login with Gmail");
		googlelogin.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(googlelogin);
		
		startPanel.add(Box.createRigidArea(new Dimension(80, 120)));
		
		register = new JButton("Register");
		register.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(register);
		
		startPanel.add(Box.createRigidArea(new Dimension(80, 120)));
	}

	

}
