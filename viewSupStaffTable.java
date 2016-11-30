import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class viewSupStaffTable{
	
	JFrame viewfr = new JFrame();
	JTable table;
	JButton close;
	int mainCount=-1;
	
	Object[][] data;
	data objct;
	logistics log;
	
	public viewSupStaffTable(int count)
	{
		mainCount = count;
		try {
			objct = new data();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log = new logistics();
		
		if(mainCount==1 || mainCount==2)
		{
			
			data = new Object[100][7];
		String[] columnNames = {"ID","Name", "Username", "Dept.","Status"
				,"Task","T-Status"};
		

		table = new JTable(data,columnNames){
			 private static final long serialVersionUID = 1L;
		        public boolean isCellEditable(int row, int column) {                
		                return false;};};
		                
		                if(mainCount==2)
		     		   {
		     			   viewStaff();
		     		   }
		     		   else if(mainCount==1)
		     		   {
		     			   viewSupervisor();
		     		   }
	
		}
		
		else if(mainCount==3)
		{
			data = new Object[100][5];
			String[] columnNames = {"ID","Username", "Dept.","No. of items"
					,"Items"};
			

			table = new JTable(data,columnNames){
				 private static final long serialVersionUID = 1L;
			        public boolean isCellEditable(int row, int column) {                
			                return false;};};		                
			        viewLog();
		}
		                
		table.setPreferredScrollableViewportSize(new Dimension(600,100));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		viewfr.add(scrollPane);
		scrollPane.setBounds(50, 50, 500, 200);
		
		close = new JButton("Close");
		close.setBounds(230, 280, 120, 20);
		
		closeEvent ce = new closeEvent();
		close.addActionListener(ce);
		
		viewfr.add(close);
		
		viewfr.setLayout(null);		
		viewfr.setSize(630,350);
		viewfr.setVisible(true);
		viewfr.setTitle("Member Registration Requests");
	}
	
	public class closeEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			viewfr.dispose();
		}
	}
	
	public void viewStaff()
	{
		for(int i=0;i<objct.numSuperv();i++)
		{
			data[i][0] = objct.supervisors.get(i).getId();
			data[i][1] = objct.supervisors.get(i).getName();
			data[i][2] = objct.supervisors.get(i).getUsername();
			data[i][3] = objct.supervisors.get(i).getDepartment();
			
		}
	}
	
	public void viewSupervisor()
	{
		for(int i=0;i<objct.numStaff();i++)
		{
			data[i][0] = objct.staffs.get(i).getId();
			data[i][1] = objct.staffs.get(i).getName();
			data[i][2] = objct.staffs.get(i).getUsername();
			data[i][3] = objct.staffs.get(i).getDepartment();
			
		}
	}
	
	public void viewLog()
	{
		for(int i=0;i<objct.numSuperv();i++)
		{
			System.out.println(i);
			data[i][0] = objct.supervisors.get(i).getId();
			data[i][1] =  objct.supervisors.get(i).getName();
			data[i][2] =  objct.supervisors.get(i).getUsername();
			data[i][3] =  objct.supervisors.get(i).getDepartment();
			data[i][4] = log.num[i];
			
			if(i==0)
			{
				for(int j=0;j<log.num[i];j++)
				{
					data[j+i][5] =objct.supervisors.get(log.num[j]).storeditems.get(j);
				}
			}
			
		}
		
	}

}
