import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
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
	
	login t;
	
	public GM(login tt)
	{
		t = tt;
		
		this.setLayout(null);
		
		this.add(head);
		head.setBounds(50, 20, 50, 50);
		head.setSize(new Dimension(100,100));
		
		//add(homePanel);
		
		//homePanel.repaint();
		
	}
	
	

}
