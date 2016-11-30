/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

public class memreqdata {
	
	static ArrayList<forRequests> list = new ArrayList<forRequests>();
	int size=0;
	reqtable table;
	
	{
		for(int i=0;i<100;i++)
		{
			list.add(new forRequests());
		}
	}
	
	public memreqdata(reqtable ta)
	{
		table = ta;
		try {
			size = reading(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int reading(ArrayList<forRequests> list) throws IOException
	{
		FileReader inp = new FileReader("db1register.csv");
		BufferedReader bfile = new BufferedReader(inp);
		String line= bfile.readLine();
		int a=0;
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
			
			list.get(a).setName(items.get(0));
			list.get(a).setPost(items.get(1));
			list.get(a).setUsername(items.get(2)); 
			list.get(a).setPassword(items.get(3));
			list.get(a).setDep(items.get(4));
			list.get(a).setDOB(items.get(5));
			list.get(a).setAdr(items.get(6));
			
			line= bfile.readLine();
			a++;
		}
			return a;
	}
	
	public void writeTable(ArrayList<forRequests> list)
	{
		for(int i=0;i<size;i++)
		{
			table.data[i][0] = list.get(i).getName();
			table.data[i][1] = list.get(i).getUsername();
			table.data[i][2] = list.get(i).getPost();
			table.data[i][3] = list.get(i).getDep();
			
		}
	}
	
	public void add()
	{
		
	}
	
	
	
	

}
