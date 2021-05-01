package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		
		
		Instructor engin=new Instructor();
		engin.setFirstName("engin");
		
		Student sevim=new Student();
		sevim.setFirstName("sevim");
		
		User[] users={sevim,engin};
		
		
		
		UserManager user=new UserManager();
		user.add(sevim);
		user.add(engin);
		user.addMultiple(users);
		
		

	}

}
