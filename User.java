/** author @ Shreyash Arya (2015097)h
	    Tushita Rathore (2015108)
*/
import java.util.*;
public class User {
	
	private String name;
	private String post;
	private String username;
	private String password;
	private String uid;
	private String dob;
	private String adr;
/*	public User(String x, String y,int i)
	{
		setName(x);
		setPassword(y);
		setId(i);
	}
*/	
	public void setName(String x)
	{
		name = x;
	}
	
	public String getName()
	{
		return name;
	}

	public void setPost(String x)
	{
		post = x;
	}
	
	public String getPost()
	{
		return post;
	}

	public void setUsername(String x)
	{
		username = x;
	}
	
	public String getUsername()
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

	public void setId(String i)
	{
		uid = i;
	}
	
	public String getId()
	{
		return uid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	
	
}
