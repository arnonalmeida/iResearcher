package iResearcher;

public class User 
{
	//Atributos de um usuário
	private String login;
	private String password;
	private String username;
	
	public String toString()
	{
		return username;
	}
	
	public User(String login, String password, String username)
	{
		this.login = login;
		this.password = password;
		this.username = username;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
