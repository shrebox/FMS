/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
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

public class supStaffviewTable {
	
	JFrame viewfr = new JFrame();
	JTable table;
	JButton close;
	int mainCount=-1;
	
	Object[][] data;
	
	String department = "";
	
	public supStaffviewTable(String dept)
	{
		/**
		 * department variable to compare according to it to open 
		 * the view of the particular department only
		 */
		
		department = dept;
			
			data = new Object[100][7];
		String[] columnNames = {"ID","Name", "Username", "Dept.","Status"
				,"Task","T-Status"};
		

		table = new JTable(data,columnNames){
			 private static final long serialVersionUID = 1L;
		        public boolean isCellEditable(int row, int column) {                
		                return false;};};
	        
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
	
	/*public static void main(String args[])
	{
		viewSupStaffTable n = new viewSupStaffTable();
	}*/

}
