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

public class sendLeaveForm extends JFrame{
	
	/**
	 * It includes:
	 * 
	 * to whom
	 * reason
	 * date-range
	 */
	JLabel title = new JLabel("LEAVE FORM");
	JLabel towhom = new JLabel("To Whom:");
	JLabel reason = new JLabel("Reason");
	JLabel daterange = new JLabel("Date-Range:");
	JComboBox twbox;
	JTextField reasonTF = new JTextField("Valid!",250);
	JTextField daterangeTF = new JTextField("DD/MM - DD/MM",250);
	JButton cancel = new JButton("Cancel");
	JButton submit = new JButton("Submit");
	
	public sendLeaveForm()
	{
		
		String [] type = {"--select--","GM"};
		
		twbox = new JComboBox(type);
		
		title.setBounds(160, 50, 300, 50);
		title.setFont(new Font("Arial", Font.BOLD, 28));
		this.add(title);
		
		towhom.setBounds(100,150,100,20);
		this.add(towhom);
		
		twbox.setBounds(200,150,100,20);
		this.add(twbox);
		
		reason.setBounds(100,200,100,20);
		this.add(reason);
		
		reasonTF.setBounds(200, 200, 250, 20);
		this.add(reasonTF);
		
		daterange.setBounds(100, 250, 100, 20);
		this.add(daterange);
		
		daterangeTF.setBounds(200, 250, 250, 20);
		this.add(daterangeTF);
		
		submit.setBounds(130, 320, 120, 20);
		this.add(submit);
		submitEvent se = new submitEvent();
		cancel.addActionListener(se);
		
		cancel.setBounds(280, 320, 120, 20);
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
		sendLeaveForm slf = new sendLeaveForm();
	}*/

}
