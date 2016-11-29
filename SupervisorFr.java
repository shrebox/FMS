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
		
		JPanel homeP = new JPanel();
		
		JButton homeAssignTB = new JButton("Assign Task \nto Staff");
		JButton homeSendLeaveB = new JButton("Send Leave Request");
		JButton homeUpdateSelfStatB = new JButton("Update Self Status");
		JButton homeUpdateTaskStatB = new JButton("Update Task Status");
		
		JButton staffstaffB = new JButton("STAFF");
		JButton staff2viewB = new JButton("VIEW");
		JButton staff2deleteB = new JButton("DELETE");
		
		JButton logViewB = new JButton("VIEW LOGISTICS");
		JButton logSendReqB = new JButton("SEND REQUEST");
		
		JButton reportsViewB = new JButton("VIEW REPORTS");
		
		JButton reqLeaveB = new JButton("LEAVES");
		JButton reqLogisticsB = new JButton("LOGISTICS");
		JButton reqMembersB = new JButton("MEMBERS");
		
		Random rand = new Random(); 
		int stafCount= (rand.nextInt(100/2)*2) + 1;
		
		public SupervisorFr()
		{
			supFrame.setVisible(true);
			supFrame.setResizable(false);
			supFrame.setSize(800, 800);
			supFrame.setLayout(null);
			supFrame.setLocationRelativeTo(null);
			
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
			
			//------------home panel-----------------------------
			
			homeP.setLayout(null);
			supFrame.add(homeP);
			homeP.setBounds(100, 220, 600, 480);
			homeP.setBackground(Color.DARK_GRAY);
			
			homeAssignTB.setBounds(180, 90, 250,25);
			homeP.add(homeAssignTB);
			
			homeSendLeaveB.setBounds(180, 190, 250, 25);
			homeP.add(homeSendLeaveB);
			
			homeUpdateSelfStatB.setBounds(180, 290, 250, 25);
			homeP.add(homeUpdateSelfStatB);
			
			homeUpdateTaskStatB.setBounds(180, 390, 250, 25);
			homeP.add(homeUpdateTaskStatB);
			
			//----------------home screen buttons actionlistener-----------
			
			//----------------staff screen buttons actionlistener----------
			
			staffstaffvdEvent staffvd = new staffstaffvdEvent();
			staffstaffB.addActionListener(staffvd);
			
			//-----------------logistics screen action listeners----------------
			
			logViewEvent lve = new logViewEvent();
			logViewB.addActionListener(lve);
			
			logSendReqEvent lsre = new logSendReqEvent();
			logSendReqB.addActionListener(lsre);
			
			//-----------------reports screen action listeners------------------
			
			//-----------------requests screen action listeners-----------------
			
			
			//----------------tab buttons action listeners--------------
			
			homeEvent he = new homeEvent();
			homeB.addActionListener(he);
			
			staffEvent se = new staffEvent();
			staffB.addActionListener(se);
			
			logisticsEvent loge = new logisticsEvent();
			logisticsB.addActionListener(loge);
			
			reportsEvent re = new reportsEvent();
			reportsB.addActionListener(re);
			
			requestsEvent rre = new requestsEvent();
			requestsB.addActionListener(rre);
			
			LogoutEvent log = new LogoutEvent();
			logoutB.addActionListener(log);
			
			
		}
		
		public class homeEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				homeAssignTB.setBounds(180, 90, 250,25);
				homeP.add(homeAssignTB);
				
				homeSendLeaveB.setBounds(180, 190, 250, 25);
				homeP.add(homeSendLeaveB);
				
				homeUpdateSelfStatB.setBounds(180, 290, 250, 25);
				homeP.add(homeUpdateSelfStatB);
				
				homeUpdateTaskStatB.setBounds(180, 390, 250, 25);
				homeP.add(homeUpdateTaskStatB);
				
			}
		}
		
		public class staffEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				staffstaffB.setBounds(235, 140, 130, 40);
				homeP.add(staffstaffB);
				
				staff2viewB.setBounds(170, 270, 100, 40);
				staff2viewB.setEnabled(false);
				homeP.add(staff2viewB);
				
				staff2deleteB.setBounds(320, 270, 100, 40);
				staff2deleteB.setEnabled(false);
				homeP.add(staff2deleteB);
			}
		}
		
		public class logisticsEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				logViewB.setBounds(210, 150, 200, 50);
				homeP.add(logViewB);
				
				logSendReqB.setBounds(210, 300, 200, 50);
				homeP.add(logSendReqB);
				
				
			}
		}
		
		public class reportsEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				reportsViewB.setBounds(210, 150, 200, 200);
				homeP.add(reportsViewB);
			}
		}
		
		public class requestsEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				homeP.removeAll();
				homeP.revalidate();
				homeP.repaint();
				
				reqLeaveB.setBounds(235,110 , 130, 40);
				homeP.add(reqLeaveB);
				
				reqLogisticsB.setBounds(235, 210, 130, 40);
				homeP.add(reqLogisticsB);
				
				reqMembersB.setBounds(235, 310, 130, 40);
				homeP.add(reqMembersB);
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
				supFrame.dispose();
			}
		}
		
		//-----------------------------------------------------------------
		
		public class staffstaffvdEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				//supCount = rand.nextInt(100/2) *2;
				//staffsupervisorB.setEnabled(false);
				staffstaffB.setEnabled(false);
				staff2viewB.setEnabled(true);
				staff2deleteB.setEnabled(true);
				
				
			}

		}
		
		public class logViewEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				
			}
		}
		
		public class logSendReqEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				
			}
		}
	}


