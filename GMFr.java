import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.IOException;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class GMFr {

	JFrame gmFrame = new JFrame("GM");
	
	JLabel head = new JLabel("ADMIN");
	JButton homeB = new JButton("Home");
	JButton staffB = new JButton("Staff");
	JButton logisticsB = new JButton("Logistics");
	JButton reportsB = new JButton("Reports");
	JButton requestsB = new JButton("Requests");
	JButton logoutB = new JButton("Logout");
	
	
	public GMFr()
	{
		gmFrame.setVisible(true);
		gmFrame.setResizable(false);
		gmFrame.setSize(1000, 800);
		gmFrame.setLayout(null);
		//gmFrame.setLocationRelativeTo(null);
		
		gmFrame.add(head);
		head.setBounds(100, 50, 150, 50);
		head.setFont(new Font("Arial", Font.BOLD, 36));
		
		gmFrame.add(homeB);
		homeB.setBounds(100, 150, 100, 30);
		
		gmFrame.add(staffB);
		staffB.setBounds(200, 150, 100, 30);
		
		gmFrame.add(logisticsB);
		logisticsB.setBounds(300, 150, 100, 30);
		
		gmFrame.add(reportsB);
		reportsB.setBounds(400, 150, 100, 30);
		
		gmFrame.add(requestsB);
		requestsB.setBounds(500, 150, 110, 30);
		
		gmFrame.add(logoutB);
		logoutB.setBounds(610, 150, 100, 30);
		
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
			gmFrame.dispose();
		}
	}
}
