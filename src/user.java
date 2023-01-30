import java.util.Scanner;

public class user {
	Scanner a = new Scanner(System.in);
	static String name, email, gender, dob;
	static long mob;

	int setdata() {
		System.out.println("Enter the name");
		name = a.next();
		System.out.println("Enter the Date Of Birth");
		dob = a.next();
		System.out.println("Enter the Mobile no.");
		mob = a.nextLong();
		System.out.println("Enter the Email id");
		email = a.next(); 
		System.out.println("Enter the Gender");
		gender = a.next();
		return 1;
	}
	void getdat() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(dob);
		System.out.println(mob);
	}
}
