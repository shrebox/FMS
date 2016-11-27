import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.IOException;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class SupervisorFr {
	
		JFrame supFrame = new JFrame("SUPERVISOR");
		
		JLabel head = new JLabel("SUPERVISOR");
		JButton homeB = new JButton("Home");
		JButton staffB = new JButton("Staff");
		JButton logisticsB = new JButton("Logistics");
		JButton reportsB = new JButton("Reports");
		JButton requestsB = new JButton("Requests");
		JButton logoutB = new JButton("Logout");
		
		
		public SupervisorFr()
		{
			supFrame.setVisible(true);
			supFrame.setResizable(false);
			supFrame.setSize(1000, 800);
			supFrame.setLayout(null);
			//supFrame.setLocationRelativeTo(null);
			
			supFrame.add(head);
			head.setBounds(100, 50, 300, 50);
			head.setFont(new Font("Arial", Font.BOLD, 36));
			
			supFrame.add(homeB);
			homeB.setBounds(100, 150, 100, 30);
			
			supFrame.add(staffB);
			staffB.setBounds(200, 150, 100, 30);
			
			supFrame.add(logisticsB);
			logisticsB.setBounds(300, 150, 100, 30);
			
			supFrame.add(reportsB);
			reportsB.setBounds(400, 150, 100, 30);
			
			supFrame.add(requestsB);
			requestsB.setBounds(500, 150, 110, 30);
			
			supFrame.add(logoutB);
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
				supFrame.dispose();
			}
		}
	}


