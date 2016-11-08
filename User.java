import java.util.*;
public class User {
	
	private String username;
	private String password;
	private int uid;
	
	public User(String x, String y,int i)
	{
		setName(x);
		setPassword(y);
		setId(i);
	}
	
	public void setName(String x)
	{
		username = x;
	}
	
	public String getName()
	{
		return username;
	}
	
	public void setPassword(String y)
	{
		password = y;
	}
	
	public String getPassword()
	{
		return password;
	}

	public void setId(int i)
	{
		uid = i;
	}
	
	public int getId()
	{
		return uid;
	}
	
	
	
}

