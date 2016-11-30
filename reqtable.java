/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class reqtable extends JFrame{
	
	JTable table;
	JButton approve,disapprove, cancel;
	JTextField submitTF;
	JLabel username = new JLabel("Enter Username:");
	
	int mainCount=0;
	
	Object[][] data = new Object[100][4];
	
	static ArrayList<forRequests> list = new ArrayList<forRequests>();
	int size=0;
	
	{
		for(int i=0;i<100;i++)
		{
			list.add(new forRequests());
		}
	}
	
	data obj;
	
	public reqtable() 
	{
		//mainCount = count;
		
		try {
			obj = new data();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			size = reading(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] columnNames = {"Name", "Username", "Post", "Department"};
		
		table = new JTable(data,columnNames){
			 private static final long serialVersionUID = 1L;
		        public boolean isCellEditable(int row, int column) {                
		                return false;};};
		                
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		table.setFillsViewportHeight(true);
		//table.setBounds(100, 200, 500, 200);
		
		//data[0][0]= "hi";
		
		writeTable(list);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		scrollPane.setBounds(50, 50, 500, 200);
		
		approve = new JButton("Approve");
		approve.setBounds(100, 280, 100, 20);
		
		disapprove = new JButton("Disapprove");
		disapprove.setBounds(230, 280, 120, 20);
		
		submitTF = new JTextField(250);
		submitTF.setBounds(400, 310, 120, 20);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(160, 320, 120, 20);
		
		username.setBounds(400, 280, 120, 20);
		//memreqdata mm = new memreqdata(this);
		
		//add(table);
		this.add(approve);
		this.add(disapprove);
		this.add(submitTF);
		this.add(cancel);
		this.add(username);
		
		this.setLayout(null);		
		this.setSize(630,400);
		this.setVisible(true);
		this.setTitle("Member Registration Requests");
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		approveEvent app = new approveEvent();
		approve.addActionListener(app);
		
		dipproveEvent dap = new dipproveEvent();
		disapprove.addActionListener(dap);
		
		cancelEvent ce = new cancelEvent();
		cancel.addActionListener(ce);
	}
	
	public static int reading(ArrayList<forRequests> list) throws IOException
	{
		FileReader inp = new FileReader("db1register.csv");
		BufferedReader bfile = new BufferedReader(inp);
		String line= bfile.readLine();
		int a=0;
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
			
			list.get(a).setName(items.get(0));
			list.get(a).setPost(items.get(1));
			list.get(a).setUsername(items.get(2)); 
			list.get(a).setPassword(items.get(3));
			list.get(a).setDep(items.get(4));
			list.get(a).setDOB(items.get(5));
			list.get(a).setAdr(items.get(6));
			
			line= bfile.readLine();
			a++;
		}
			return a;
	}
	int index =0;
	int i1=0,i2=0,i3=0;
	
	public class approveEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String submit = submitTF.getText();
			//System.out.println(size+"-------");
			for(int i=0;i<size;i++)
			{
				i1 = obj.numSuperv();
				i2 = obj.numStaff();
				if(submit.equals(list.get(i).getUsername()))
				{
					index = i;
					System.out.println(index + "****");
					if(list.get(index).getPost().equals("supervisor"))
					{
						for(int j=0;j<i1;j++)
						{
							if(list.get(index).getDep().equals(obj.supervisors.get(j).getDepartment()))
							{
								//i1++;
								//System.out.println(i1+"-------");
								obj.supervisors.get(j).setName(list.get(index).getName());
								obj.supervisors.get(j).setPost(list.get(index).getPost());
								obj.supervisors.get(j).setUsername(list.get(index).getUsername());
								obj.supervisors.get(j).setPassword(list.get(index).getPassword());
								obj.supervisors.get(j).setId(obj.supervisors.get(j).getId());
								obj.supervisors.get(j).setDepartment(list.get(index).getDep());
								obj.supervisors.get(j).setDob(list.get(index).getDOB());
								obj.supervisors.get(j).setAdr(list.get(index).getAdr());
							}
						}
					}
					else if(list.get(index).getPost().equals("staff"))
					{
						
						//i2++;
						System.out.println(i2+"-------");
						obj.staffs.get(i2).setName(list.get(index).getName());
						obj.staffs.get(i2).setPost(list.get(index).getPost());
						obj.staffs.get(i2).setUsername(list.get(index).getUsername());
						obj.staffs.get(i2).setPassword(list.get(index).getPassword());
						obj.staffs.get(i2).setId(generateID());
						obj.staffs.get(i2).setDepartment(list.get(index).getDep());
						obj.staffs.get(i2).setDob(list.get(index).getDOB());
						obj.staffs.get(i2).setAdr(list.get(index).getAdr());
						i2++;
						
						
						
						
					}
					list.remove(index);
					size--;
					try {
						updatefile1(list,size);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						updatefile2(i1,i2);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//System.out.println(i1+"-------");
					//System.out.println(i2+"-------");
					break;
					
					
				}
			}
			
			dispose();
		}
	}
	
	public class dipproveEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String submit = submitTF.getText();
			for(int i=0;i<size;i++)
			{
				if(submit.equals(list.get(i).getUsername()))
				{
					index = i;
					list.remove(index);
					size--;
					
					try {
						updatefile1(list,size);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
			dispose();
		}
	}
	
	public void writeTable(ArrayList<forRequests> list)
	{
		for(int i=0;i<size;i++)
		{
			data[i][0] = list.get(i).getName();
			data[i][1] = list.get(i).getUsername();
			data[i][2] = list.get(i).getPost();
			data[i][3] = list.get(i).getDep();
			
		}
	}
	
	public static void updatefile1(ArrayList<forRequests> list ,int s) throws IOException
		{
			FileWriter file = new FileWriter("db1register.csv",false);
		   	BufferedWriter bw = new BufferedWriter(file);
		    PrintWriter pw = new PrintWriter(bw);
		    
		    
		    for(int i=0;i<s;i++)
			{
					pw.print( list.get(i).getName() +",");
					pw.print( list.get(i).getPost() +",");
					pw.print( list.get(i).getUsername() +",");
					pw.print( list.get(i).getPassword() +",");
					pw.print( list.get(i).getDep() +",");
					pw.print( list.get(i).getDOB() +",");
					pw.print( list.get(i).getAdr());
					if(i!= s)
					{
						pw.print("\n");
					}		
			}	
			s++;
			pw.close();
		}

	public void updatefile2(int s1,int s2) throws IOException
	{
		FileWriter file = new FileWriter("db1basics.csv",false);
	   	BufferedWriter bw = new BufferedWriter(file);
	    PrintWriter pw = new PrintWriter(bw);
	    
	    pw.print( obj.admin.get(0).getName() +",");
		pw.print( obj.admin.get(0).getPost() +",");
		pw.print( obj.admin.get(0).getUsername() +",");
		pw.print( obj.admin.get(0).getPassword() +",");
		pw.print(obj.admin.get(0).getId()+",");
		pw.print( "-,");
		pw.print( obj.admin.get(0).getDob() +",");
		pw.print( obj.admin.get(0).getAdr() + "\n");
		//pw.println("\n");
		
			for(int i=0;i< s1;i++)
			{
				pw.print( obj.supervisors.get(i).getName() +",");
				pw.print( obj.supervisors.get(i).getPost() +",");
				pw.print( obj.supervisors.get(i).getUsername() +",");
				pw.print( obj.supervisors.get(i).getPassword() +",");
				pw.print( obj.supervisors.get(i).getId() +",");
				pw.print( obj.supervisors.get(i).getDepartment() +",");
				pw.print( obj.supervisors.get(i).getDob() +",");
				pw.print( obj.supervisors.get(i).getAdr());
				if(i!= s1)
				{
					pw.print("\n");
				}	
			}
			
			for(int i=0;i< s2;i++)
			{
				pw.print( obj.staffs.get(i).getName() +",");
				pw.print( obj.staffs.get(i).getPost() +",");
				pw.print( obj.staffs.get(i).getUsername() +",");
				pw.print( obj.staffs.get(i).getPassword() +",");
				pw.print( obj.staffs.get(i).getId()+",");
				pw.print( obj.staffs.get(i).getDepartment() +",");
				pw.print( obj.staffs.get(i).getDob() +",");
				pw.print( obj.staffs.get(i).getAdr());
				if(i!= s2)
				{
					pw.print("\n");
				}	
			}	
			//s1++;
			s2++;
			pw.close();
	    
}
	
	public String generateID()
	{
		int idd=0;
		
		//Random rand = new Random();
		String dpt = list.get(index).getDep();
		
		if(dpt.equals("Electricity"))
		{
			idd = 1100 + (1 + (int)(Math.random() * 99)); 
		}
		else if(dpt.equals("Security"))
		{
			idd = 1200 + (1 + (int)(Math.random() * 99));
		}
		else if(dpt.equals("HVAC"))
		{
			idd = 1300 + (1 + (int)(Math.random() * 99));
		}
		else if(dpt.equals("Audio/Video"))
		{
			idd = 1400 + (1 + (int)(Math.random() * 99));
		}
		else if(dpt.equals("Housekeeping"))
		{
			idd = 1500 + (1 + (int)(Math.random() * 99));
		}
		
		
		return String.valueOf(idd);
	}
	
	public class cancelEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}

	
}