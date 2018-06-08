package domain;

public class Person {
	private String id;
	private String username;
	private String password;
	private String birth;
	private String education;
	private String location;
	private String email;
	private String address;
	private String tel;
	private String tip;
	public Person(String id, String username, String password, String birth, String education, String location,
			String email, String address, String tel, String tip) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.education = education;
		this.location = location;
		this.email = email;
		this.address = address;
		this.tel = tel;
		this.tip = tip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Person() {
		super();
	}
	
	
	
	

}
