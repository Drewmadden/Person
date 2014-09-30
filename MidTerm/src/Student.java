public class Student extends Person {
	
	public Student(String name, String email, String address, String phonenumber) {
		super(name, email, address, phonenumber);
	}
	public static final int freshman = 9;

	public static final int sophmore = 10;
	public static final int junior = 11;
	public static final int senior = 12;

	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}
		
}