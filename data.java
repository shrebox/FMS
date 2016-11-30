/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.awt.FlowLayout ;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;
import java.awt.* ;
import javax.swing.JFrame ;
import javax.swing.JLabel ; 
import javax.swing.* ;
import java.util.*;
import java.io.*;
import java.util.List;

public class data{

		static ArrayList<admin> admin ;
		static ArrayList<supervisor> supervisors ;
		static ArrayList<staff> staffs ;
		static ArrayList<String> checker ;

		String check ;
		int a=0,su=0,st=0,i=0;

	public data() throws IOException
	{
		admin = new ArrayList<admin>();
		supervisors = new ArrayList<supervisor>();
		staffs = new ArrayList<staff>();
		checker = new ArrayList<String>();

		for(int i=0;i<100;i++)
		{
			admin.add(new admin());
		}
		for(int i=0;i<100;i++)
		{
			supervisors.add(new supervisor());
		}
		for(int i=0;i<100;i++)
		{
			staffs.add(new staff());
		}

		readfile();
	}

	public void readfile() throws IOException
	{
		FileReader inp = new FileReader("db1basics.csv");
		BufferedReader bfile = new BufferedReader(inp);

		String line= bfile.readLine();
		
		
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
			check = items.get(1);
			
			if(check.equals("admin"))
			{
				admin.get(a).setName(items.get(0));
				admin.get(a).setPost(items.get(1));
				admin.get(a).setUsername(items.get(2)); 
				admin.get(a).setPassword(items.get(3));
				admin.get(a).setId((items.get(4)));
				//admin.get(i).setDepartment(items.get(5));
				admin.get(a).setDob(items.get(6));
				admin.get(a).setAdr(items.get(7));
				line= bfile.readLine();
				a++;
			}
			else if(check.equals("supervisor"))
			{
				supervisors.get(su).setName(items.get(0));
				supervisors.get(su).setPost(items.get(1));
				supervisors.get(su).setUsername(items.get(2)); 
				supervisors.get(su).setPassword(items.get(3));
				supervisors.get(su).setId(items.get(4));	
				supervisors.get(su).setDepartment(items.get(5));
				supervisors.get(su).setDob(items.get(6));
				supervisors.get(su).setAdr(items.get(7));
				line= bfile.readLine();
				su++;
			}
			else if(check.equals("staff"))
			{
				staffs.get(st).setName(items.get(0));
				staffs.get(st).setPost(items.get(1));
				staffs.get(st).setUsername(items.get(2)); 
				staffs.get(st).setPassword(items.get(3));
				staffs.get(st).setId((items.get(4)));
				staffs.get(st).setDepartment(items.get(5));
				staffs.get(st).setDob(items.get(6));
				staffs.get(st).setAdr(items.get(7));
				line= bfile.readLine();
				st++;
			}		
		}
	}
	
	public int numAdmin()
	{
		return a;
	}
	
	public int numStaff()
	{
		return st;
	}
	
	public int numSuperv()
	{
		return su;
	}

	
	
}