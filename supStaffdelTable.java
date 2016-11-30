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

public class supStaffdelTable {
	
	JFrame del = new JFrame();
	JTable table;
	JButton delete,cancel;
	JTextField idTF,usernameTF;
	JLabel id,username;
	
	Object[][] data = new Object[100][5];
	
	String department= "";
	
	public supStaffdelTable(String dept)
	{
		/**
		 * department variable to delete a particular department's 
		 * staff only
		 */
		
		department = dept;
		
		String[] columnNames = {"ID","Name", "Username", "Post", "Department"};
		
		table = new JTable(data,columnNames){
			 private static final long serialVersionUID = 1L;
		        public boolean isCellEditable(int row, int column) {                
		                return false;};};
		                
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		del.add(scrollPane);
		scrollPane.setBounds(50, 50, 500, 200);
		
		id =new JLabel("ID:");
		id.setBounds(80, 280, 70, 20);
		
		username =new JLabel("Username:");
		username.setBounds(80, 310, 90, 20);
		
		delete = new JButton("Delete");
		delete.setBounds(320, 290, 100, 20);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(440, 290, 100, 20);
		
		idTF = new JTextField(250);
		idTF.setBounds(180, 280, 120, 20);
		
		usernameTF = new JTextField(250);
		usernameTF.setBounds(180, 310, 120, 20);
		
		del.add(delete);
		del.add(cancel);
		del.add(idTF);
		del.add(usernameTF);
		del.add(id);
		del.add(username);
		
		del.setLayout(null);		
		del.setSize(620,380);
		del.setVisible(true);
		del.setTitle("Delete Members");
		del.setResizable(false);
		del.setBackground(Color.DARK_GRAY);
		
		closeEvent ce =  new closeEvent();
		cancel.addActionListener(ce);
		
		
	}
	
	public class closeEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			del.dispose();
		}
	}
	

	/*public static void main(String args[])
	{
		delSupStaffTable n = new delSupStaffTable();
	}*/

}
