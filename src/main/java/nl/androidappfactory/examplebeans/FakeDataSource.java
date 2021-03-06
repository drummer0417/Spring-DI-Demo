package nl.androidappfactory.examplebeans;

public class FakeDataSource {

	String username;
	String password;
	String url;

	public FakeDataSource() {}

	public FakeDataSource(String username, String password, String url) {
		this.username = username;
		this.password = password;
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "FakeDataSource [username=" + username + ", password=" + password + ", url=" + url + "]";
	}

}
