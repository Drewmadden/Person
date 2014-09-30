public class Staff extends Employee {
	private String title;

	public Staff(String name, String email, String address, String phonenumber) {
		super(name, email, address, phonenumber);
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {		
		return this.getClass().getName() + getName();
	}
}