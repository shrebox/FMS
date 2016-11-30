/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class taskgenform {

	JFrame taskfr = new JFrame();
	
	JLabel head = new JLabel("Task Assignment Form");
	
	JLabel id = new JLabel("ID:");
	JLabel idDescription = new JLabel("ID will be system generated");
	
	JLabel name = new JLabel("Task Name:");
	JTextField nameTF = new JTextField("",250);
	
	JLabel description = new JLabel("Task Description:");
	JTextArea descpTA = new JTextArea(250,100);
	
	String departmentA[] = {"--select department--", "Electricity", "Security","HVAC","Audio/Video","Housekeeping"};
	JLabel departmentL = new JLabel("Department:");
	JComboBox departmentF = new JComboBox(departmentA);

	JLabel staffNo = new JLabel("Staff:");
	JTextField staffNoTF = new JTextField("min. 1 staff is required",250);
	
	JLabel equipment = new JLabel("Equipment:");
	JTextArea equipTA = new JTextArea(250,100);
	
	JLabel status  = new JLabel("Status:");
	JTextField statusTF = new JTextField("",250);
	
	JLabel deadline  = new JLabel("Deadline:");
	JTextField deadlineTF = new JTextField("DD/MM/YY",250);
	
	JButton submitB = new JButton("Submit");
	JButton cancelB = new JButton("Cancel");
	
	public taskgenform()
	{
		taskfr.setVisible(true);
		taskfr.setResizable(false);
		taskfr.setSize(700, 800);
		taskfr.setLayout(null);
		
		taskfr.add(head);
		head.setBounds(100, 20, 400, 50);
		head.setFont(new Font("Arial", Font.BOLD, 28));

		
		taskfr.add(id);
		id.setBounds(100, 50, 100, 100);
		
		taskfr.add(idDescription);
		idDescription.setBounds(300, 50, 250, 100);
		idDescription.setForeground(Color.RED);
		
		taskfr.add(name);
		name.setBounds(100,80,100,100);
		
		taskfr.add(nameTF);
		nameTF.setBounds(300, 120, 250, 20);
		
		taskfr.add(description);
		description.setBounds(100,150,150,100);
		
		taskfr.add(descpTA);
		descpTA.setBounds(300,150,250,100);
		
		taskfr.add(departmentL);
		departmentL.setBounds(100,240,150,100);
		
		taskfr.add(departmentF);
		departmentF.setBounds(300,270,250,30);
		
		taskfr.add(staffNo);
		staffNo.setBounds(100, 280, 150, 100);
		
		taskfr.add(staffNoTF);
		staffNoTF.setBounds(300, 320, 250, 20);
		
		taskfr.add(equipment);
		equipment.setBounds(100, 350, 150, 100);
		
		taskfr.add(equipTA);
		equipTA.setBounds(300, 350, 250, 100);
		
		taskfr.add(status);
		status.setBounds(100, 435, 150, 100);
		
		taskfr.add(statusTF);
		statusTF.setBounds(300, 475, 250, 20);
		
		taskfr.add(deadline);
		deadline.setBounds(100,475,150,100);
		
		taskfr.add(deadlineTF);
		deadlineTF.setBounds(300, 510, 250, 20);
		
		taskfr.add(submitB);
		submitB.setBounds(300, 620, 250, 20);
		
		taskfr.add(cancelB);
		cancelB.setBounds(300, 650, 250, 20);
		
		cancelEvent can = new cancelEvent();
		cancelB.addActionListener(can);
		
		submitEvent sub = new submitEvent();
		submitB.addActionListener(sub);
	}

	public class cancelEvent implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			taskfr.dispose();
		}

	}
	
	public class submitEvent implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			taskfr.dispose();
		}

	}
	
}
