package  xpu.vo;
public class UserinfoVO {
	private String username;//�û���
	private String password;//����
	public UserinfoVO()
	{
		this.username="";
		this.password="";	
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}