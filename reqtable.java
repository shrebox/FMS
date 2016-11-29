import java.awt.*;
import javax.swing.*;

public class reqtable extends JFrame{
	
	JTable table;
	JButton approve,disapprove;
	JTextField submitTF;
	
	public reqtable()
	{
	
		String[] columnNames = {"Name", "Username", "Post", "Department"};
		
		Object[][] data = new Object[100][4];
		
		table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,100));
		table.setFillsViewportHeight(true);
		//table.setBounds(100, 200, 500, 200);
		
		//data[0][0]= "hi";
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		scrollPane.setBounds(100, 200, 500, 200);
		
		approve = new JButton("Approve");
		approve.setBounds(100, 600, 50, 20);
		
		disapprove = new JButton("Disapprove");
		disapprove.setBounds(400, 600, 50, 20);
		
		submitTF = new JTextField(250);
		submitTF.setBounds(700, 600, 100, 20);
		
		//add(table);
		add(approve);
		add(disapprove);
		add(submitTF);
		
		setLayout(null);		
		setSize(800, 800);
		setVisible(true);
		setTitle("Table");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		reqtable rt = new reqtable();
	}
	

	
}
