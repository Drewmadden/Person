
import java.util.Date;
public class Employee extends Person{
	private String office;
	private String salary;
	private Date Hired = new java.util.Date();
	
	public Employee(String name, String email, String address,
			String phonenumber) {
		super(name, email, address, phonenumber);
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getHired() {
		return Hired;
	}


	public void setHired(Date Hired) {
		this.Hired = Hired;
	}

	@Override
	public String toString() {
		
		return this.getClass().getName() + getName();
	}
	
}