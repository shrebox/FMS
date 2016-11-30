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

public class StaffFr {
	
		JFrame staffFrame = new JFrame("STAFF");
		
		JLabel head = new JLabel("STAFF");
		JButton homeB = new JButton("Home");
		JButton staffB = new JButton("Staff");
		JButton logisticsB = new JButton("Logistics");
		JButton reportsB = new JButton("Reports");
		JButton requestsB = new JButton("Requests");
		JButton logoutB = new JButton("Logout");
		
		JPanel homeP = new JPanel();
		
		JButton homeSendLeaveB = new JButton("Send Leave Request");
		JButton homeUpdateSelfStatB = new JButton("Update Self Status");
		JButton homeUpdateTaskStatB = new JButton("Update Task Status");
		
		JButton logSendReqB = new JButton("SEND REQUEST");
		
		JButton reportsViewB = new JButton("GENERATE REPORT");
		
		
		public StaffFr()
		{
			staffFrame.setVisible(true);
			staffFrame.setResizable(false);
			staffFrame.setSize(800, 800);
			staffFrame.setLayout(null);
			//staffFrame.setLocationRelativeTo(null);
			
			staffFrame.add(head);
			head.setBounds(100, 50, 300, 50);
			head.setFont(new Font("Arial", Font.BOLD, 36));
			
			staffFrame.add(homeB);
			homeB.setBounds(100, 150, 100, 30);
			
			staffFrame.add(logisticsB);
			logisticsB.setBounds(300, 150, 100, 30);
			
			staffFrame.add(reportsB);
			reportsB.setBounds(400, 150, 100, 30);
			
			staffFrame.add(logoutB);
			logoutB.setBounds(600, 150, 100, 30);
			
			//===========home panel=========================
			
			homeP.setLayout(null);
			staffFrame.add(homeP);
			homeP.setBounds(100, 220, 600, 480);
			homeP.setBackground(Color.DARK_GRAY);
			
			homeSendLeaveB.setBounds(180, 100, 250, 25);
			homeP.add(homeSendLeaveB);
			
			homeUpdateSelfStatB.setBounds(180, 200, 250, 25);
			homeP.add(homeUpdateSelfStatB);
			
			homeUpdateTaskStatB.setBounds(180, 300, 250, 25);
			homeP.add(homeUpdateTaskStatB);
			
			//----------------tab buttons action listeners--------------
			
			homeEvent he = new homeEvent();
			homeB.addActionListener(he);
			
			logisticsEvent loge = new logisticsEvent();
			logisticsB.addActionListener(loge);
			
			reportsEvent re = new reportsEvent();
			reportsB.addActionListener(re);
			
			LogoutEvent log = new LogoutEvent();
			logoutB.addActionListener(log);
		}
		
		public class homeEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				homeSendLeaveB.setBounds(180, 100, 250, 25);
				homeP.add(homeSendLeaveB);
				
				homeUpdateSelfStatB.setBounds(180, 200, 250, 25);
				homeP.add(homeUpdateSelfStatB);
				
				homeUpdateTaskStatB.setBounds(180, 300, 250, 25);
				homeP.add(homeUpdateTaskStatB);
				
			}
		}
		

		public class logisticsEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				logSendReqB.setBounds(210, 180, 200, 50);
				homeP.add(logSendReqB);
				
				
			}
		}
		
		public class reportsEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				reportsViewB.setBounds(210, 180, 200, 50);
				homeP.add(reportsViewB);
			}
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


