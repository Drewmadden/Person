public class Person {
	
	private String name;
	private String email;
	private String address;
	private String phonenumber;


	public Person(String name, String email, String address, String phonenumber){
		this.name = name;
		this.email = email;
		this.address = address;
		this.phonenumber = phonenumber;    }
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public void setemail(String email) {
		this.email = email;
	}
	public String getemail() {
		return email;
	}
	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getphonenumber() {
		return phonenumber;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + name;
	}

}