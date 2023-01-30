import java.util.*;

public class system {
	static data d = new data();
	static seat s1 = new seat();
	static private int[] a11= {564655,565651,896514,356164,565521};
	static private int[] a12= {6524,8654,5865,3235,3134};
	static void log(int a5) {
		if (a5 == 1)
			d.getdata();
		else
			System.exit(0);

	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		login l = new login();
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                                         ");
		System.out.println("     Welcome to V travelling ticket      ");
		System.out.println("                                         ");
		System.out.println("        - - - - - - - - - - - -          ");

		System.out.println("1.Public Login\n2.User Login\n3.Status\n4.Exit");
		int a4;
		int a1 = a.nextInt();
		if (a1 == 1) {
			System.out.println("Enter the login id");
			int a13 = a.nextInt();
			System.out.println("Enter the password");
			int a14 = a.nextInt();
			for (int i = 0; i < a11.length; i++) {
				if(a11[i]==a13 && a12[i]==a14)
					ticket.main(null);
				else {
					System.out.println("Invalid Enter !");
					System.exit(0);
				}
			}
			
		} else if (a1 == 2) {
			System.out.println("Enter the login id");
			int a2 = a.nextInt();
			System.out.println("Enter the password");
			int a3 = a.nextInt();
			a4 = l.check(a2, a3);
			log(a4);
			ticket.re();
		} else if (a1 == 3) {
			System.out.println("Enter the Mobile no");
			long a5 = a.nextLong();
			System.out.println("Enter the tiket no.");
			int a9 = a.nextInt();
			d.status(a5, a9);
			ticket.re();

		} else
			System.exit(0);

	}

}
