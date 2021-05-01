package kodlamaIO;

public class Instructor extends User {
	
	 private double salary;
	 
	 public Instructor() {
		 
	 }

	public Instructor(int id, String firstName, String lastName, String nickName, String password, String email,
			double salary) {
		super(id, firstName, lastName, nickName, password, email);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
