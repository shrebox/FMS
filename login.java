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

		//ArrayList<admin> admin = new ArrayList<admin>();
		//ArrayList<supervisor> supervisors = new ArrayList<supervisor>();
		//ArrayList<staff> staffs = new ArrayList<staff>();


	private JPanel startPanel,loginPanel;
	private JLabel title,name;
	private JButton login, googlelogin, register;
	private LoginPage LP;
	
	public void goStart(){
		setContentPane(startPanel);
		revalidate();
	}

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

		login = new JButton("Login with username/password");
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

		name = new JLabel("Shreyash Arya (2015097)\n Tushita Rathore(2015108)");
		name.setFont(new Font("Sherif",Font.ITALIC,12));
		name.setAlignmentX(Component.CENTER_ALIGNMENT);
		startPanel.add(name);

		add(startPanel);
		
		LP = new LoginPage(this);
		LP.setLayout(new BoxLayout(LP, BoxLayout.Y_AXIS));
		LP.setBorder(new EmptyBorder(new Insets(200, 200, 200, 200)));
		
		//RP.setLayout(new BoxLayout(RP, BoxLayout.Y_AXIS));
		//RP.setBorder(new EmptyBorder(new Insets(200, 200, 200, 200)));
		
		loginUserEvent LUE = new loginUserEvent();  
		login.addActionListener(LUE);
		
		regUserEvent RUE = new regUserEvent();  
		register.addActionListener(RUE);
		
		
		
		pack();
		setDefaultLookAndFeelDecorated(true);
		//ttt.setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FMS System");
		

		//loginevent log = new loginevent();
		//login.addActionListener(log);
	}

	public class loginUserEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setContentPane(LP);
			revalidate();
		}
		
	}
	
	public class regUserEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			RegPage RP = new RegPage();
		}
		
	}
	/*private class loginevent implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{

		}
	}

/*public static void updateFile(,int size) throws Exception
{
	FileWriter file = new FileWriter("input.txt",false);
   	BufferedWriter bw = new BufferedWriter(file);
    PrintWriter pw = new PrintWriter(bw);
	for(int i=0;i<size;i++)
		{
			//pw.print(a.get(i).name +",");
			//pw.print(a.get(i).post +",");
			pw.print(a.get(i).username +",");
			pw.print(a.get(i).password +",");
			pw.print(a.get(i).uid +",");
			pw.print(a.get(i).department +",");
		}
		

	pw.print(personarray[i].status);
		if(i!= size-1)
		{
			pw.print("\n");
		}
	}

	pw.close();

}

public static void readfile()
{
	FileReader inp = new FileReader("dbqbasics.csv");
		BufferedReader bfile = new BufferedReader(inp);

		String line= bfile.readLine();
		int a=0,su=0,st=0;
		
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
			
			if(items.get(1).eqauls("admin"))
			{
				//admin[i].name = items.get(0);
				//admin[i].post = items.get(1);
				admin[i].username = items.get(2); 
				admin[i].password = items.get(3);
				admin[i].uid = Integer.parseInt(items.get(4));
				//admin[i].department = items.get(5);
				line= bfile.readLine();
				a++;
			}
			else if(items.get(1).eqauls("supervisor"))
			{
				//admin[i].name = items.get(0);
				//admin[i].post = items.get(1);
				supervisors[i].username = items.get(2); 
				supervisors[i].password = items.get(3);
				supervisors[i].uid = Integer.parseInt(items.get(4));	
				supervisors[i].department = items.get(5);
				line= bfile.readLine();
				su++;
			}
			else if(items.get(1).eqauls("staff"))
			{
				//admin[i].name = items.get(0);
				//admin[i].post = items.get(1);
				staffs[i].username = items.get(2); 
				staffs[i].password = items.get(3);
				staffs[i].uid = Integer.parseInt(items.get(4));
				staffs[i].department = items.get(5);
				line= bfile.readLine();
				st++;
			}
			
			
		}*/
}



