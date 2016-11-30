/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.io.File;
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
	
	JPanel homeP = new JPanel();
	JPanel homeP2 = new JPanel();
	
	JButton homeAssignTB = new JButton("Assign Task \nto Supervisor");
	
	JButton staffsupervisorB = new JButton("SUPERVISOR");
	JButton staffstaffB = new JButton("STAFF");
	JButton staff2viewB = new JButton("VIEW");
	JButton staff2deleteB = new JButton("DELETE");
	
	JButton logViewB = new JButton("VIEW LOGISTICS");
	
	JButton reportsViewB = new JButton("VIEW REPORTS");
	
	JButton reqLeaveB = new JButton("LEAVES");
	JButton reqLogisticsB = new JButton("LOGISTICS");
	JButton reqMembersB = new JButton("MEMBERS");
	
	Random rand = new Random(); 
	int supCount = rand.nextInt(100/2) *2;
	int stafCount= (rand.nextInt(100/2)*2) + 1;
	
	public GMFr()
	{
		gmFrame.setVisible(true);
		gmFrame.setResizable(false);
		gmFrame.setSize(800, 800);
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
		
		/**-------------------home panel-----------------------
		 * 
		 */
		
		homeP.setLayout(null);
		gmFrame.add(homeP);
		homeP.setBounds(100, 220, 600, 480);
		homeP.setBackground(Color.DARK_GRAY);
		
		homeAssignTB.setBounds(180, 200, 250,100);
		homeP.add(homeAssignTB);
		
		/*homeP2.setLayout(null);
		gmFrame.add(homeP2);
		homeP2.setBounds(100, 240, 600, 500);
		homeP2.setBackground(Color.CYAN);*/
		
		/**------------home screen buttons actionlistener-----------------
		 * 
		 */
		
		homeAssgnTEvent at = new homeAssgnTEvent();
		homeAssignTB.addActionListener(at);
				
		/**------------staff screen buttons actionlistener-----------------
		 * 
		 */
		
		staffsupvdEvent supvd = new staffsupvdEvent();
		staffsupervisorB.addActionListener(supvd);
		
		staffstaffvdEvent staffvd = new staffstaffvdEvent();
		staffstaffB.addActionListener(staffvd);
		
		staffvEvent sve = new staffvEvent();
		staff2viewB.addActionListener(sve);
		
		staffdEvent sde = new staffdEvent();
		staff2deleteB.addActionListener(sde);
		
		/**-------------logistics screen buttons actionlistener--------------*/
		
		
		logViewEvent lve = new logViewEvent();
		logViewB.addActionListener(lve);
		
		/**-------------reports screen buttons actionlistner-----------------
		 * 
		 */
		
		reportsViewEvent ve = new reportsViewEvent();
		reportsViewB.addActionListener(ve);
		
		/**--------------requests screen buttons actionlistener--------------
		 * -
		 */
		
		reqLeaveEvent le = new reqLeaveEvent();
		reqLeaveB.addActionListener(le);
		
		reqLogisticsEvent loe = new reqLogisticsEvent();
		reqLogisticsB.addActionListener(loe);
		
		reqMembersEvent me = new reqMembersEvent();
		reqMembersB.addActionListener(me);
		
		/**-----------------tab action listeners-----------------
		 * 
		 */
		
		
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
			
			homeAssignTB.setBounds(180, 200, 250,100);
			homeP.add(homeAssignTB);
			
		}
	}
	
	public class staffEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			homeP.removeAll();
			homeP.revalidate();
			homeP.repaint();
			
			staffsupervisorB.setBounds(235, 130, 130, 40);
			homeP.add(staffsupervisorB);
			
			staffstaffB.setBounds(235, 240, 130, 40);
			homeP.add(staffstaffB);
			
			staff2viewB.setBounds(170, 370, 100, 40);
			staff2viewB.setEnabled(false);
			homeP.add(staff2viewB);
			
			staff2deleteB.setBounds(320, 370, 100, 40);
			staff2deleteB.setEnabled(false);
			homeP.add(staff2deleteB);
		}
	}
	
	public class logisticsEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			homeP.removeAll();
			homeP.revalidate();
			homeP.repaint();
			
			logViewB.setBounds(210, 150, 200, 200);
			homeP.add(logViewB);
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
			gmFrame.dispose();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------
	
	public class homeAssgnTEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			taskgenform form = new taskgenform();

		}
	}
	
	public class staffvEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if(stafCount==1)
			{
				//------fill the table with staff data-----------------
				
				viewSupStaffTable table = new viewSupStaffTable(1);
			}
			
			else
			{
				//-------fill the table with supervisor data-----------
				
				viewSupStaffTable table = new viewSupStaffTable(2);
			}
		}
	}
	
	public class staffdEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if(stafCount==1)
			{
				//------fill the table with staff data-----------------
				
				delSupStaffTable table = new delSupStaffTable();
			}
			
			else
			{
				//-------fill the table with supervisor data-----------
				
				delSupStaffTable table = new delSupStaffTable();
			}
		}
	}
	
	public class staffstaffvdEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			//stafCount= (rand.nextInt(100/2)*2) + 1;
			stafCount=1;
			supCount=0;
			staffsupervisorB.setEnabled(true);
			staffstaffB.setEnabled(false);
			staff2viewB.setEnabled(true);
			staff2deleteB.setEnabled(true);
			
			System.out.println("stafCount: " + stafCount + "supCount" + supCount);
		}
	}
	
	public class logViewEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			viewSupStaffTable lgv = new viewSupStaffTable(3);
		}
	}
	
	public class staffsupvdEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			//supCount = rand.nextInt(100/2) *2;
			stafCount=0;
			supCount=1;
			staffsupervisorB.setEnabled(false);
			staffstaffB.setEnabled(true);
			staff2viewB.setEnabled(true);
			staff2deleteB.setEnabled(true);
			
			System.out.println("stafCount: " + stafCount + "supCount" + supCount);
			
			
		}

	}
	
	public class reportsViewEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			try{
				Desktop.getDesktop().open(new File("/home/shrebox/reports"));
			}
			catch(Exception ex){}
		}
	}
	
	public class reqLeaveEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			reqtable rt = new reqtable();
		}
	}
	
	public class reqLogisticsEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			reqtable rt = new reqtable();
		}
	}

	public class reqMembersEvent implements ActionListener{
	
	public void actionPerformed(ActionEvent e)
	{
		
		reqtable rt = new reqtable();
	}
}
	
	
}
