import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.* ;
import java.util.*;

public class RegPage extends JPanel{
	
	private JPanel regPanel,leftPanel;
	private JButton name,username,password,DOB,address,department;
	private Choice type;
	private Label typeName;

	public RegPage()
	{
		regPanel = new JPanel();
		regPanel.setLayout(new BoxLayout(regPanel, BoxLayout.X_AXIS));
		regPanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setBorder(new EmptyBorder(new Insets(50, 0, 50, 50)));
		regPanel.add(leftPanel);
		
		typeName = new Label("Type:",Label.LEFT);
		leftPanel.add(typeName);
		
		type = new Choice();
		type.add("Supervisor");
		type.add("Staffer");
		type.setBounds(120,260,100,20);
		leftPanel.add(type);
		
		add(regPanel);
		
	}
}
