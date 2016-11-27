import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.IOException;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class StaffFr {
	
		JFrame staffFrame = new JFrame("STAFF");
		
		JLabel head = new JLabel("STAFF");
		JButton homeB = new JButton("Home");
		JButton staffB = new JButton("Staff");
		JButton logisticsB = new JButton("Logistics");
		JButton reportsB = new JButton("Reports");
		JButton requestsB = new JButton("Requests");
		JButton logoutB = new JButton("Logout");
		
		
		public StaffFr()
		{
			staffFrame.setVisible(true);
			staffFrame.setResizable(false);
			staffFrame.setSize(1000, 800);
			staffFrame.setLayout(null);
			//staffFrame.setLocationRelativeTo(null);
			
			staffFrame.add(head);
			head.setBounds(100, 50, 300, 50);
			head.setFont(new Font("Arial", Font.BOLD, 36));
			
			staffFrame.add(homeB);
			homeB.setBounds(100, 150, 100, 30);
			
			staffFrame.add(staffB);
			staffB.setBounds(200, 150, 100, 30);
			
			staffFrame.add(logisticsB);
			logisticsB.setBounds(300, 150, 100, 30);
			
			staffFrame.add(reportsB);
			reportsB.setBounds(400, 150, 100, 30);
			
			staffFrame.add(requestsB);
			requestsB.setBounds(500, 150, 110, 30);
			
			staffFrame.add(logoutB);
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
				staffFrame.dispose();
			}
		}
	}


