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

public class login extends JFrame{

	private JPanel startPanel,loginPanel;
	private JLabel title,name;
	private JButton login, googlelogin, register;
	private LoginPage LP;
	private GM gm;
	
	
	public void goStart(){
		setContentPane(startPanel);
		revalidate();
	}
	
	public void goadminPanel()
	{
		setContentPane(gm);
		revalidate();
	}

	public login() throws IOException 
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
		
		//startPanel.setBackground(Color.CYAN);

		add(startPanel);
		
		LP = new LoginPage(this);
		LP.setLayout(new BoxLayout(LP, BoxLayout.Y_AXIS));
		LP.setBorder(new EmptyBorder(new Insets(200, 200, 200, 200)));
		
		gm = new GM(this);
		
		loginUserEvent LUE = new loginUserEvent();  
		login.addActionListener(LUE);
		
		regUserEvent RUE = new regUserEvent();  
		register.addActionListener(RUE);
		
		
		
		pack();
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FMS System");
		setLocationRelativeTo(null);
		

		//loginevent log = new loginevent();
		//login.addActionListener(log);
	}

	public class loginUserEvent implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			setContentPane(LP);
			revalidate();
		}
		
	}
	
	public class regUserEvent implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			try {
				RegPage RP = new RegPage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
}



