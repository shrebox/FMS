import java.util.*;
public class logistics {
	
	List<String> storeditems = new ArrayList<String> (100);
	ArrayList<supervisor> spr = new ArrayList<supervisor>();

	private String username;
	private String department;
	private int num;
	
	public logistics()
	{
		
	}
	
	public String logisticsAvb()
	{
		return "logistics";
	}
	
	public void storeInventory()
	{
		FileReader inp = new FileReader("db4logistic.csv");
		BufferedReader bfile = new BufferedReader(inp);

		String line= bfile.readLine();
		int l=0;
		
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
			
				spr[l].getName = items.get(0); 
				spr[l].getDepartment = items.get(1);
				spr[l].num = Integer.parseInt(items.get(2));

				for(int j=0;j<num;j++)
				{
					spr[l].storeditems.add(items.get(3+j));
				}

				
				line= bfile.readLine();
				l++;
		}
	}

	
}

