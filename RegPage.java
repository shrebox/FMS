
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;
import java.io.*;

public class RegPage{
	
	JFrame regFrame = new JFrame("Register");
	
	static String type[] = {"--select type--", "Supervisor","Staff"};
	static String departmentA[] = {"--select department--", "Electricity", "Security","HVAC","Audio/Video","Housekeeping"};
	
	JLabel id = new JLabel("ID:");
	JLabel typeL = new JLabel("Type");
	
	static JComboBox typeF = new JComboBox(type);
	JLabel name = new JLabel("Name:");
	JLabel username = new JLabel("Username:");
	JLabel password = new JLabel("Password:");
	JLabel dob = new JLabel("DOB:");
	JLabel address = new JLabel("Address:");
	JLabel department = new JLabel("Department:");
	JLabel idDescription = new JLabel("ID will be system generated");
	
	static JTextField nameTF = new JTextField("",250);
	static JTextField usernameTF = new JTextField("",250);
	static JTextField dobTF = new JTextField("",250);
	static JTextField addressTF = new JTextField("",250);
	static JComboBox departmentS = new JComboBox(departmentA);
	//nameTF,usernameTF,dobTF,addressTF,derpartmentTF;
	static JPasswordField passwordPF = new JPasswordField(250);
	
	JButton registerB = new JButton("Register");
	JButton cancelB = new JButton("Cancel");
	
	static int size=0;
	static ArrayList<forRequests> list = new ArrayList<forRequests>();
	{
		for(int i=0;i<100;i++)
		{
			list.add(new forRequests());
		}
	}

	public RegPage() throws IOException
	{
		data obj = new data();
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
		
		regFrame.add(departmentS);
		departmentS.setBounds(200, 300, 200, 20);
		
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
			
			int registerchk = registerCheck();
			if(registerchk == 1)
			{
				try {
					updateFile(list,size);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				regFrame.dispose();
			}
			else if(registerchk==9)
			{
				JOptionPane.showMessageDialog(regFrame, "incomplete details");
			}
			else if(registerchk == 5)
			{
				JOptionPane.showMessageDialog(regFrame, "Username already exists!! Please choose another");
			}
				
				
			
		}

	}
	
	public int registerCheck()
	{
		int chk=0;
		int chk1=0,chk2=0,chk3=0;
		String name = nameTF.getText();
		String un = usernameTF.getText();
		String dep = String.valueOf(departmentS.getSelectedItem());
		String dob = dobTF.getText();
		String adr = addressTF.getText();
		String pass = String.valueOf(passwordPF.getPassword());
		String x = String.valueOf(typeF.getSelectedItem());
		
		if(name.equals("")  || un.equals("") || pass.equals("") || dep.equals("") || dob.equals("") || adr.equals("") || x.equals("--select type--") )
		{
			chk = 9 ;
		}
		else
		{
			for(int i=0;i<data.admin.size();i++)
			{
				if(un.equals(data.admin.get(i).getUsername()))
				{
					chk1 = 2 ;
					break;
				}
				else
				{
					chk1 =1;
				}
			}
			for(int i=0;i<data.supervisors.size();i++)
			{
				if(un.equals(data.supervisors.get(i).getUsername()))
				{
					chk2 = 2 ;
					break;
				}
				else
				{
					chk2=1;
				}
			}
			for(int i=0;i<data.staffs.size();i++)
			{
				if(un.equals(data.staffs.get(i).getUsername()))
				{
					chk3 = 2 ;
					break;
				}
				else 
				{
					chk3 = 1;
				}
			}
			
		}
		
		if(chk1 ==2 || chk2==2|| chk3==2)
		{
			chk = 5;
		}
		else if(chk==9)
		{
			chk = 9;
		}
		else
		{
			chk =1;
		}
		
		
		return chk;
	}
	
	
	public static void updateFile(ArrayList<forRequests> list ,int s) throws Exception
	{
		
		FileWriter file = new FileWriter("db1register.csv",false);
	   	BufferedWriter bw = new BufferedWriter(file);
	    PrintWriter pw = new PrintWriter(bw);
	    
	    String name = nameTF.getText();
		String un = usernameTF.getText();
		String dep = String.valueOf(departmentS.getSelectedItem());
		String dob = dobTF.getText();
		String adr = addressTF.getText();
		String pass = String.valueOf(passwordPF.getPassword());
	    String x = String.valueOf(typeF.getSelectedItem());
	    
	    list.get(size).setName(name);
	    list.get(size).setUsername(un);
	    list.get(size).setDep(dep);
	    list.get(size).setPassword(pass);
	    list.get(size).setAdr(adr);
	    list.get(size).setPost(x);
	    list.get(size).setDOB(dob);
	    
		//size++;
		for(int i=0;i<=size;i++)
		{
				pw.print( list.get(i).getName() +",");
				pw.print( list.get(i).getPost() +",");
				pw.print( list.get(i).getUsername() +",");
				pw.print( list.get(i).getPassword() +",");
				pw.print( list.get(i).getDep() +",");
				pw.print( list.get(i).getDOB() +",");
				pw.print( list.get(i).getAdr());
				
				if(i!= size)
				{
					pw.print("\n");
				}		
			
		}	
		size++;
		
		pw.close();
	}

			

}



