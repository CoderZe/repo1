public class User{
	private int id;
	private String username;
	private String password;
	
	public User(){
		System.out.println("无参构造函数...");
	}
	
	public User(int id,String username,String password){
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
}