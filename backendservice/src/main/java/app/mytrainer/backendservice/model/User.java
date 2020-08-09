package app.mytrainer.backendservice.model;

public class User {

	private long userId;
	private String username;
	private String firstname;
	private String surname;
	private String email;
	private String phoneNumber; 
	private int age;
	
	//Empty constructor
	public User() {}
	
	public enum Role {
		GYMUSER,
		PERSONAL_TRAINER,
		CLIENT
	}
	
	public User(String username, String firstname, String surname, String email, String phoneNumber, int age) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long id) {
		this.userId = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", firstname=" + firstname + ", surname=" + surname
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}
	
}
