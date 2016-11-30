/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.IOException;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class GM extends JPanel{
	
	JLabel head = new JLabel("ADMIN");
	JButton homeB = new JButton("Home");
	JButton staffB = new JButton("Staff");
	JButton logisticsB = new JButton("Logistics");
	JButton reportsB = new JButton("Reports");
	JButton requestsB = new JButton("Requests");
	JButton logoutB = new JButton("Logout");
	
	JPanel homeP = new JPanel();
	JButton test = new JButton("this is test");
	
	login t;
	
	public GM(login tt)
	{
		t = tt;
		
		this.setLayout(null);
		
		this.add(head);
		head.setBounds(100, 50, 150, 50);
		head.setFont(new Font("Arial", Font.BOLD, 36));
		
		this.add(homeB);
		homeB.setBounds(100, 150, 100, 30);
		
		this.add(staffB);
		staffB.setBounds(200, 150, 100, 30);
		
		this.add(logisticsB);
		logisticsB.setBounds(300, 150, 100, 30);
		
		this.add(reportsB);
		reportsB.setBounds(400, 150, 100, 30);
		
		this.add(requestsB);
		requestsB.setBounds(500, 150, 110, 30);
		
		this.add(logoutB);
		logoutB.setBounds(610, 150, 100, 30);
		
		homeP.setLayout(null);
		this.add(homeP);
		homeP.setBounds(110, 250, 600, 500);
		homeP.setBackground(Color.DARK_GRAY);
		
		test.setBounds(210, 230, 50, 50);
		homeP.add(test);
		
		
		LogoutEvent log = new LogoutEvent();
		logoutB.addActionListener(log);
		
		
		
		
	}
	
	public class LogoutEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			try {
				login l = new login();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			t.goStart();
		}
	}
}
