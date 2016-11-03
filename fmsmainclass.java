import java.util.*;
public class fmsmainclass {
	
	staff[] staff = new staff[100];
	supervisor[] supervisor = new supervisor[5]; 
	admin gm = new admin();
	
	public fmsmainclass()
	{

		for(int i=0;i<100;i++)
		{
			staff[i]=new staff();
		}
		for(int i=0;i<5;i++)
		{
			supervisor[i]=new supervisor();
		}
	}
	
	public static void main()
	{
		

	}
	
	public int DepartmentId()
	{
		return 0;
	}

	
	
		
	
}