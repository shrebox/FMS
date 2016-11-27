import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class RegPage{
	
	JFrame regFrame = new JFrame("Register");
	
	String type[] = {"--select type--", "Supervisor","Staff"};
	
	JLabel id = new JLabel("ID:");
	JLabel typeL = new JLabel("Type");
	JComboBox typeF = new JComboBox(type);
	JLabel name = new JLabel("Name:");
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JLabel dob = new JLabel("DOB:");
	JLabel address = new JLabel("Address:");
	JLabel department = new JLabel("Department:");
	JLabel idDescription = new JLabel("ID will be system generated");
	
	JTextField nameTF = new JTextField("",250);
	JTextField usernameTF = new JTextField("",250);
	JTextField dobTF = new JTextField("",250);
	JTextField addressTF = new JTextField("",250);
	JTextField departmentTF = new JTextField("",250);
	//nameTF,usernameTF,dobTF,addressTF,derpartmentTF;
	JPasswordField passwordPF = new JPasswordField(250);
	
	JButton registerB = new JButton("Register");
	JButton cancelB = new JButton("Cancel");
	

	public RegPage()
	{

		regFrame.setVisible(true);
		regFrame.setResizable(false);
		regFrame.setSize(500, 500);
		regFrame.setLayout(null);
		
		
		regFrame.add(id);
		id.setBounds(100, 50, 100, 100);
		
		regFrame.add(idDescription);
		idDescription.setBounds(200, 50, 250, 100);
		idDescription.setForeground(Color.RED);
		
		regFrame.add(typeL);
		typeL.setBounds(100, 80, 100, 100);
		
		regFrame.add(typeF);
		typeF.setBounds(200, 120, 200, 20);
		
		regFrame.add(name);
		name.setBounds(100, 110, 100, 100);
		
		regFrame.add(nameTF);
		nameTF.setBounds(200, 150, 200, 20);
		
		regFrame.add(username);
		username.setBounds(100, 140, 100, 100);
		
		regFrame.add(usernameTF);
		usernameTF.setBounds(200, 180, 200, 20);
		
		regFrame.add(password);
		password.setBounds(100, 170, 100, 100);
		
		regFrame.add(passwordPF);
		passwordPF.setBounds(200, 210, 200, 20);
		
		regFrame.add(dob);
		dob.setBounds(100, 200, 100, 100);
		
		regFrame.add(dobTF);
		dobTF.setBounds(200, 240, 200, 20);
		
		regFrame.add(address);
		address.setBounds(100, 230, 100, 100);
		
		regFrame.add(addressTF);
		addressTF.setBounds(200, 270, 200, 20);
		
		regFrame.add(department);
		department.setBounds(100, 260, 100, 100);
		
		regFrame.add(departmentTF);
		departmentTF.setBounds(200, 300, 200, 20);
		
		regFrame.add(registerB);
		registerB.setBounds(270, 350, 100, 25);
		
		regFrame.add(cancelB);
		cancelB.setBounds(120, 350, 100, 25);
		
		cancelEvent CE = new cancelEvent();
		cancelB.addActionListener(CE);
		
		regEvent RE = new regEvent();
		registerB.addActionListener(RE);
		
	}
	
	public class cancelEvent implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			regFrame.dispose();
		}

	}
	
	public class regEvent implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			regFrame.dispose();
		}

	}
}
