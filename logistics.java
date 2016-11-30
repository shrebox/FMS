/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.util.*;
import java.io.*;
public class logistics {
	
	List<String> storeditems = new ArrayList<String> (100);
	int num[] = new int[100];

	private String username;
	private String department;
	private int no;
	private String id;
	
	data ob;
	
	public logistics()
	{
		try {
			ob = new data();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String logisticsAvb()
	{
		return "logistics";
	}
	
	public void storeInventory() throws IOException
	{
		FileReader inp = new FileReader("db4logistic.csv");
		BufferedReader bfile = new BufferedReader(inp);

		String line= bfile.readLine();
		int l=0;
		
		while(line!= null)
		{
			List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
				
				data.supervisors.get(l).setId(items.get(0));
				data.supervisors.get(l).setName(items.get(1)); 
				data.supervisors.get(l).setDepartment(items.get(2));
				num[l] = Integer.parseInt(items.get(3));

				for(int j=0;j<num[l];j++)
				{
					data.supervisors.get(l).storeditems.add(items.get(4+j));
				}

				
				line= bfile.readLine();
				l++;
		}
	}

	public void updateInventory(ArrayList<supervisor> a,int size) throws IOException
	{

	FileWriter file = new FileWriter("db4logistic.csv",false);
   	BufferedWriter bw = new BufferedWriter(file);
    PrintWriter pw = new PrintWriter(bw);
	int i=0;
	for(i=0;i<size;i++)
	{	
		pw.println(a.get(i).getId());
		pw.print(a.get(i).getName() +",");
		pw.print(a.get(i).getDepartment() +",");
		pw.print(num[i]);
		for(int j=0;j<num[i];j++)
		{
			pw.print(a.get(num[i]).storeditems.get(j)+",");
		}
		
		if(i!= size-1)
		{
			pw.print("\n");
		}
			
	}
	pw.close();		
	}
}

