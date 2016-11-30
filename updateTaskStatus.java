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

public class updateTaskStatus extends JFrame{
	
	JLabel title = new JLabel("SELF STATUS");
	JLabel towhom = new JLabel("Choose Status:");
	JComboBox twbox;
	JButton cancel = new JButton("Cancel");
	JButton submit = new JButton("Submit");
	
	public updateTaskStatus()
	{
		String [] type = {"--select--","NOT-STARTED","ONGOING","COMPLETE"};
		
		twbox = new JComboBox(type);
		
		title.setBounds(100, 50, 300, 50);
		title.setFont(new Font("Arial", Font.BOLD, 28));
		this.add(title);
		
		towhom.setBounds(100,150,150,20);
		this.add(towhom);
		
		twbox.setBounds(250,150,100,20);
		this.add(twbox);
		
		submit.setBounds(100, 250, 120, 20);
		this.add(submit);
		submitEvent se = new submitEvent();
		cancel.addActionListener(se);
		
		cancel.setBounds(250, 250, 120, 20);
		this.add(cancel);
		closeEvent e = new closeEvent();
		cancel.addActionListener(e);
		
		this.setLayout(null);
		this.setSize(500,400);
		this.setVisible(true);
		this.setResizable(false);
		
		
	}
	
	public class submitEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	
	public class closeEvent implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
	
	/*public static void main(String args[])
	{
		updateSelfStatus slf = new updateSelfStatus();
	}*/

}
