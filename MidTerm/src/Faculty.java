public class Faculty extends Employee{
	
	private String officeHours;
	private String rank;

	public Faculty(String name, String email, String address, String phonenumber) {
		super(name, email, address, phonenumber);
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours; }
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}

}
